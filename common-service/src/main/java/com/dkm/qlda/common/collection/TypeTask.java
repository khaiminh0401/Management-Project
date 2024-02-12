package com.dkm.qlda.common.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "type_task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTask {
    private int id;
    private String name;
}
