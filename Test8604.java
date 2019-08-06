package com.mc.text;

import java.awt.peer.SystemTrayPeer;
import java.util.*;
public class Test8604 {

	public static void main(String[] args) {
        int[] arrs = new int[300000];
		Random r = new Random();
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = r.nextInt();
		}
		int[] a = Arrays.copyOf(arrs, arrs.length);
		int[] b = Arrays.copyOf(arrs, arrs.length);
		
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("系统API所花时间:"+(end-start));
		
		
		
//		long start2 = System.currentTimeMillis();
//		chooseSort(b);
//		long end2 = System.currentTimeMillis();
//		System.out.println("选择排序所花时间:"+(end2-start2));
	}
}
