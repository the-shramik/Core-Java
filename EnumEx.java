enum Week{
    //these constatnats by default public static final
    SUN,MON,TUE,WED;
}
public class EnumEx{
     public static void main(String[] args){
        Week w1=Week.SUN;
        Week w2=Week.MON;
        Week w3=Week.TUE;
        Week w4=Week.WED;

        System.out.println(w1+" "+w2+" "+w3+" "+w4);

        Week[] w=Week.values();

        for(Week ww:w){
            System.out.println(ww+" "+ww.ordinal());
        }

    }
}