package com.codingchallange.dgp.services;

import com.codingchallange.dgp.dto.ProfileDto;
import com.codingchallange.dgp.entities.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ProfileDto getUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return new ProfileDto()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail());
    }
}
