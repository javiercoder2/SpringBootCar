package com.proyecto2.proyecto2.service;

import com.proyecto2.proyecto2.model.User;

public interface UserService {
    User getUser(Integer id);
    User save (User user);
    void delete(Integer id);
}
