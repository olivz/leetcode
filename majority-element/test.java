import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		Solution so = new Solution();
		System.out.println(so.majorityElement(a));
	}
}
