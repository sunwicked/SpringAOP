package io.datajek.springaop.movierecommenderaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "execution(* io.datajek.springaop.movierecommenderaop.*.*(..))",
			 returning = "result"
			)
	public void LogAfterExecution(JoinPoint joinPoint, Object result) {
		 logger.info("Method {} returned with: {}", joinPoint, result);
	}
	
	
	@AfterThrowing(
			 value = "execution(* io.datajek.springaop.movierecommenderaop.services.*.*(..))",
			 throwing = "exception")
			public void LogAfterException(JoinPoint joinPoint, Object exception) {
			    logger.info("Method {} returned with: {}", joinPoint, exception);
			}
	
	//Since @After is a generic annotation, if the application is run,
	//this method also gets executed alongside the LogAfterExecution
	//method marked with the @AfterReturning annotation.
	@After(value = "execution(* io.datajek.springaop.movierecommenderaop.business.*.*(..))")
	public void logAfterMethod(JoinPoint joinPoint) {
		logger.info("After {}", joinPoint);
	}
}
