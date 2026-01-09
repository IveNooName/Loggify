package com.ivenooname.loggify;

public class Loggify {
	public static void warn(Object msg) {
		System.err.println("\u001B[33m[WARN]: " + msg + "\u001B[0m");
	}

	public static void error(Object msg) {
		System.err.println("\u001B[31m[ERROR]: " + msg + "\u001B[0m");
	}

	public static void info(Object msg) {
		System.out.println("\u001B[34m[INFO]: " + msg + "\u001B[0m");
	}

	public static void success(Object msg) {
		System.out.println("\u001B[32m[SUCCESS]: " + msg + "\u001B[0m");
	}
}