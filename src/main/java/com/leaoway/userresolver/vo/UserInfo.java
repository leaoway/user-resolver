package com.leaoway.userresolver.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserInfo {

    private Long id;

    private String userName;

    private String sex;

    private Integer age;

}
