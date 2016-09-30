package com.demo.springboot.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.springboot.configuration.properties.Decamincow;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbConfigurationApplicationTests {
	
	@Autowired
	private Decamincow decamincow;

	@Test
	public void contextLoads() {
		System.out.println(decamincow.toString());
	}

}