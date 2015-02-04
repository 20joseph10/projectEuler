
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fibo1 = 1, fibo2 = 2, fiboall = 0;
		for (int i=1; i<4000000; i++){
			if (fibo2>=4000000)
				break;
			if (fibo2%2==0){
				fiboall+=fibo2;
			}
			int temp=fibo1;
			fibo1 = fibo2;
			fibo2=fibo2+temp;
			
		}

		System.out.println(fiboall);

	}

}
