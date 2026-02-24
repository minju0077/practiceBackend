package org.example.practicebackend.board;

import org.example.practicebackend.board.model.Board;
import org.example.practicebackend.board.model.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void register(BoardDto.Req dto){
        Board board = dto.toEntity();
        boardRepository.save(board);
    }

    public List<BoardDto.Res> list() {
        List<Board> boardList = boardRepository.findAll();
        return boardList.stream().map(BoardDto.Res::from).toList();
    }
}
