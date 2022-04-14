import java.util.*;
public class roots
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.print("Enter the coefficients of QE : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();


		double discriminant,root1,root2,imaginary;
		discriminant = (b * b) - (4 * a * c);


		int flag;
		if (discriminant>0)
			flag = 1;
		else if (discriminant<0) 
			flag = 2;
		else
			flag=3;
		
    /* Compute roots of quadratic equation based on the nature of discriminant */
    switch(flag)
    {
        case 1:
            /* If discriminant is positive */
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.print("Two distinct and real roots are : " + root1 + " and " + root2);
            break;

        
        case 2:
            /* If discriminant is negative */
            root1 = root2 = -b / (2 * a);
            imaginary = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("\n Two Distinct Complex Roots Exists: root1 = " + root1 + " + " + imaginary + "i and root2 = " + root2 +" - " +imaginary + "i.");
            break;

        case 3:
            /* If discriminant is zero */
            root1 = root2 = -b / (2 * a);

            System.out.print("Two equal real roots are : " + root1 + " and " + root2);

            break;
	}
}
}