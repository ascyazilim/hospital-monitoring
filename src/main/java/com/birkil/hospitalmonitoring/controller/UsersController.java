package com.birkil.hospitalmonitoring.controller;

import com.birkil.hospitalmonitoring.entity.Users;
import com.birkil.hospitalmonitoring.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> usersList = usersService.getAllUsers();
        return ResponseEntity.ok(usersList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable Long id){
        Users users = usersService.getUsersById(id);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/create")
    public ResponseEntity<Users> createUsers(@RequestBody Users users){
        Users createdUsers = usersService.createUsers(users);
        return ResponseEntity.ok(createdUsers);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUsers(@PathVariable Long id, @RequestBody Users users){
        Users updatedUsers = usersService.updateUsers(id, users);
        return ResponseEntity.ok(updatedUsers);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable Long id){
        usersService.deleteUsers(id);
        return ResponseEntity.noContent().build();
    }
}
