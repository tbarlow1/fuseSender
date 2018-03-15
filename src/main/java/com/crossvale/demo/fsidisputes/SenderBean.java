package com.crossvale.demo.fsidisputes;

import org.apache.camel.Body;

public class SenderBean {
	
	public String changeBody(@Body String content) {
		return "This is what I'm trying to send" + content;
	}

}
