
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumOfSquares=0;
		int squareOfSums=0;
		for(int i=1;i<101;i++){
			sumOfSquares += i*i;
			squareOfSums += i;
		}
		squareOfSums=squareOfSums*squareOfSums;
		System.out.println(squareOfSums-sumOfSquares);

	}

}
