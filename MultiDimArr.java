public class MultiDimArr{
    public static void main(String[] args){
        
        int[][] arr={{10,20,30},{100,200,300},{1000,2000,3000}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
} 