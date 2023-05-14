/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author marat
 */
@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBoolLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBoolLoggingAdvice: "
                + "в библиотеку пытаются вернуть книгу");
        
        Object targetMethodResult = null;
        
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch(Exception e) {
            System.out.println("aroundReturnBoolLoggingAdvice: было "
                    + "поймано исключение " + e);
            throw e;
        }

        
        System.out.println("aroundReturnBoolLoggingAdvice: "
                + "в библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
