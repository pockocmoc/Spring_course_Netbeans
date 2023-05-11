/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author marat
 */
public class MyPointcuts {

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {
    }
}
