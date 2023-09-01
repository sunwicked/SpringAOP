package io.datajek.springaop.movierecommenderaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ExecutionTimeAspectCustomAnnotation {

	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 
	 @Around("io.datajek.springaop.movierecommenderaop.aspects.JoinPointConfig.measureTimeAnnotation()")
	 // Notice  use of  ProceedingJoinPoint instead of JoinPoint
	public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    //note start time
	    long startTime = System.currentTimeMillis();
	    
	    //allow method call to execute
	    Object returnValue = joinPoint.proceed();
	    
	    //time taken = end time - start time
	    long timeTaken = System.currentTimeMillis() - startTime;
	    
	    logger.info("CustomAnnotation ::: Time taken by {} to complete execution is: {}", joinPoint, timeTaken);
	    return returnValue;
	}
}