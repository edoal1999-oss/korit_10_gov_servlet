package com.korit.serveletstudy.login;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Userservice {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findByAll();
    }
}


