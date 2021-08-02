package org.steps;

import com.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
	@Before
	public static void broswer() {
		browserLaunch();
	}
	@After
	public static void close() {
		pageQuit();
	}

}
