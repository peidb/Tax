package com.galaxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxTestBean)实体类
 *
 * @author makejava
 * @since 2020-05-28 13:03:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestBean implements Serializable {
    private Integer id;
    private String name;
    private String password;

}
