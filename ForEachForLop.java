public class ForEachForLop{
    public static void main(String[] args){

       int[] arr={10,20,30,40};

       //for loop
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("");

       //for each
       for(int x:arr){
         System.out.print(x+" ");
       }
    }
}