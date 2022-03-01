
import java.util.Scanner;
public class App3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen= ");
        int n = scanner.nextInt();

        int check = isprime(n);
     
        if( check == 1 ) System.out.println(n+ " la so nguyen to" ) ;
        else System.out.println(n+ " khong phai la so nguyen to" ) ;
    }
    private static int isprime(int n){
        //flag = 0 => không phải số nguyên tố
        //flag = 1 => số nguyên tố
        
        int flag = 1;

        if (n <2) return flag = 0; /*Số nhỏ hơn 2 không phải số nguyên tố => trả về 0*/
        
        for(int i = 2; i<n;i++){
            if(n%i==0){
                flag = 0;
                break;
            }
        }

        return flag;
    }

}