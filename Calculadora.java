import java.util.Scanner;

public class Calculadora {

    static void soma(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escreva o valor ");
        double x = scn.nextInt();
        System.out.println("Escreva o valor ");
        double y = scn.nextInt();
        System.out.println(x+y);
    }
    static void subitracao(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Escreva o valor ");
        double x = scn.nextInt();
        System.out.println("Escreva o valor ");
        double y = scn.nextInt();
        System.out.println(x-y);
    }
    static void Multiplicacao(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escreva o valor ");
        double x = scn.nextInt();
        System.out.println("Escreva o valor ");
        double y = scn.nextInt();
        System.out.println(x*y);
    }
    static void Divisao(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escreva o valor ");
        double x = scn.nextInt();
        System.out.println("Escreva o valor ");
        double y = scn.nextInt();
        System.out.println(x/y);
    }
    static void areaQuadrado(){
        Scanner scn = new Scanner(System.in);
        System.out.println("insira a base ");
        double base = scn.nextInt();
        System.out.println("insira a altura ");
        double altura = scn.nextInt();
        System.out.println(base*altura);
    }
    static void bhaskara(){
        Scanner scn = new Scanner(System.in);
        System.out.println("insira A");
        double a = scn.nextInt();
        System.out.println("insira B");
        double b = scn.nextInt();
        System.out.println("insira C");
        double c = scn.nextInt();
        double delta = ((b*b)-(4*a*c));
        delta = Math.sqrt(delta);
        double raiz1 = (-b+delta)/2*a;
        double raiz2 = (-b-delta)/2*a;
        System.out.println(raiz1);
        System.out.println(raiz2);
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.println("java calculator");
            System.out.println("[1]-Soma: ");
            System.out.println("[2]-Subitracao: ");
            System.out.println("[3]-Divisao: ");
            System.out.println("[4]-Multiplicacao: ");
            System.out.println("[5]-Bhaskara:");
            System.out.println("[6]-Area quadadro:\n");
            System.out.println("Selecione uma opcao:");
            int num = scn.nextInt();
            switch (num) {
                case 1:
                    soma();
                    break;
                case 2:
                    subitracao();
                    break;
                case 3:
                    Divisao();
                    break;
                case 4:
                    Multiplicacao();
                    break;
                case 5:
                    bhaskara();
                case 6:
                    areaQuadrado();
                    break;

                default:
                    System.out.println("Número inválido");

        }


    }
}
}
