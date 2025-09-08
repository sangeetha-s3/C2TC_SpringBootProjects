package com.tnsif.springbootbasic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Product {
      private int id;
      private String name;
      public Product() {    //default constructor
  		System.out.println("Object is created for product class");
  	}
}
 