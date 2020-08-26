import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class UserMainCode
{
  public static boolean validateDate(String strdate )
  {
    SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
    try
   {
     Date date=d.parse(strdate);
     System.out.println("valid");
     return true;
   }
    catch(ParseException e)
   {  
     System.out.println("invalid ");
      return false;
   }
}
}
public class Main
{ 
     public static void main(String args[])
     {
        UserMainCode u=new UserMainCode();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
         u.validateDate(str);
     }
}
        
         
    
 