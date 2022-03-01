import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        number = sc.nextInt();
        int count =0;
        while(number>0){
            
            number /= 10;
            count ++; 
        }
        System.out.println("So vua nhap co "+count+" chu so");
    }
}
