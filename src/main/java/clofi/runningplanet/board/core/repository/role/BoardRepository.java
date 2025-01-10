package clofi.runningplanet.board.core.repository.role;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.crew.domain.Crew;

public interface BoardRepository{
	List<Board> findAllByCrew(Crew crew);

	Board save(Board board);

	void deleteById(Long id);

	Board findById(Long id);
}
