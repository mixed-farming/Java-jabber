import myPackages.p1.Max;
import java.util.Scanner;

public class lab4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers to get their maximum");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("The maximum of the 3 integers is " + Max.max(x, y, z));
		System.out.println("Enter 3 floating point integers to get their maximum");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.println("The maximum of the 3 floating point integers is " + Max.max(a, b, c));
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("The maximum of the array is " + Max.max(arr));
		System.out.println("Enter the dimensions of the matrix");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int matrix[][] = new int[p][q];
		System.out.println("Enter the matrix elements");
		for (int i = 0; i < p; i++)
			for (int j = 0; j < q; j++)
				matrix[i][j] = sc.nextInt();
		System.out.println("The maximum of the matrix is " + Max.max(matrix));
	}
}
