package com.tangz.springcontainer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class ScrewDriver {

    //    @Autowired
//    private Header header;
    @Resource
    private Header header;

//    public ScrewDriver(Header header) {
//        this.header = header;
//    }

//    public void setHeader(Header header) {
//        this.header = header;
//    }

    public void use() {
        System.out.println("Use header" + header.getInfo());
        header.doWork();
    }

    @PostConstruct
    public void init() {
        System.out.println("Init screwdriver");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup screwdriver");
    }
}
