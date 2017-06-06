package ru.kpfu.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Andrey on 06.06.2017.
 */
@Aspect
public class MyAspect {
    @Pointcut("execution(* ru.kpfu.controller.*.*(..))")
    private void selectAll(){}

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(/*ProceedingJoinPoint thisJoinPoint*/){
        System.out.println("Before controller" /*+ thisJoinPoint.getTarget()*/);
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("After controller");
    }
}
