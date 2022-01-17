import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String hoTen = "";
        System.out.println("Nhập họ và tên: ");
        hoTen =sc.nextLine();
        System.out.println("xin chào "+hoTen);
    }
}
