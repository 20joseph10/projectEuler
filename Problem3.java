
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600851475143L;
		long i=2L;
		while (i*i<num){
			while (num%i==0){
				num /= i;
			}
			i++;
		}
		System.out.println(num);

	}

}
