package com.mc.text;

public class Test8606 {

		/**
		 * ����: ��ʾ5+3+1
		 * ����: Yy
		 * ��������:2018��1��19��
		 * @param args
		 */
	public static void main(String[] args) {
			int n = 5;
			int y = function(n);
			System.out.println(y);
			}
		public static int function(int n) {
			if(n==1)
			return 1;
			int y = function(n-2) + n;
			return y;
		}
	}

