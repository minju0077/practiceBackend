package org.example.practicebackend.board;

import org.example.practicebackend.board.model.BoardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/board")
@RestController
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody BoardDto.Req dto){
        boardService.register(dto);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        List<BoardDto.Res> boardlist =  boardService.list();
        return ResponseEntity.ok(boardlist);
    }
}
