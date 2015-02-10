
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,largest=0;
		for (i=100; i<1000;i++){
			for (j=100; j<1000;j++){
				int result=i*j;
				if (result>largest && isPalim(result)){
					largest=result;
				}
			}
		}
		System.out.println(largest);
	}


	private static boolean isPalim(int result) {
		// TODO Auto-generated method stub
		String str1=Integer.toString(result);
		String str2= new StringBuffer(str1).reverse().toString();
		if (str2.equals(str1))
			return true;
		return false;
	}
}
