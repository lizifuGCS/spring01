package com.qst.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Aspect
public class TimePool {

    @Before("execution(* add(..))")
    public void RunBeforeMethod(){
        System.out.println("前置通知============="+ new Date());

    }

}
