package com.masteringspringfw.springboot.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionTimeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.masteringspringfw.springboot.aop.bussiness.*.*(..))")
	public void around(ProceedingJoinPoint pJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();

		pJoinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;

		logger.info("Time taken by {} is {}", pJoinPoint, timeTaken);
	}
}
