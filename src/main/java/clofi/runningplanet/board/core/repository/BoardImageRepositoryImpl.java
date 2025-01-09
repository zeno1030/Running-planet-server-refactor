package clofi.runningplanet.board.core.repository;

import clofi.runningplanet.board.core.repository.role.BoardImageRepository;
import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.board.domain.BoardImage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardImageRepositoryImpl implements BoardImageRepository {
    @Override
    public List<BoardImage> findAllByBoard(Board board) {
        return List.of();
    }

    @Override
    public void deleteAllByBoard(Board board) {

    }
}
