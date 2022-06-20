package com.zhouyu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 周瑜
 */
@Component
public class UserService {

	@Autowired
	private User user;

	public void test() {

		System.out.println("test");
	}


}
