package org.sopt.report5.dto;

import lombok.Data;

@Data
public class User {
    private int userIdx;
    private String name;
    private String part;
    private String password;
    private String profileUrl;
}
