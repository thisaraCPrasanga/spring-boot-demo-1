package com.example1.demo1.controler;

import com.example1.demo1.dto.UserDTO;
import com.example1.demo1.model.User;
import com.example1.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class userController {
    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDTO> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
}
