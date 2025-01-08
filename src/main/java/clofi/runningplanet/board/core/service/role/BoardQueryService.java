package clofi.runningplanet.board.core.service.role;

import clofi.runningplanet.board.core.dto.request.CreateBoardRequest;
import clofi.runningplanet.board.core.dto.request.UpdateBoardRequest;
import clofi.runningplanet.board.core.dto.response.CreateBoardResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BoardQueryService {
    CreateBoardResponse create(Long crewId, CreateBoardRequest createBoardRequest,
                               List<MultipartFile> imageFile, Long memberId);

    CreateBoardResponse update(Long crewId, Long boardId, UpdateBoardRequest updateBoardRequest,
                               List<MultipartFile> imageFile, Long memberId);

    void deleteBoard(Long crewId, Long boardId, Long memberId);
}
