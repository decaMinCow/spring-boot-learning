package com.demo.springboot.mybaits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.springboot.mybaits.mapper.UserMapper;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userMapper.findOne(1));
		System.out.println(userMapper.findAll());
	}
}
