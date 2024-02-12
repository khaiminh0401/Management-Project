package com.dkm.qlda.common.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @MongoId
    private String _id;
    private int id;
    private String type_id;
    private String code;
    private String title;
    private String start_date;
    private String end_date;
    private int schedule_time;
    private int actual_time;
    private String create_user;
    private String create_date;
    private String update_user;
    private String update_date;
    private boolean status;
}
