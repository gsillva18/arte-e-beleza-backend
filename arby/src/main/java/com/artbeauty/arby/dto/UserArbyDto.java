package com.artbeauty.arby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserArbyDto {

    private String name;
    private String cellular;
    private String password;
    private String email;
}
