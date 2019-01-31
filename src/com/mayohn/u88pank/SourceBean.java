package com.mayohn.u88pank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SourceBean {
	public static String[] rankStrs = { "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二", "十三", "十四", "十五",
			"十六", "十七", "十八", "十九", "二十", "二十一", "二十二", "二十三", "二十四", "二十五", "二十六", "二十七", "二十八", "二十九", "三十", "三十一",
			"三十二", "三十三", "三十四", "三十五", "三十六", "三十七", "三十八", "三十九", "四十", "四十一", "四十二", "四十三", "四十四", "四十五", "四十六",
			"四十七", "四十八", "四十九", "五十", "五十一", "五十二", "五十三", "五十四", "五十五", "五十六", "五十七", "五十八", "五十九", "六十", "六十一",
			"六十二", "六十三", "六十四", "六十五", "六十六", "六十七", "六十八", "六十九", "七十", "七十一", "七十二", "七十三", "七十四", "七十五", "七十六",
			"七十七", "七十八", "七十九", "八十", "八十一", "八十二", "八十三", "八十四", "八十五", "八十六", "八十七", "八十八", "八十九", "九十", "九十一",
			"九十二", "九十三", "九十四", "九十五", "九十六", "九十七", "九十八", "九十九", "一百", "一百零一", "一百零二", "一百零三", "一百零四", "一百零五",
			"一百零六", "一百零七", "一百零八", "一百零九", "一百一十", "一百一十一", "一百一十二", "一百一十三", "一百一十四", "一百一十五", "一百一十六", "一百一十七",
			"一百一十八", "一百一十九", "一百二十", "一百二十一", "一百二十二", "一百二十三", "一百二十四", "一百二十五", "一百二十六", "一百二十七", "一百二十八", "一百二十九",
			"一百三十", "一百三十一", "一百三十二", "一百三十三", "一百三十四", "一百三十五", "一百三十六", "一百三十七", "一百三十八", "一百三十九", "一百四十", "一百四十一",
			"一百四十二", "一百四十三", "一百四十四", "一百四十五", "一百四十六", "一百四十七", "一百四十八", "一百四十九", "一百五十", "一百五十一", "一百五十二", "一百五十三",
			"一百五十四", "一百五十五", "一百五十六", "一百五十七", "一百五十八", "一百五十九", "一百六十", "一百六十一", "一百六十二", "一百六十三", "一百六十四", "一百六十五",
			"一百六十六", "一百六十七", "一百六十八", "一百六十九", "一百七十", "一百七十一", "一百七十二", "一百七十三", "一百七十四", "一百七十五", "一百七十六", "一百七十七",
			"一百七十八", "一百七十九", "一百八十", "一百八十一", "一百八十二", "一百八十三" };
	public static String END = "*以上是881团日结工资排行榜，低于300的暂时不排名！还有个别会员忘记收工资和收款格式不正确的，今天补收下！工资不到账的找客服和财务核实！核对时间次日12点以后！以上会员工资发放完毕，这是兼职日收入！大家加油了！也想上排行榜的找你的师傅，学习快速赚钱方法！收款时请写好正确格式！补发工资为次日13点到19点！财务每天发工资时间为00:00到07：00前发放完毕!";

	// 获取姓名数组
	public static List getTrimName(String[] string) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < string.length; i++) {

			if (string[i].equals("") || string == null) {

			} else {
				names.add(string[i]);
			}
		}
		return names;
	}

	public static String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		String day = sdf.format(date);
		return day;
	}

	// 获取钱数数组
	public static List getTrimMoney(String[] string) {
		List<Integer> moneys = new ArrayList<>();
		for (int i = 0; i < string.length; i++) {
			if (string[i].equals("") || string == null) {

			} else {
				moneys.add(Integer.parseInt(string[i]));
			}
		}
		return moneys;
	}

	// 合并
	public static Map<String, Integer> getMap(List<String> names, List<Integer> moneys) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.size(); i++) {
			if (moneys.get(i) >= 300) {
				// 去掉客服
				String name_kfu = names.get(i);
				if (moneys.get(i) < 400) {
					if (name_kfu.indexOf("客服") != -1) {
						// System.out.println(name_kfu);
						name_kfu = name_kfu.replace("客服", "");
					}
				}
				// 重复客服
				// if (i == 0) {
				// map.put(name_kfu, moneys.get(i));
				// } else {
				//
				// if (map.containsKey(name_kfu)) {
				// map.put(name_kfu + moneys.get(i), -moneys.get(i));
				// } else {
				// map.put(name_kfu, moneys.get(i));
				// }
				// }
				map.put(name_kfu, moneys.get(i));

			}
		}

		return map;
	}

	// 去重
	public static List getRemove(List<Integer> list) {
		List<Integer> ls = new ArrayList<>();

		HashSet h = new HashSet(list);
		ls.addAll(h);
		for (int i = 0; i < ls.size(); i++) {
			for (int j = ls.size() - 1; j > i; j--) {

				int k = ls.get(j);
				int m = ls.get(j - 1);
				if (k > m) {
					ls.set(j - 1, k);
					ls.set(j, m);
				}
			}
		}
		List<Integer> ls1 = getR300(ls);
		return ls1;
	}

	public static List getR300(List<Integer> list) {
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			// if (list.get(i) >= 300) {
			ls.add(list.get(i));
			// }

		}
		return ls;
	}

}
