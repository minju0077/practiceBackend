package org.example.practicebackend.user.model;

import lombok.Builder;
import lombok.Getter;

public class UserDto {

    @Builder
    public static class Req{
        private String email;
        private String name;
        private String password;

        public User toEntity() {
            return User.builder()
                    .email(this.email)
                    .name((this.name))
                    .password(this.password)
                    .build();
        }
    }

    @Builder
    @Getter
    public static class Res{
        private Long idx;
        private String email;
        private String name;
        private String password;
    }

    @Builder
    public static class LoginReq{
        private String email;
        private String password;
    }
}
