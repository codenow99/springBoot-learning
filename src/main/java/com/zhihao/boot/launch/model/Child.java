package com.zhihao.boot.launch.model;

import lombok.Data;

@Data
public class Child {
    private String name;
    private Integer age;
    private Friend[] friends;
}
