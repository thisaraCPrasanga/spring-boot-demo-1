package com.example1.demo1.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //make constructors for all arguments
@NoArgsConstructor //make plan constructor without Argument
public class UserDTO {


    private int id;
    private String name;
}

