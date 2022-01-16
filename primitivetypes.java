package com.training;

public class primitivetypes {
	
		  public static void main(String[] args) {
		    String str1 = "23";
		    String str2 = "4566";
		    int num1 = Integer.parseInt(str1);
		    int num2 = Integer.parseInt(str2);
		    System.out.println(num1);    // 23
		    System.out.println(num2);    // 4566
		    String str3 = "true";
		    String str4 = "false";
		    boolean b1 = Boolean.parseBoolean(str3);
		    boolean b2 = Boolean.parseBoolean(str4);
		    System.out.println(b1);    // true
		    System.out.println(b2);    // false
		    String str5 = "456600";
		    String str6 = "994990";
		    long p1 = Long.parseLong(str5);
		    long p2 = Long.parseLong(str6);
		    System.out.println(p1);  
		    System.out.println(p2);  
		    String str = "2033.12244";
		    double str7 = Double.parseDouble(str);
		    System.out.println(str7);
		    String strAmount="100.20";
		    float f=Float.parseFloat(strAmount);
		    System.out.println(strAmount);
		  }
		}


	  
	