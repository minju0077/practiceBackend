package org.example.practicebackend.user;

import org.example.practicebackend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}