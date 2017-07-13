package com.rahul.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by rahul on 11/7/17.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String type;

    @NotNull
    private String value;

    @NotNull
    private int userId;

}
