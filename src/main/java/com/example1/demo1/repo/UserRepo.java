package com.example1.demo1.repo;

import com.example1.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User, Integer> {

  @Query(value = "SELECT * FROM User where id = ?1", nativeQuery = true)
  User getUserById(Integer userId);
}
