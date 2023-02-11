import java.util.*;
class  RobinKarp
{
    public static void main( String[] args )
 {
   String text , pat;
   try (Scanner sc = new Scanner(System.in)) {
       text = sc.nextLine();
       pat = sc.nextLine();
}
   int I , J , loc = -1 , count = 0;
   long sum = 0 ,schar = 0;
   for( I = 0; I < pat.length() ; I++ )
   {
       schar = schar + (long) (pat.charAt(I) * Math.pow(127,pat.length()-1-I) );
   }
   for( I = 0; I <= text.length() - pat.length(); I++ )
   {
       sum = 0; J = I;
       for( count = 0; count < pat.length(); count++ )
        {   
            sum = sum + (long)( text.charAt(J) * Math.pow(127,pat.length()-1-count) );
            J++;
        }
        if( sum == schar)
        loc = I;
    }
    if(loc != -1)
    System.out.println( "Found pattern at index " + loc );
    else{
    System.out.println( "Pattern not Found" );}
}
}