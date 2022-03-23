package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        System.out.println(SvetoveStrany.fromString("sever"));
        for(SvetoveStrany s :SvetoveStrany.values()){
            checkSever(s);
        }
        switch (strana){
            case SEVER:System.out.println("sever");
            break ;
            default:System.out.println("neni sever");
            break;
    }
    }

     public static void checkSever(SvetoveStrany s){
         if (s.isJeSever()){
             System.out.println("sever");
         }
         else{
             System.out.println("neni sever");
         }
     }

    }

