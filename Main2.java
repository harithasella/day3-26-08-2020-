import java.util.*;
class UserMainCode
{
  public static boolean validatePlayer(String str)
  { 
      for(int i=1;i<str.length();i++)
      {
         if(str.charAt(i)=='a')
          {
              if(i%2!=0)
              {
                continue;
               }
               else
               {
                 System.out.println("Invalid");
                     return false;
               }
          }
          
        }
       System.out.println("Valid");
        return true;
   }
}
public class Main2
{ 
     public static void main(String args[])
     {
        UserMainCode u=new UserMainCode();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         u.validatePlayer(s);
     }
}
        
         
    
 