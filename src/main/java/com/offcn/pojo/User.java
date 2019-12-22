package com.offcn.pojo;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
//    @Column(name = "user_id")
    private  Integer id;
    @Column(name = "name",length = 20,nullable = false)
    private String name;
    @Column(name = "age",length = 4,nullable = true)
    private Integer age;
    @Column(name = "sex",length = 2,nullable = true)
    private String sex;
}
