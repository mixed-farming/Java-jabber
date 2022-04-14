import java.util.*;//it has java.util.Arrays wch is responsible for sorting
public class commandsort
{
	public static void main(String[] args) {
		String strs[] = { "this", "is", "a", "test" }; 
		Arrays.sort(strs);
		for(String s : strs) 
        System.out.print(s + " "); 
	}
}
