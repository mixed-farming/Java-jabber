import java.util.*;
public class foreach2d
{
	public static void main(String[] args) {
		int sum = 0; int nums[][] = new int[3][5];
for(int i = 0; i < 3; i++) // give nums some values 
for(int j=0; j < 5; j++) 
nums[i][j] = (i+1)*(j+1);
// Use for-each for loop to display and sum the values 
for(int x[] : nums) //Notice how x is declared 
{ for(int y : x) 
{ System.out.println("Value is: " + y);
sum += y; 
}
} System.out.println("Summation: " + sum);
	}
}
