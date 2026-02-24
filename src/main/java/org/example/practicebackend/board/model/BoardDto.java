package org.example.practicebackend.board.model;

import lombok.Builder;
import lombok.Getter;

public class BoardDto {

    @Builder
    public static class RegisterReq{
        private String title;
        private String content;

        public Board toEntity(){
            return Board.builder()
                    .title(this.title)
                    .content(this.content)
                    .build();
        }
    }

    @Getter
    @Builder
    public static class RegisterRes{
        private Long idx;
        private String title;
        private String content;
    }
}
