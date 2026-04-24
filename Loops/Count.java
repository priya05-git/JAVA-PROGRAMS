import java.util.Scanner;
class Count{
  public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         String s;
         int c=0,v=0;
         System.out.println("Enter a String ");
         s=in.nextLine().toLowerCase();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
               if("aeiou".indexOf(ch)!=-1)
                  v++;
               else
                  c++;
             }
         }
         System.out.println("Vowels: "+v+" Consonents: "+c);
    }
}