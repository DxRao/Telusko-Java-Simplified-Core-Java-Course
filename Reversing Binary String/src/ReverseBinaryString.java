import java.util.Scanner;

public class ReverseBinaryString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();		
		
		String binaryString = Integer.toBinaryString(num);
		
		System.out.println("Binary string is: " + binaryString);
		
		String reverseBinaryString = new StringBuilder(binaryString).reverse().toString();
		
		System.out.println("Reverse Binary string is: " + reverseBinaryString);
		
		int outputNumber = Integer.parseInt(reverseBinaryString, 2); // base 2
		
		System.out.println("Output number is: " + outputNumber);		

	}

}
