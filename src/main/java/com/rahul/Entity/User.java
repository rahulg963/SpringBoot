package com.rahul.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by rahul on 11/7/17.
 */

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String email;

    @NotNull
    private String name;

//    Lazy concept here, If it is lazy then only when getRole is called then only join query will be done.
    @ManyToOne
    @JoinColumn(name = "role_id", updatable = false, insertable = false)
    private Role role;

//    @Column(name = "role_id")
//    private int roleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
