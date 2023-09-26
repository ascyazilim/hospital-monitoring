package com.birkil.hospitalmonitoring.service;

import com.birkil.hospitalmonitoring.entity.Users;
import com.birkil.hospitalmonitoring.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    //All
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }
    //Id
    public Users getUsersById(Long id){
        return usersRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found with id: " +id));
    }
    //Create
    public Users createUsers(Users users){
        return usersRepository.save(users);
    }
    //Update
    public Users updateUsers(Long id, Users users){
        if (!usersRepository.existsById(id)){
            throw new RuntimeException("User not found with id: "+id);
        }
        users.setId(id);
        return usersRepository.save(users);
    }

    //Delete
    public void deleteUsers(Long id){
        if (!usersRepository.existsById(id)){
            throw new RuntimeException("User not found with id: "+id);
        }
        usersRepository.deleteById(id);
    }

}
