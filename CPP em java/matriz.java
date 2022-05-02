import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz =new int[3][3];
        int x;
        
   
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                x=input.nextInt();
                matriz[i][j]=x;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.printf("\n");
        }
        

    }

    
}
