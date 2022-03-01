import java.nio.channels.NetworkChannel;
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int a,b,ucln=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        a = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        b = sc.nextInt();
        for(int i=1; i<= a && i<=b; i++){
            if (a%i==0 && b%i==0) {
                ucln = i;
            }
        }
        System.out.println("UCLN cua hai so ("+a+","+b+") la : "+ucln);
    }
}
