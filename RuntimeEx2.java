public class RuntimeEx2{
    public static void main(String[] args){
     
        Runtime r=Runtime.getRuntime();
        
        try{
           r.exec("notepad");
           r.exec("mspaint");
           r.exec("calc");
        }
        catch(Exception ie){
            ie.printStackTrace();
        }
    }
}