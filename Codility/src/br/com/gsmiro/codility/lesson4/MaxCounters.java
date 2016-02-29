package br.com.gsmiro.codility.lesson4;

public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] ret = new int[N];
		int lmax = 0;
		int cmax = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1)
				lmax = cmax;
			else {
				int idx = A[i] - 1;
				if (ret[idx] < lmax)
					ret[idx] = lmax;
				ret[idx]++;
				if (ret[idx] > cmax)
					cmax = ret[idx];
			}
		}
		for(int i = 0;i<ret.length;i++)
			if(ret[i]<lmax)ret[i] = lmax;
		return ret;
	}
	
	public static void main(String[] args) {
		MaxCounters o = new MaxCounters();
		for(int i:o.solution(5,new int[]{3,4,4,6,1,4,4})){
			System.out.printf("%s, ",i);
		}
	}
}
