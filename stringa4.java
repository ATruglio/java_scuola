import java.util.*;
public class stringa4
{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Inserire una stringa:\t");
		String s= in.nextLine();
		int cont=0;
		int conta=0;
		int conte=0;
		int conti=0;
		int conto=0;
		int contu=0;
		int i=0;
		while (i!=-1){
			i=s.indexOf(' ',i+1);
			if(i!=-1) cont++;
			
		}
		i=0;
		i=s.indexOf('a',i);
		if(i!=-1) conta++;
		while (i!=-1){
			
			i=s.indexOf('a',i+1);
			if(i!=-1) conta++;
			
		}
		i=0;
		i=s.indexOf('e',i);
		if(i!=-1) conte++;
		while (i!=-1){
			
			i=s.indexOf('e',i+1);
			if(i!=-1) conte++;
			
		}
		i=0;
		i=s.indexOf('i',i);
		if(i!=-1) conti++;
		while (i!=-1){
			
			i=s.indexOf('i',i+1);
			if(i!=-1) conti++;
			
		}
		i=0;
		i=s.indexOf('o',i);
		if(i!=-1) conto++;
		while (i!=-1){
			
			i=s.indexOf('o',i+1);
			if(i!=-1) conto++;
			
		}
		i=0;
		i=s.indexOf('u',i);
		if(i!=-1) contu++;
		while (i!=-1){
			
			i=s.indexOf('u',i+1);
			if(i!=-1) contu++;
			
		}
		System.out.println(cont);	
		System.out.println(conta);
		System.out.println(conte);
		System.out.println(conti);
		System.out.println(conto);
		System.out.println(contu);
	}
}
		