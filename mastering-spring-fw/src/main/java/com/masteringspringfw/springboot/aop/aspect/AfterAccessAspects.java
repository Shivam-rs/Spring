package com.masteringspringfw.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAccessAspects {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * @AfterReturning(value =
	 * "execution(* com.masteringspringfw.springboot.aop.bussiness.*.*(..))",
	 * returning = "result") public void afterReturning(JoinPoint joinPoint, Object
	 * result) {
	 *
	 * logger.info("{} returned with value - {}", joinPoint, result); }
	 *
	 * @AfterThrowing(value =
	 * "execution(* com.masteringspringfw.springboot.aop.bussiness.*.*(..))",
	 * throwing = "exception") public void afterException(JoinPoint joinPoint,
	 * Object exception) {
	 *
	 * logger.info("{} returned with value - {}", joinPoint, exception); }
	 */

	@After(value = "execution(* com.masteringspringfw.springboot.aop.bussiness.*.*(..))")
	public void after(JoinPoint joinPoint) {

		logger.info("After execution of {}", joinPoint);
	}
}
