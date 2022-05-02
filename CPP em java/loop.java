public class loop {
    public static void main(String[] args) {
        System.out.println("for");
        for(int i =0 ;i <10;i++){
            System.out.println(i);
        }
        //
        System.out.println("while");
        int j=0;
        while(j<10){
            System.out.println(j);
            j++;
        }
        //
        System.out.println("while true");
        int b =0;
        while(true){
            b++;
            System.out.println(b);
            if(b==10){
                break;
            }

        }
        
    }
}
