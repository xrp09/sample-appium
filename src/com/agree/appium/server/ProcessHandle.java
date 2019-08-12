package com.agree.appium.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessHandle {
	
	/*
	JDK 提供了下列进程API：

	ProcessBuilder
	Process
	ProcessHandle
	ProcessHandle.Info
	*/
	
	public static void exeCmd(String commandStr) {
		BufferedReader br = null;
		try {
			Process process = Runtime.getRuntime().exec(commandStr);
			br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}

			System.out.println(process.exitValue());//结束值
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
//		String commandStr = "ping www.baidu.com";
	    String commandStr = "ifconfig";
		ProcessHandle.exeCmd(commandStr);

	}

}
