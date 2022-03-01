import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        int number, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so: ");
        number = sc.nextInt();
        for (int i=1; i<number; i++){
            if(number%i==0){
                sum +=i;
            }
        }
        if(number == sum){
            System.out.println(number+" La so hoan thien");
        }
        else{
            System.out.println(number+" khong phai la so hoan thien");
        }
    }
}
