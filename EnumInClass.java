public class EnumInClass{
    enum Email{
        INBOX,COMPOSE,SENT;
    }

    public static void main(String[] args){

        Email[] e=Email.values();

        for(Email ee:e){
            System.out.println(ee);
        }
    }
}