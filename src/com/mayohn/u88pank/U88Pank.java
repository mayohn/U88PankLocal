package com.mayohn.u88pank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.filechooser.FileSystemView;

public class U88Pank {
	public static String path;

	public static void main(String[] args) throws IOException {
		System.out.println("读取数据...");
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com = fsv.getHomeDirectory(); // 这便是读取桌面路径的方法了
		path = com.getPath() + "\\u88pank";
		/* 读取数据 */
		StringBuffer buffer = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File(path + "\\1.txt")), "UTF-8"));
			String lineTxt = null;

			while ((lineTxt = br.readLine()) != null) {
				buffer.append(lineTxt);
			}
			br.close();
		} catch (Exception e) {
			System.err.println("read errors :" + e);
		}
		System.out.println("正在排序...");
		doPost(buffer.toString());
		System.out.println("完成！");
	}

	public static void doPost(String date) {

		String dd = date.replaceAll("[^\u4e00-\u9fa5a-zA-Z0-9]", "").trim();
		String source = dd.replaceAll("[\\pP\\p{Punct}\\s\n]", "");
		String[] strs = source.replaceAll("[0-9]", " ").split(" ");
		String[] mos = source.replaceAll("[\\u4e00-\\u9fa5 a-zA-Z]", " ").split(" ");

		List<String> names = SourceBean.getTrimName(strs);
		List<Integer> moneys = SourceBean.getTrimMoney(mos);

		Map<String, Integer> map = SourceBean.getMap(names, moneys);
		List<Integer> ranks = SourceBean.getRemove(moneys);

		String[][] su = new String[ranks.size()][];
		for (int i = 0; i < ranks.size(); i++) {
			int r = ranks.get(i);
			List<String> mm = new ArrayList<String>();

			for (String name : map.keySet()) {
				if (map.get(name) <= 0) {
					if (map.get(name) == -r) {
						mm.add(name);
					}
				} else {
					if (map.get(name) == r) {
						mm.add(name + ranks.get(i));
					}
				}

			}

			su[i] = (String[]) mm.toArray(new String[mm.size()]);

		}
		/* 输出数据 */
		try {
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(new File(path + "\\排行.txt")), "UTF-8"));
			StringBuffer br = new StringBuffer();
			br.append("881团");
			br.append(SourceBean.getDate());
			
			br.append("会员日结工资排名榜\r\n\r\n");
			bw.write(br.toString());
			if (su != null && su.length > 0) {
				for (int i = 0; i < su.length; i++) {

					StringBuffer st = new StringBuffer();

					for (int j = 0; j < su[i].length; j++) {

						if (j == 0) {

							st.append("第" + SourceBean.rankStrs[i] + "名：");

						}

						if ((j - 1) % 3 == 0 || j == su[i].length - 1) {
							st.append(su[i][j] + "\r\n\r\n");

						} else {
							st.append(su[i][j] + "   ");

						}

					}
					System.out.println(st.toString());
					bw.write(st.toString());
				}
			}

			bw.write(SourceBean.END);
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			System.err.println("write errors :" + e);
		}

	}
}
