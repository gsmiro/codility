package br.com.gsmiro.study;

public class Test {
	public static void main(String[] args) {
		int b = -3;
		for(int a:new int[]{5,-5,3,-3,10,-10})
			System.out.printf("%d %d %d %d \n",a,b,a/b,a%b);
	}
	
}
