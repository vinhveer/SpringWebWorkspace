package com.vinhveer.demospring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String id;

    private String username;
    private String email;
    private String password;
    private String avatar;
}
