package com.pockocmoc.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.pockocmoc.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: "
                + "ловим/обрабатываем исключения при попытке получить"
                + " книгу/журнал");
        System.out.println("-".repeat(20));

    }
}
