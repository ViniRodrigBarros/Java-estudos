import java.util.Scanner;

public class OperadoresLog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 21;
        System.out.println("insira x");
        x=scn.nextInt();
        if(x==10){
            System.out.println("verdade");
        }
        else if(x>20){
            System.out.println("x>20");
        }
        else{
            System.out.println("mentira");
        }

        int caso;
        System.out.println("insira o caso");
        caso = scn.nextInt();
        switch (caso) {
            case 1:
                System.out.println("caso 1");
                break;
            case 2:
            System.out.println("caso 2");

            default:
                break;
        }

    }


}
