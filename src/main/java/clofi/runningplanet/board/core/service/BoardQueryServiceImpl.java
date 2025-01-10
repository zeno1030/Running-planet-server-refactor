package clofi.runningplanet.board.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import clofi.runningplanet.board.core.service.role.BoardQueryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import clofi.runningplanet.board.core.dto.request.CreateBoardRequest;
import clofi.runningplanet.board.core.dto.request.UpdateBoardRequest;
import clofi.runningplanet.board.core.dto.response.CreateBoardResponse;
import clofi.runningplanet.board.core.factory.BoardFactory;
import clofi.runningplanet.board.core.repository.role.BoardRepository;
import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.common.service.S3StorageManagerUseCase;
import clofi.runningplanet.crew.domain.Crew;
import clofi.runningplanet.crew.repository.CrewRepository;
import clofi.runningplanet.member.domain.Member;
import clofi.runningplanet.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class BoardQueryServiceImpl implements BoardQueryService {

	private final BoardFactory boardFactory;
	private final CrewRepository crewRepository;
	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository;
	private final S3StorageManagerUseCase storageManagerUseCase;

	@Override
	public CreateBoardResponse create(Long crewId, CreateBoardRequest createBoardRequest,
		List<MultipartFile> imageFile, Long memberId) {

		Member member = memberRepository.findById(memberId)
			.orElseThrow(() -> new IllegalArgumentException("회원이 아닙니다."));
		Crew crew = crewRepository.findById(crewId).orElseThrow(
			() -> new IllegalArgumentException("크루가 존재하지 않습니다"));

		List<String> imageUrlList = Optional.ofNullable(imageFile)
			.filter(image -> !image.isEmpty())
			.map(storageManagerUseCase::uploadImages)
			.orElseGet(ArrayList::new);

		return boardFactory.insert(crew, createBoardRequest, imageUrlList, member);
	}

	@Override
	public CreateBoardResponse update(Long crewId, Long boardId, UpdateBoardRequest updateBoardRequest,
		List<MultipartFile> imageFile, Long memberId) {
		Member member = memberRepository.findById(memberId)
			.orElseThrow(() -> new IllegalArgumentException("회원이 존재하지 않습니다."));
		Board board = boardRepository.findById(boardId);
		if (board.getMember().getId() != member.getId()) {
			throw new IllegalArgumentException("작성자가 아니여서 수정할 수 없습니다.");
		}
		boardFactory.update(board, updateBoardRequest, imageFile);
		return CreateBoardResponse.of(board);
	}

	@Override
	public void deleteBoard(Long crewId, Long boardId, Long memberId) {
		crewRepository.findById(crewId).orElseThrow(() -> new IllegalArgumentException("크루가 존재하지 않습니다."));
		Board board = boardRepository.findById(boardId);
		if (board.getMember().getId() != memberId) {
			throw new IllegalArgumentException("타인이 작성한 게시글은 삭제할 수 없습니다.");
		}

		boardFactory.delete(board);
	}
}
