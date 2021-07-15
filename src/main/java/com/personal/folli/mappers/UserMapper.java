package com.personal.folli.mappers;

import com.personal.folli.dtos.UserDTO;
import com.personal.folli.models.UserModel;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class UserMapper {


    public UserDTO fromEntityToDTO(UserModel user){
        final UserDTO response = new UserDTO();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        response.setId(user.getId());
        response.setLogin(user.getUsername());
        response.setDataCad(user.getCadData().format(myFormatObj));
        response.setNumCell(user.getPhoneNumber());

        return response;

    }

    public UserModel fromDTOToEntity(UserDTO user){
        final UserModel response = new UserModel();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        if (!user.getLogin().isEmpty()) response.setUsername(user.getLogin());

        if (!user.getDataCad().isEmpty()) {
            response.setCadData(LocalDateTime.parse(user.getDataCad(), myFormatObj));
        }
        if (!user.getNumCell().isEmpty()) response.setPhoneNumber(user.getNumCell());
        if (!user.getPwd().isEmpty()) response.setPassword(user.getPwd());

        return response;

    }


}
