public class CLavg
{
	public static void main(String[] args) {
		System.out.println("There are " + args.length + " numbers on the command line.");
		Double sum=0.0,avg=0.0;
		for(int i : args)
		sum+=Double.parseDouble(args[i]);
	avg = sum/args.length;
	System.out.println("\nAverage of the the numbers = " + avg + "\n");
	}
}