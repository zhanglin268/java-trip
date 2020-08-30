package com.lin.model;

import java.io.InputStream;

/**
 * @author: 张林
 * @Date :Created in 3:15 pm 28/08/2020
 */
public class Audio {
    public String contentType;
    public InputStream inputStream;


    public Audio(String type, InputStream content) {
        this.contentType = type;
        this.inputStream = content;
    }
}
