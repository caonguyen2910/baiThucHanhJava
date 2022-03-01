import java.util.Scanner;
public class App7 {
    public static void main(String[] args) {
        float x=1,max =0;
        while(x!=0){
            System.out.println("nhap so thuc: ");
            Scanner sc =new Scanner(System.in);
            x = sc.nextFloat();
            if(max < x){
                max = x;
            }
        }
        System.out.println("Max = "+max);
    }
}
