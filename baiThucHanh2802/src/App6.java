import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so = ");
        n = sc.nextInt();

        int  check;
        for (int i=1; i < n;i++){

            check = perfectNumber(i);
        
            if( check == 1 ) System.out.print (i +" ");
            
        }
    }
    private static int perfectNumber(int n){
        int flag =0;//flag = 1 la so hoan thien, flag = 0 ko phai la so hoan thien
        int sum =0;
        for(int i = 1; i < n; i++){
            if (n%i==0) {
                sum +=i;
            }
        }
        if(n == sum ){
            flag=1;
        }
        return flag;
    }
   
}