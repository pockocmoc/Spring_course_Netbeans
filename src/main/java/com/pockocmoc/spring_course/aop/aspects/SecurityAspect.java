/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author marat
 */
@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("com.pockocmoc.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на "
                + "получение книг/журнала");
        System.out.println("-".repeat(20));

    }
}
