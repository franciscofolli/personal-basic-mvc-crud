package com.personal.folli.services.impl;

import com.personal.folli.dtos.UserDTO;
import com.personal.folli.mappers.UserMapper;
import com.personal.folli.models.UserModel;
import com.personal.folli.repositories.UserRepository;
import com.personal.folli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseEntity<String> createNewUser(UserDTO userDTO) {
        final UserModel userConverted = this.userMapper.fromDTOToEntity(userDTO);
        this.userRepository.save(userConverted);
        return new ResponseEntity<String>("User created successfully", HttpStatus.OK);
    }
}
