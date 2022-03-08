import java.util.Scanner;
public class App81 {
    public static void main(String[] args) {
        int hang, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        hang = sc.nextInt();
        System.out.println("Nhap so cot: ");
        cot = sc.nextInt();
        int A[][] = new int[hang][cot];
        for(int i=0; i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.println("Nhap phan tu hang "+i+" cot "+j+": ");
                A[i][j]= sc.nextInt();          
            }
        }
        int max =A[0][0];
        for(int i = 0 ; i<hang;i++){
            for(int j=0; j<cot;j++){
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon mhat trong ma tran la: "+max);
    }
}
