public class AssArrNo2{
    public static void main(String[] args){

        String[] sarr={"aaa","bbb","ccc","ddd","eee"};

        String[] s1=new String [3];
        String[] s2=new String [2];

        for(int i=0;i<sarr.length;i++){
           for(int j=0;j<s1.length;j++){ 
                if(i%2==0){                
                    s1[j]=sarr[i];                
                }
           }
                // for(int k=0;k<s2.length;k++){
                //     s2[k]=sarr[i];
                // }
            // }           
        }

       for(String ss1:s1){
            System.out.println(ss1);
        } 

        for(String ss1:s2){
            System.out.println(ss1);
        }
    }
}