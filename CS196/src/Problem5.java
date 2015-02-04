
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lcm = 20;
		for (long i=19;i>0;i--){
			lcm *= i/gcd(lcm,i);
		}
		System.out.println(lcm);
	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		long x=a, y=b;
		while (y>0){
			long r = x%y;
			x=y;
			y=r;
		}
		return x;
	}

}
