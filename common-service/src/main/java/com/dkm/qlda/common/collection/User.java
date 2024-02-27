package com.dkm.qlda.common.collection;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String _id;
    private boolean is_manage;
//    private String full_name;
    private String username;
    private String password;
    private String birthday;
    private String address;
    private String role_id;
}
