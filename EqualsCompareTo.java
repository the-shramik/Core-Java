public class EqualsCompareTo{
    public static void main(String[] args){

        String s1="guru";
        String s2="albu";
        String s3="guru";

        //equals()
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        
        System.out.println("guru".equals("GURU"));
        System.out.println("guru".equalsIgnoreCase("GURU"));


        String str1="albu";
        String str2="guru";
        String str3="albu";

        //compareTo()
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str1));

        System.out.println("albu".compareTo("ALBU"));
        System.out.println("albu".compareToIgnoreCase("ALBU"));
    }
}