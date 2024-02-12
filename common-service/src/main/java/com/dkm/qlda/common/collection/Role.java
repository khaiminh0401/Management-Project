package com.dkm.qlda.common.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private int id;
    private String name;
}
