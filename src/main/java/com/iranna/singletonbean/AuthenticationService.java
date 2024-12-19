package com.iranna.singletonbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
	@Autowired
	private CacheManager cacheManager;
	
	public CacheManager getCacheManager() {
		return cacheManager;
	}
}
