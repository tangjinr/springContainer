package com.tangz.springcontainer;

public class ScrewDriver {

    private Header header;

//    public ScrewDriver(Header header) {
//        this.header = header;
//    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void use() {
        System.out.println("Use header" + header.getInfo());
        header.doWork();
    }

    public void init() {
        System.out.println("Init screwdriver");
    }

    public void cleanup() {
        System.out.println("Cleanup screwdriver");
    }
}
