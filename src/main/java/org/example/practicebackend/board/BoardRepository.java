package org.example.practicebackend.board;

import org.example.practicebackend.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository <Board, Long>{
    @Override
    Optional<Board> findById(Long aLong);
}
