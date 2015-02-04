
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j=0;
		for (i=1; i<1000; i++){
			if (i%3 ==0 || i%5==0)
				j=j+i;
		}
		System.out.println(j);

	}

}
