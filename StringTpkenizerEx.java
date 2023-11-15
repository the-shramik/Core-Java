import java.util.StringTokenizer;

public class  StringTpkenizerEx{
    public static void main(String[] args){

          StringTokenizer st=new StringTokenizer("Hi i am fine,i want to go!");
          while(st.hasMoreElements()){
            String s= (String)st.nextElement();
            System.out.println(s);
          }

          StringTokenizer st1=new StringTokenizer("aaple,mango,bannana,pappai,cheri",",");

          while(st1.hasMoreTokens()){
             String s=st1.nextToken();

             System.out.println(s);
          }

    }
}