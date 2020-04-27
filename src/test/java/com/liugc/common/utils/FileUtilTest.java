package com.liugc.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	
	
	@Test
	public void testGetTempDirectory() {
		//测试FileUtil工具类中getTempDirectory()方法，输出本机操作系统临时目录(4分)
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		//测试FileUtil工具类中getUserDirectory()方法，输出本机操作系统当前登录用户目录(4分)
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
