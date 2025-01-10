package clofi.runningplanet.board.core.repository;

import clofi.runningplanet.board.core.repository.jpa.BoardJpaRepository;
import clofi.runningplanet.board.core.repository.role.BoardRepository;
import clofi.runningplanet.board.domain.Board;
import clofi.runningplanet.crew.domain.Crew;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    private final BoardJpaRepository boardJpaRepository;

    @Override
    public List<Board> findAllByCrew(Crew crew) {
        return List.of();
    }

    @Override
    public Board save(Board board) {
        return boardJpaRepository.save(board);
    }

    @Override
    public void deleteById(Long id) {
        boardJpaRepository.deleteById(id);
    }

    @Override
    public Board findById(Long id) {
        return boardJpaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
    }

}
