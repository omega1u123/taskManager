/*package com.example.demo.controller;

import com.example.demo.Service.MyUserDetailsService;
import com.example.demo.Service.UserService;
import com.example.demo.store.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private final MyUserDetailsService userService;

  public UserController(MyUserDetailsService userService) {
      this.userService = userService;
  }

  @PostMapping("/add_user")
  public void addUser(@RequestParam("login") String login, @RequestParam("password") String password){
      userService.addUser(login, password);
  }

  @GetMapping("/get_user")
  public Iterable<UserEntity> getUser(){
      return userService.getUser();
  }

}*/
