package com.iranna.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
 public void checkout() {
	 System.out.println("Checkout method from ShoppingCart called");
 }
}
