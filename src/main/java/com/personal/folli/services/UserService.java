package com.personal.folli.services;

import com.personal.folli.dtos.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<String> createNewUser(UserDTO userDTO);

}
