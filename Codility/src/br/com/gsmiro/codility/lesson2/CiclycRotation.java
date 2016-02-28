package br.com.gsmiro.codility.lesson2;

import java.util.Random;

public class CiclycRotation {
	public int[] solution(int[] A, int K) {
        if(A.length == 0){
        	return A;
        }
        K = K%A.length;
        if(K==0)return A;
        int[] B = new int[A.length];
        for(int i=0;i<A.length;i++){
        	B[(i + K) % A.length] = A[i];
        }
        return B;
    }

	public int[] make(int n){
		Random r = new Random();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
			a[i] = r.nextInt(1000) * (r.nextInt()%2==0?1:-1);
		return a;
	}
	
	public static void main(String[] args) {
		CiclycRotation o = new CiclycRotation();
		for(int a:o.solution(new int[]{3,8,9,7,6},3))System.out.println(a);;
		
	}
}
