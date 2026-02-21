package com.example1.demo1.service;

import com.example1.demo1.dto.UserDTO;
import com.example1.demo1.model.User;
import com.example1.demo1.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
        List<User> UserList = userRepo.findAll();
        return modelMapper.map(UserList, new TypeToken<List<UserDTO>>() {
        }.getType());

        // modelmapper required => data list and data type
        // there for we use identify to datatype of UserDTO => new
        // TypeToken<UserDTO>(){}.getType() that
    }

    public UserDTO addUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        User savedUser = userRepo.save(user); // save & get generated ID
        return modelMapper.map(savedUser, UserDTO.class);
    }
}
