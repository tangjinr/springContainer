package com.tangz.springcontainer;

public class StraightHeader implements Header {

    private String color;
    private int size;

    public StraightHeader(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Do work with straight header");
    }

    @Override
    public String getInfo() {
        return "StraightHeader: color=" + color + ", size=" + size;
    }
}
