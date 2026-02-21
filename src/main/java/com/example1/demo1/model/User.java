package com.example1.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Database
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private int id;

    private String name;

}
