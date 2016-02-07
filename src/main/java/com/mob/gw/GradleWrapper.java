package com.mob.gw;

import java.io.File;

/**
 * @author David Truong
 */
public class GradleWrapper {
	public static void main(String[] args) {
		GradleExecutor gradleExecutor = new GradleExecutor();

		try {
			gradleExecutor.execute(args);
		}
		catch (Exception e) {
			System.err.println("Error executing gradle wrapper");
		}
	}
}
