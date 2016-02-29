package br.com.gsmiro.codility.lesson3;

public class FrogJmp {
	 public int solution(int X, int Y, int D) {
		 int dist = Y-X;
		 int jmp = dist / D;
		 if(dist % D != 0)
			 jmp++;
		 return jmp;
    }
	 
	 public static void main(String[] args) {
		FrogJmp o = new FrogJmp();
		int x,y,d;
		x=10;y=85;d=30;
		System.out.printf("%d %d %d %s\n",x,y,d,o.solution(x,	y, d) == 3);
		x=1;y=3;d=3;
		System.out.printf("%d %d %d %s\n",x,y,d,o.solution(x,	y, d) == 1);
		x=0;y=1_000_000_000;d=2;
		System.out.printf("%d %d %d %s\n",x,y,d,o.solution(x,	y, d) == 500_000_000);
		
	}
}
