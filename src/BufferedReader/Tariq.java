package BufferedReader;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 

public class Tariq {

	public static void main (String [] args) throws Exception 
	{
		
		System.out.println("Enter a Number : ");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
	}
}
