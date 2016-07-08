package ch.inftec.ju.fx.util;

import org.junit.Assert;
import org.junit.Test;

import ch.inftec.ju.util.fx.JuFxUtils;

public class JuFxUtilsTest {
	/**
	 * Main method to test from command line without FX on classpath.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		new JuFxUtilsTest().canLoad_fxRuntime_dynamically();
	}
	
	@Test
	public void canLoad_fxRuntime_dynamically() throws Exception {
		JuFxUtils.initializeFxClasspath();
		
		Class<?> pair = Class.forName("javafx.util.Pair");
		Assert.assertNotNull(pair);
	}
}
