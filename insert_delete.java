import java.util.*;

public class insert_delete
{
	public static void main(String[] args) {
		char choice;
		Scanner sc = new Scanner(System.in);
		int n,j,i;
		System.out.print("Enter the number of elements in 1d array : ");
		n=sc.nextInt();
		int a[] = new int[n+1];
		System.out.println("Enter the elements in the array : ");
		for(j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}

		System.out.print("\nDo you like to insert(i) a new element or delete(d) an existing element? (i/d) : ");
		choice = sc.next().charAt(0);

		if (choice=='i')
		{
			int ele,pos;
			System.out.print("Enter the element to be inserted : ");
			ele = sc.nextInt();
			System.out.print("Enter the position where the element should be inserted : ");
			pos =  sc.nextInt();
			
			for(i=n;i>=pos;i--)
			{
				a[i]=a[i-1];//shift the elements to right
			}
			a[pos-1]=ele;
			n=n+1;//increment the count of numbers

			System.out.print("Array after modification : ");
			for (int k=0;k<n;k++)
			{
				System.out.print(a[k] + " ");
			}
		}
		else if (choice=='d') 
		{
				int pos;
				System.out.print("Enter the position of the element to be deleted : ");
				pos=sc.nextInt();
				for(i=pos-1;i<n-1;i++)
				    {
				        a[i]=a[i+1];//shift the elements to left
				    }
    			n=n-1;//decrement the count of no of elements
    			System.out.print("Array after modification : ");
			for (int k=0;k<n;k++)
			{
				System.out.print(a[k] + " ");
			}

		}
		else
		{
			System.out.println("Enter a proper choice !");
		}
	}
}