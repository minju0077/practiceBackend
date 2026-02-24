package org.example.practicebackend.board;

import org.example.practicebackend.board.model.BoardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/board")
@RestController
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody BoardDto.RegisterReq dto){
        boardService.register(dto);
        return ResponseEntity.ok("성공");
    }
}
