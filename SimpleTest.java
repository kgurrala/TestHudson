package com.bm.xchange.services.configuration.bs.rules;


public class SimpleTest{

	@Before
	public void setUp() throws Exception {
	    TestUtils.initializeContext();
		context =  new JUnit4Mockery();
	}

	@Test
	public void simpleTest() {
	   assert(true);
	}

 }

