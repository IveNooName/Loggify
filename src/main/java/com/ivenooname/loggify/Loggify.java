package com.ivenooname.loggify;

public class Loggify {
	public static void warn(String msg) {
		System.err.println("\u001B[33m[WARN]: " + msg + "\u001B[0m");
	}

	public static void error(String msg) {
		System.err.println("\u001B[31m[ERROR]: " + msg + "\u001B[0m");
	}

	public static void info(String msg) {
		System.out.println("\u001B[34m[INFO]: " + msg + "\u001B[0m");
	}

	public static void success(String msg) {
		System.out.println("\u001B[32m[SUCCESS]: " + msg + "\u001B[0m");
	}
}