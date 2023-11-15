public class ConversionEx{
    public static void main(String[] args){
         
         //String to StringBuffer
         String str1="guru";
         StringBuffer sb1=new StringBuffer(str1);
         System.out.println(sb1);


         //StringBuffer to String
         StringBuffer sb2=new StringBuffer("albu");
         String str2=sb2.toString();
         System.out.println(str2);
            
    }
}