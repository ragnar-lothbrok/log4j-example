package com.testlog4j;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		obj.runMe("Log4j");
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		for(int i=0;i<1000000;i++){
			logger.error("This is error : " + parameter);
			logger.fatal("This is fatal : " + parameter);
			logger.warn("This is warn : " + parameter);
		}
		
	}
	
}