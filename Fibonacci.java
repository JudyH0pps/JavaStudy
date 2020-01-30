import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci{
	
	static long[] fiboval = new long[5000];
	
	public static long fibo(int n) {
		if (n == 0 || n == 1) {
			return fiboval[n] = 1;
		}
		long ans;
		ans = fibo(n-1) + fibo(n-2);
		fiboval[n] = ans;
		return ans;
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x;
		int n = sc.nextInt();
		
		
		x = fibo(n);
		System.out.println(Arrays.toString(fiboval));
		
		
		
		
		
	}
}