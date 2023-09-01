package io.datajek.springaop.movierecommenderaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * This is powerful 
 * Logging / Analytics / recovery 
 * 
 * Careful of not doing it
 * 
 * ***/
@Aspect
@Configuration
public class AccessCheckAspect {

	
	 private Logger logger = LoggerFactory.getLogger(this.getClass());

//	 @Before("io.datajek.springaop.movierecommenderaop.aspects.JoinPointConfig.movieBeanPointcut()")
	 @Before("execution(* io.datajek.springaop.movierecommenderaop.services.*.*(..))")
	    public void userAccess(JoinPoint joinPoint) {
	        logger.info("Intercepted method call: {}", joinPoint );
	    }
	    
}
