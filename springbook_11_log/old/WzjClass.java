package com.wzj.controller.old;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WzjClass {
    private Class caazz;
    public static  Logger log;

    public WzjClass(){
        caazz=this.getClass();
        log=LoggerFactory.getLogger(caazz);
    }

}
