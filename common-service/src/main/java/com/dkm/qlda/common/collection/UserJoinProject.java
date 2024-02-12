package com.dkm.qlda.common.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_join_project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserJoinProject {
    private int id;
    private int user_id;
    private int project_id;
}
