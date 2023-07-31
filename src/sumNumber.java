
public class sumNumber {

	public static void main(String[] args) {
		
		int startNum = 5;
		int endNum = 100;
		int sum = 0;
		
		for(int i = startNum; i <= endNum; ++i) {
			
			sum += i;
			
		}
		System.out.println("Sum of natural number from 5 to 100 : "+sum);
	}

}
