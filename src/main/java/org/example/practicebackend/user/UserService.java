package org.example.practicebackend.user;

import org.example.practicebackend.user.model.User;
import org.example.practicebackend.user.model.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signup(UserDto.Req dto){
        User user = dto.toEntity();
        userRepository.save(user);
    }

    public User login(UserDto.LoginReq dto) {

        return
    }
}
