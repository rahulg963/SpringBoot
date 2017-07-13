package com.rahul.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by rahul on 13/7/17.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponseDTO {
    private int id;
    private String email;
    private String name;
    private UserRoleDTO role;
}
