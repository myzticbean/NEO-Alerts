package com.neoalerts.usermanagementservice.service;

import com.neoalerts.usermanagementservice.repository.UserRepository;
import com.neoalerts.usermanagementservice.service.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void findAUser() {
//        User user = User.builder().firstName("Myzto").lastName("Bonanza").build();
//        userRepository.save(user);
        System.out.println("Results: " + userRepository.findByFirstName("Myztic").size());

    }

}
