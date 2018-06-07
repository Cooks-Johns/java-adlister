package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.util.List;

public interface Users {

    L
    User findByUsername(String username);
    Long insert(User user);
}