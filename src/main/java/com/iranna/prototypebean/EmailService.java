package com.iranna.prototypebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	private CacheManager cacheManager;
	
	public CacheManager getCacheManager() {
		return cacheManager;
	}
}
