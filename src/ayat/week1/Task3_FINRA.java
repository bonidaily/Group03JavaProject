package ayat.week1;

public class Task3_FINRA {
    public static void main(String[] args) {
         finra();
    }
    public static void finra(){

        for (int i = 1; i <= 30; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FINRA");
            }
             else if(i%3==0) {
                System.out.println("FIN");}
            else if(i%5==0) {
                System.out.println("RA");}
            else {System.out.println(i);}
        }
    }
}
