package br.com.gsmiro.codility.lesson3;

import java.util.Random;

public class PermMissingElem {
    public int solution(int[] A) {
    	int[] b = new int[A.length+1];
        for(int i = 0;i<A.length;i++){
        	b[A[i]-1] = A[i];
        }
        for(int i = 0;i<b.length;i++){
        	if(b[i] == 0)return i+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
    	PermMissingElem o = new PermMissingElem();
		System.out.printf("%s\n",o.solution(new int[]{2,3,1,5}));
		Random r = new Random();
		int[] a = new int[100_000];
		for(int i=1;i<100_001;i++){
			int p = r.nextInt(a.length - 1);
			while(a[p] != 0){
				p = r.nextInt(a.length - 1);
			}
			a[p] = i;
		}
		System.out.printf("%s\n",o.solution(a));
		
	}
}
