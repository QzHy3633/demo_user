package com.hr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

/**
 * @ClassName：user
 * @Description：TODO
 * @Author：HuangZhen
 * @Date 2020/11/10 17:20
 * @Versopn：1.0
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;  // 主键 编号id

    private String mobile;  // 登录名，使用电话号码作为登录名

    private String password; // 登录密码

    private String sex; // 性别

    private Date birthdate; // 出生日期

    private String address; // 详细地址

    private String email; // 邮箱

    private String state; // -1:表示删除 ，1：正常状态

    private Date create_Time; // 创建时间

    private Date update_Time; // 修改时间

}
