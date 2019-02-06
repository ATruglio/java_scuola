import java.util.*;
class stringa3
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Inserisci una stringa:\t");
		String s=in.nextLine();
		System.out.println("Stringa spezzetata:\t");
		for(int i=0; i<s.length(); i+=3){
			if(i+3<s.length())
			System.out.println(s.substring(i,i+3));
			else
			System.out.println(s.substring(i,s.length()));
		}
	}
}
