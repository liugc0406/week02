package com.liugc.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: charles
 * @date: 2020年4月23日 下午4:38:21
 */
public class DateUtil {
	
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		calendar.add(Calendar.MONTH, 1);
		Date dateByInitMonth = getDateByInitMonth(calendar.getTime());
		calendar.setTime(dateByInitMonth);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}

	

}
