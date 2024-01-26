package com.dkm.qlda.taskservice.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.sql.Date;

@Document(collection = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @MongoId
    private String _id;
    private int type_id;
    private String code;
    private String title;
    private String start_date;
    private String end_date;
    private int schedule_time;
    private int actual_time;
    private int create_user;
    private String create_date;
    private int update_user;
    private String update_date;
    private boolean status;
}
