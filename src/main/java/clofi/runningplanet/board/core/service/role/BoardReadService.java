package clofi.runningplanet.board.core.service.role;

import clofi.runningplanet.board.core.dto.response.BoardDetailResponse;
import clofi.runningplanet.board.core.dto.response.BoardResponse;

import java.util.List;

public interface BoardReadService {
    List<BoardResponse> getBoardList(Long crewId, Long memberId);

    BoardDetailResponse getBoardDetail(Long crewId, Long boardId, Long memberId);
}
