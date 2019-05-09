package com.zeti.datasource.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_type")
public class Type implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String type;
}
