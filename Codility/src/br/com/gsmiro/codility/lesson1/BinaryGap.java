package br.com.gsmiro.codility.lesson1;

public class BinaryGap {
	public int solution(int N) {
		int gap = 0;
		int cnt = -1;
		int max = 32;
		while (N != 0) {
			if ((N & (~N | 1)) == 1) {
				if (cnt > 0) {
					if (cnt > gap) {
						gap = cnt;
					}
					if (gap >= max / 2)
						return gap;
					max -= cnt + 2;
				}
				cnt = 0;
			} else if (cnt > -1) {
				cnt++;
			}
			N >>>= 1;
		}
		if (cnt > gap)
			gap = cnt;
		return gap;
	};

	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(1041));
		System.out.println(bg.solution(9));
		System.out.println(bg.solution(0x80004001));
	}
}
