package com.pockocmoc.spring_course.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.pockocmoc.spring_course.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
