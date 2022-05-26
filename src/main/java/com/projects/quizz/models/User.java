package com.projects.quizz.models;

import com.projects.quizz.models.db.TableName;

public class User extends AbstractEntity{

    private Integer id;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
    private boolean isVerified;
    private String pseudo;
    private String avatar;
    private Role role;

    public User(String lastname, String firstname, String email, String password, boolean isVerified, String pseudo, String avatar, Role role) {
        super(TableName.USER);
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
        this.isVerified = isVerified;
        this.pseudo = pseudo;
        this.avatar = avatar;
        this.role = new Role(1, "user");
    }
    public User(Integer id, String lastname, String firstname, String email, String password,boolean isVerified, String pseudo, String avatar, Role role) {
        super(TableName.USER);
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
        this.isVerified = isVerified;
        this.pseudo = pseudo;
        this.avatar = avatar;
        this.role = role;
    }

}
