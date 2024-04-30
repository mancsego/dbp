package com.codingchallange.dgp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ProfileDto {

    private String firstName;
    private String lastName;
    private String email;
}
