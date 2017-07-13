package com.rahul.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by rahul on 13/7/17.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDTO {
    private int id;
    private String role;
}
