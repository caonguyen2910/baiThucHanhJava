import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        int number,temporary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong: ");
        number = sc.nextInt();
        int soDaoNguoc =0;
        while(number>0){
            temporary = number%10;
            soDaoNguoc = soDaoNguoc *10 +temporary;
            number /= 10;
        }
        System.out.println("So dao nguoc cua "+number+" la: "+soDaoNguoc);
    }
}
