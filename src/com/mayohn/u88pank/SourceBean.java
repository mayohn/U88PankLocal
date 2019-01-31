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
	public static String[] rankStrs = { "һ", "��", "��", "��", "��", "��", "��", "��", "��", "ʮ", "ʮһ", "ʮ��", "ʮ��", "ʮ��", "ʮ��",
			"ʮ��", "ʮ��", "ʮ��", "ʮ��", "��ʮ", "��ʮһ", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ",
			"��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��",
			"��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ",
			"��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��",
			"��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ", "��ʮһ",
			"��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "��ʮ��", "һ��", "һ����һ", "һ�����", "һ������", "һ������", "һ������",
			"һ������", "һ������", "һ�����", "һ�����", "һ��һʮ", "һ��һʮһ", "һ��һʮ��", "һ��һʮ��", "һ��һʮ��", "һ��һʮ��", "һ��һʮ��", "һ��һʮ��",
			"һ��һʮ��", "һ��һʮ��", "һ�ٶ�ʮ", "һ�ٶ�ʮһ", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��", "һ�ٶ�ʮ��",
			"һ����ʮ", "һ����ʮһ", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ", "һ����ʮһ",
			"һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ", "һ����ʮһ", "һ����ʮ��", "һ����ʮ��",
			"һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ", "һ����ʮһ", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��",
			"һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ", "һ����ʮһ", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��", "һ����ʮ��",
			"һ����ʮ��", "һ����ʮ��", "һ�ٰ�ʮ", "һ�ٰ�ʮһ", "һ�ٰ�ʮ��", "һ�ٰ�ʮ��" };
	public static String END = "*������881���սṤ�����а񣬵���300����ʱ�����������и����Ա�����չ��ʺ��տ��ʽ����ȷ�ģ����첹���£����ʲ����˵��ҿͷ��Ͳ����ʵ���˶�ʱ�����12���Ժ����ϻ�Ա���ʷ�����ϣ����Ǽ�ְ�����룡��Ҽ����ˣ�Ҳ�������а�������ʦ����ѧϰ����׬Ǯ�������տ�ʱ��д����ȷ��ʽ����������Ϊ����13�㵽19�㣡����ÿ�췢����ʱ��Ϊ00:00��07��00ǰ�������!";

	// ��ȡ��������
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

	// ��ȡǮ������
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

	// �ϲ�
	public static Map<String, Integer> getMap(List<String> names, List<Integer> moneys) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.size(); i++) {
			if (moneys.get(i) >= 300) {
				// ȥ���ͷ�
				String name_kfu = names.get(i);
				if (moneys.get(i) < 400) {
					if (name_kfu.indexOf("�ͷ�") != -1) {
						// System.out.println(name_kfu);
						name_kfu = name_kfu.replace("�ͷ�", "");
					}
				}
				// �ظ��ͷ�
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

	// ȥ��
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
