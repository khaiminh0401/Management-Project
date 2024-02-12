package com.dkm.qlda.common.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int id;
    private String title;
    private String detail;
}
