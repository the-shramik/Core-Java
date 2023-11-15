enum Mobile{
    CALL,SNAP,CALCULATE;

    Mobile(){
        System.out.println("0-args enum constructor!");
    }
}

public class ConstInEnum{
    public static void main(String[] args){

        Mobile[] m=Mobile.values();
        for(Mobile mm:m){
            System.out.println(mm);
        }
    }
}