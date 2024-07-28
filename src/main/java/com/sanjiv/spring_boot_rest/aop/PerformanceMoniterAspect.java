package com.sanjiv.spring_boot_rest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMoniterAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMoniterAspect.class);

    @Around("execution(* com.sanjiv.spring_boot_rest.service.JobService.getJob(..))")
    public Object moniterTime(ProceedingJoinPoint jp) throws Throwable {
        long start= System.currentTimeMillis();

        Object obj= jp.proceed();

        long end= System.currentTimeMillis();

        LOGGER.info("Time taken: "+(end-start));

        return obj;
    }
}
