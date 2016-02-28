package br.com.gsmiro.codility;

public class BaseInversion {

	public String intToBinString(int a){
		String bin = "";
    	while(a != 0){
    		bin = a % 2 + bin;
    		a /= 2;
    	}
    	return bin;
	}
	
	public int[] binStringToIntArr(String bin){
		if(bin == null)return null;
		int ret[] = new int[bin.length() - 1];
    	for(int i = 0;i<bin.length();i++){
    		ret[i] = '0' == bin.charAt(i)?0:1;
    	}    	
    	return ret;
	}
	
    public int[] negaBinary(int a){
    	int sch = 0xAAAAAAAA;
    	a = (a + sch) ^ sch;
    	return binStringToIntArr(intToBinString(a));
    }
    
  
	/**
	 * Given an array A which represents N where N is computed by
	 * sum(A[i]*base^i) and A[i] = {0,1} compute a function which, given N
	 * returns the array that represents -N. Assume base is -2, A max length
	 * equals 100.000.
	 * 
	 * @param a
	 *            the array of 0's and 1's representing N
	 * @return the array representing -N
	 */
	public int[] solution(int[] a) {
		return null;
	}

	static void print(int[] a) {
		if (a != null) {
			for (int i : a)
				System.out.print(i + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BaseInversion s = new BaseInversion();

	}

}
