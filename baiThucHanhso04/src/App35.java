import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        int number01, number02;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so thu nhat : ");
        number01 = sc.nextInt();
        System.out.println("Nhap so thu hai : ");
        number02 = sc.nextInt();
        if (number01>number02) {
            System.out.println("So lon hon la : "+number01+" , so nho hon la : "+number02);
        }
        else{
            System.out.println("So lon hon la : "+number02+" , so nho hon la : "+number01);
        }
        
        
    }
}
