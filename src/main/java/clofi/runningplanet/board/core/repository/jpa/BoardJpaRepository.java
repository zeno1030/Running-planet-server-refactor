package clofi.runningplanet.board.core.repository.jpa;

import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.board.domain.BoardImage;
import clofi.runningplanet.crew.domain.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardJpaRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByCrew(Crew crew);
}
