import java.util.*;
import java.lang.*;
class UserMainCode
{
  public static boolean validateCity(String str)
  { 
       int len=str.length();
       for(int i=1;i<=len;i++)
      {
         if(str.charAt(i)!='*' && str.charAt(i+1)!='*' && str.charAt(len-1)!='*' &&  str.charAt(len)!='*')
          {
                System.out.println("Valid");
                return true;
          } 
         else 
         {
              System.out.println("Invalid");
              return false;
         }
      }
     return true;
    }
}
public class Main3
{ 
     public static void main(String args[])
     {
        UserMainCode u=new UserMainCode();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         u.validateCity(s);
     }
}
        
         
    
 