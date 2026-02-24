package org.example.practicebackend.board;

import org.example.practicebackend.board.model.Board;
import org.example.practicebackend.board.model.BoardDto;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void register(BoardDto.RegisterReq dto){
        Board board = dto.toEntity();
        boardRepository.save(board);
    }
}
