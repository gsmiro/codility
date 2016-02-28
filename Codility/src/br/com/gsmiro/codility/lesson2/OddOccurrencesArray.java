package br.com.gsmiro.codility.lesson2;

import java.util.Random;

public class OddOccurrencesArray {
	 
	
	public int solution(int[] A){
		if(A.length == 1)return A[0];
		int ret = 0;
		for(int i = 0;i<A.length;i++){
			ret ^=A[i];
		}
		return ret;		
	}
	/*
	 * http://stackoverflow.com/questions/9647312/find-the-unpaired-number-in-an-array
	 */
	public int[] make(int n,int sol,Random r){
		int[] a = new int[n];
		int bound = a.length/2;
		for(int i = 0;i<bound;i++){
			a[i] = r.nextInt(1_000_000_000);
			if(i+bound < a.length)
				a[i+bound] = a[i];
		}
		a[a.length-1] = sol;
		return a;
	}
	
	public static void main(String[] args) {
		OddOccurrencesArray o = new OddOccurrencesArray();
		
		System.out.println(7 == o.solution(new int[]{9,3,9,3,9,7,9})); 
		System.out.println(1 == o.solution(new int[]{1}));
		System.out.println(3 == o.solution(new int[]{9,3,9}));
		
		Random r = new Random();
		
		int sol = r.nextInt(1_000_000_000);
		int nsol = o.solution(o.make(9, sol, r));
		System.out.printf("%d %d %s\n",sol,nsol,sol == nsol);
		sol = r.nextInt(1_000_000_000);
		nsol = o.solution(o.make(999_999, sol, r));
		System.out.printf("%d %d %s\n",sol,nsol,sol == nsol);
		sol = r.nextInt(1_000_000_000);
		nsol = o.solution(o.make(500_000_001, sol, r));
		System.out.printf("%d %d %s\n",sol,nsol,sol == nsol);
		
		
	}
}
