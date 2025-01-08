package clofi.runningplanet.board.core.repository.role;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.board.domain.BoardImage;

public interface BoardImageRepository extends JpaRepository<BoardImage, Long> {
	List<BoardImage> findAllByBoard(Board board);

	void deleteAllByBoard(Board board);
}
