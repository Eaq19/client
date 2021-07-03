package com.client.client.adapter.controller;

import com.client.client.domain.model.UserDTO;
import com.client.client.domain.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/user")
    private List<UserDTO> getAllUsers() {
        return iUserService.getAll();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/user/{userId}")
    private UserDTO getBooks(@PathVariable("userId") int userId) {
        return iUserService.get(userId);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/user/{userId}")
    private void deleteBook(@PathVariable("userId") int userId) {
        iUserService.delete(userId);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/user")
    private long save(@RequestBody UserDTO user) {
        long id = iUserService.create(user);
        return id;
    }

    //creating put mapping that updates the book detail
    @PutMapping("/user")
    private UserDTO update(@RequestBody UserDTO user) {
        iUserService.update(user, user.getId());
        return user;
    }

}
