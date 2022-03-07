public class PassValidator 
{

 public boolean isValid(String pass)

 {

   if(pass.length()>=5 && pass.length()<=10)

   {

     return true;

   }
   
   else

   {

     return false;

    }
 }
}