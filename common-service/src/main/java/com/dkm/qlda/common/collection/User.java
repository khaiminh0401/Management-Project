package com.dkm.qlda.common.collection;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    private int id;
    private boolean is_manage;
    private String full_name;
    private String username;
    private String password;
    private String birthday;
    private String address;
    private int role_id;
}
