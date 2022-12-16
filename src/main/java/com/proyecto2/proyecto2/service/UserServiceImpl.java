package com.proyecto2.proyecto2.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyecto2.proyecto2.model.User;
import com.proyecto2.proyecto2.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    @Override
    public User getUser(Integer id){
        Optional <User> users = userRepository.findById(id);
        //Orelse nos permite verificar si hay o no datos dentro de nuestra lista, es un verificador
        return users.orElse(null);
    }
    @Override
    public User save(User user){
        // insert into user (columnas)(values);
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        //delete from user where id = id;
        userRepository.deleteById(id);
    }

}
