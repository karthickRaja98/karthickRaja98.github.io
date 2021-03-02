package com.kmk.util;

import java.text.DateFormat;

import org.aspectj.lang.JoinPoint;
//import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(* com.kmk.address.AddressServiceImpl.createAddress())")
	public void logBeforeAdviceFlightAdd(JoinPoint joinPoint) {
		System.out.println("before log");
		logger.info("Before Advice for createAddress method, Joinpoint signature :{}", joinPoint.getSignature());
		long time = System.currentTimeMillis();
		String date = DateFormat.getDateTimeInstance().format(time);
		logger.info("Report generated at time {}", date);
		System.out.println("before log");
	}
}
