

import java.util.Scanner;
import java.util.regex.*;

public class Regex_Pattern_Validator
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
               
          while(testCases>0){
              String pattern = in.nextLine();             
              String pattern1 = "";
              try{
                    for(int i=0; i<pattern.length(); i++){
                        pattern = pattern.substring(0,i+1) + " " + pattern.substring(i+1);
                        i++;
                    }
                  //System.out.println(pattern);
                  Pattern.compile(pattern);
                  System.out.println("Valid");
              } 
              catch(PatternSyntaxException e) {
                  System.out.println("Invalid");
              }
              testCases--;
          }      
   }
}
