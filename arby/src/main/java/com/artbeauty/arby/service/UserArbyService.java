package com.artbeauty.arby.service;

import com.artbeauty.arby.dto.UserArbyDto;
import com.artbeauty.arby.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserArbyService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserArbyDto userArbyDto){

    }

    public void updateUser(UserArbyDto userArbyDto){

    }

    public void findByName(){

    }

    public void findByCellular(){

    }

    public void findByEmail() {

    }

    public void findAll(){

    }

    public void deleteUser(UserArbyDto userArbyDto){

    }

}
