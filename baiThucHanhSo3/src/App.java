import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Double a,b,c,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a= sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b=sc.nextDouble();
        System.out.println("Nhap he so c: ");
        c=sc.nextDouble();
        System.out.println("phuong trinh co dang:"+a+"x^2 "+b+"x "+c+"v= 0");
        delta = b*b-4*a*c;
        if (delta<0) {
            System.out.println("Phuong trinh vo nghiem!");
        }else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1=x2="+(-b/2*a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem x1= "+((-b+ Math.sqrt(delta)/2*a))+"x2= "+((-b- Math.sqrt(delta)/2*a)));
        }

    }
}
