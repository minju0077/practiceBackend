package org.example.practicebackend.board.model;

import lombok.Builder;
import lombok.Getter;

public class BoardDto {

    @Builder
    public static class Req{
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
    public static class Res{
        private Long idx;
        private String title;
        private String content;

        public static Res from(Board entity) {
            return Res.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .content(entity.getContent())
                    .build();
        }
    }
}
