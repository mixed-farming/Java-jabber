//encode and decode a string message using bitwise XOR
public class bitwise5
{
	public static void main(String[] args) {
		String msg = "Good Morning Manu";
		String encmsg="",decmsg="";
		int key=97;//You can set any key
//encoding a message
		for(int i=0;i<msg.length();i++)
		{
			encmsg = encmsg + (char)(msg.charAt(i)^key);
		}
		System.out.println("Encoded Message : " + encmsg);
//decoding a message
		for(int i=0;i<msg.length();i++)
		{
			decmsg = decmsg + (char)(encmsg.charAt(i)^key);
		}
		System.out.println("Decoded Message : " + decmsg);
	}
} 
//NOTE: If R1= X ^ Y , then X = R1 ^ Y;


