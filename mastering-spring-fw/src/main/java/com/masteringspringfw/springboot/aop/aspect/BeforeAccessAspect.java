package com.masteringspringfw.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// We need to define what kind of method call we would like to intercept
	// execution(* packageName.*.*(..))

	@Before("execution(* com.masteringspringfw.springboot.aop.bussiness.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Check for user access");
		logger.info("Allowed execution for - {}", joinPoint);
	}
}
