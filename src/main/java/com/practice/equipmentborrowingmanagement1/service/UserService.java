package com.practice.equipmentborrowingmanagement1.service;

import com.practice.equipmentborrowingmanagement1.model.entity.User;

public interface UserService {
    boolean registerUser(User user);
    boolean login(String username, String password);
    boolean checkUsername(String username);
}
