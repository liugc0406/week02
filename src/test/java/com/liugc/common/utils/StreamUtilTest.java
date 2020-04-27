package com.liugc.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class StreamUtilTest {

	//测试StreamUtil工具类中readTextFile(输入文件文件参数)方法(4分)，并输出文件的内容(8分)。
	@Test
	public void testReadTextFileFile() {
		String path = "D:\\java\\百家姓.txt";
		String readTextFile = StreamUtil.readTextFile(new File(path));
		System.out.println(readTextFile);
	}


}
