import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number, sum=0;
        System.out.println("Nhap so phan tu cua mang: ");
        number = sc.nextInt();
        if (number < 0) {
            System.out.println("So phan tu cua mang phai > 0. ");
        }
        else{
            int A[] = new int[number];
            for(int i=0;i<number;i++){
                System.out.println("Nhap phan tu thu"+i+1+": ");
                A[i] = sc.nextInt();
            }
            for(int i=0;i<number;i++){
                if (A[i]%2==0) {
                    sum += A[i];
                }
            }
        }
        System.out.println("Tong cac so chan trong mang la:" +sum);
    }
}
