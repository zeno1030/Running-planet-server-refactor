package clofi.runningplanet.board.core.repository.jpa;

import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.board.domain.BoardImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardImageJpaRepository extends JpaRepository<BoardImage, Long> {
    List<BoardImage> findAllByBoard(Board board);

    void deleteAllByBoard(Board board);
}
