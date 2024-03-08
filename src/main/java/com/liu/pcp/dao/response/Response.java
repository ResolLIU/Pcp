package com.liu.pcp.dao.response;

import lombok.Data;

@Data
public class Response {
    public Response(String text,String code) {
        this.text = text;
        this.code = code;
    }

    private String text;
    private String code;
}
