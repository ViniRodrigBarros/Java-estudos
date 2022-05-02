import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num =new int[5];
        int x;
        for(int i=0;i<5;i++){
            x=scan.nextInt();
            num[i]=x;
        }           

        //Arrays.sort(num);
        //Arrays.fill(num,10);
        //Arrays.binarySearch(num,p);
        for(int i=0;i<5;i++){
            System.out.printf("-%d-",num[i]);
        }

    }

    
}
