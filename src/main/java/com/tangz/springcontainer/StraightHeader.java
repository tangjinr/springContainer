package com.tangz.springcontainer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("header")
public class StraightHeader implements Header {

    @Value("${color}")
    private String color;
    @Value("${size}")
    private int size;

//    public StraightHeader(String color, int size) {
//        this.color = color;
//        this.size = size;
//    }
//
//    public StraightHeader(Map<String, String> paras) {
//        this.color = paras.get("color");
//        this.size = Integer.valueOf(paras.get("size"));
//    }
//
//    public StraightHeader(Properties props) {
//        this.color = String.valueOf(props.get("color"));
//        this.size = Integer.valueOf(String.valueOf(props.get("size")));
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }

    @Override
    public void doWork() {
        System.out.println("Do work with straight header");
    }

    @Override
    public String getInfo() {
        return "StraightHeader: color=" + color + ", size=" + size;
    }
}
