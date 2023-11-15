public class AssArrNo1{
    public static void main(String[] args){

        int[] arr={10,20,30,40,50,5};
        int sum=0;
        int greater=arr[0];
        int smaller=arr[0];

        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
             if(arr[i]>greater){
                greater=arr[i];
             }

             if(arr[i]<smaller){
                smaller=arr[i];
             }

        }
        System.out.println("Sum of array: "+sum);
        System.out.println("Greater element: "+greater);
        System.out.println("Smaller element: "+smaller);
    }
}