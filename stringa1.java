import java.util.*;
public class stringa1
{
  public static void main(String[] args)
  {
    int i,j;
    Scanner in = new Scanner(System.in);
    System.out.println("Inserire una stringa\t");
    String s=in.nextLine();
    System.out.println("\n Primi tre caratteri:\t"+s.substring(0,3));
    i=s.length()-3;
    j=s.length();
    System.out.println("Ultimi 3 caratteri:\t"+s.substring(i,j));
  }
}
