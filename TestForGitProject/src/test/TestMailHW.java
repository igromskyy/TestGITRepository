package test;

import java.util.Date;

public class TestMailHW {

	public static void main(String[] args) {
		System.out.println("HI GIT1");
		System.out.println(getTime());

	}
	
	public static String getTime() {
		return "Time>>>" + new Date().getTime() + "L";
	}
	
	public static String getTime1() {
		return "Time>>>" + new Date().getTime() + "L1";
	}

}
