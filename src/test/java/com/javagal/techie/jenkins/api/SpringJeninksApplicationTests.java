package com.javagal.techie.jenkins.api;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJeninksApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJeninksApplicationTests.class);
	
//	@Ignore
	@Test
	public void contextLoads() {
		logger.info("Test Application Started....");
		assertEquals(true, true);
	}

}
