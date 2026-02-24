package org.example.practicebackend.board;

import org.example.practicebackend.board.model.BoardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/board")
@RestController
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/register")
    public ResponseEntity register(@RequestBody BoardDto.RegisterReq dto){
        boardService.register(dto);
        return ResponseEntity.ok("성공");
    }
}
