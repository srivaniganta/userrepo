package com.example;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usertable")
@Setter
@Getter
public class UserTable implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNo")
    private String phoneNo;
}
