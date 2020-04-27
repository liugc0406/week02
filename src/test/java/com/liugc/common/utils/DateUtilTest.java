package com.liugc.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	//将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	//将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	@Test
	public void testDateUtil() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date initMonth = DateUtil.getDateByInitMonth(new Date());
		Date endMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String init = sdf.format(initMonth);
		String end = sdf.format(endMonth);
		String newsql = sql.replace("{1}", init).replace("{2}", end);
		System.out.println("新的SQL语句拼接后"+newsql);
	}
}
