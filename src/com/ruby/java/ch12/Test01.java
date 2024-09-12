package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	 public static void main(String[] args) {
		 
	        // 명령줄 인자가 2개가 아니면 안내 메시지 출력
	        if (args.length != 2) {
	           System.out.println("usage: java ArgsfTest");
	            return;
	        }
	        System.out.println(args[0]+ " "+ args[1]);
	        
	        copyFile(args[0], args[1]);
 
	    }
	   
	    
	    
	    private static void copyFile(String string, String string2) {
	    	// 파일 복사 작업
	        try (FileInputStream fi = new FileInputStream(string);
	             FileOutputStream fo = new FileOutputStream(string2)) {

	            int c;
	            // 파일의 내용을 한 바이트씩 읽고 목적 파일로 복사
	            while ((c = fi.read()) != -1) {
	                fo.write(c);
	            }
	  

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
