package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        System.out.println(SvetoveStrany.valueOf("SEVER"));
        for(SvetoveStrany s :SvetoveStrany.values()){
            checkSever(s);
        }
    }
     public static void checkSever(SvetoveStrany s){
         if (s.equals("SEVER")){
             System.out.println("sever");
         }
         else{
             System.out.println("neni sever");
         }
     }
}
