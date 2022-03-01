import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int x = 1, max =1;
        
        while(x!=0 ){
            System.out.println("Nhap so nguyen : ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            if(x%5==0 ){
                if(max<x){
                    max = x;
                }
            }
            
           
        }
        System.out.println("Max chia het cho 5 = "+max);
    }
}
