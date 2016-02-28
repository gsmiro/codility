package br.com.gsmiro.codility.lesson3;

import java.util.Random;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int sum = 0;
		for(int i = 0;i<A.length;i++)
			sum += A[i];
		
		int bsum = 0;
		int msum = Integer.MAX_VALUE;
		for(int i = 1;i<A.length;i++){
			bsum += A[i-1];
			int diff = Math.abs(2*bsum - sum);
			if(msum > diff)msum = diff;
		}
		return msum;	
	}

	
	public int[] make(int n,Random r){
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = r.nextInt(1000) *(r.nextBoolean()?1:-1);
		}
		return a;
	}
	public static void main(String[] args) {
		TapeEquilibrium o = new TapeEquilibrium();
		System.out.printf("%s\n",o.solution(new int[]{3,1,2,4,3}));
		System.out.printf("%s\n",o.solution(new int[]{1,2}));
		Random r = new Random();
		System.out.printf("%s\n",o.solution(o.make(50000, r)));
		System.out.printf("%s\n",o.solution(o.make(100_000, r)));
		
		
	}
}
