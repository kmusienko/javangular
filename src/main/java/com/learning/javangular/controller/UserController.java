package com.learning.javangular.controller;

import com.learning.javangular.entity.User;
import com.learning.javangular.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private UserService userService;

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/hello")
  public String sayHello() {
    return "Hello, world.";
  }

  @CrossOrigin
  @GetMapping(value = "/users")
  public List<User> getUsers() {
    return userService.getAllUsers();
  }
}
