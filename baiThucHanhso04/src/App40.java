import java.util.Scanner;
public class App40 {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ngay: ");
        number = sc.nextInt();

        switch (number) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
            default:
                System.out.println("Ban da nhap sai !!!");
                break;
        }
        
        
    }
}