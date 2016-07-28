package com.testlog4j;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger error_logger = Logger.getLogger("errorlogger");
	final static Logger error_metric = Logger.getLogger("metriclogger");
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		obj.runMe("Log4j");
	}
	
	private void runMe(String parameter){
		
		for(int i=0;i<1000000;i++){
			error_logger.error("This is error : " + parameter);
			error_metric.info("This is info : " + parameter);
		}
		
	}
	
}