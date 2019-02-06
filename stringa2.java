import java.util.*;
public class stringa2
{
  public static void main(String[] args)
  {
    int i,j,r,z;
    Scanner in = new Scanner(System.in);
    System.out.println("Inserire una stringa\t");
    String s=in.nextLine();
    System.out.println("\n Primi tre caratteri:\t"+s.substring(0,3));
    i=(s.length()/2)-1;
    j=(s.length()/2)+2;
    System.out.println("3 caratteri intermedi :\t"+s.substring(i,j));
    r=s.length()-3;
    z=s.length();
    System.out.println("Ultimi 3 caratteri:\t"+s.substring(r,z));
  }
}
