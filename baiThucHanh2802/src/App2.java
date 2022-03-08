import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class App2 {
    public static void main(String[] args) throws Exception {
        float canh1,canh2,canh3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh thu nhat: ");
        canh1 = sc.nextFloat();
        System.out.println("Nhap do dai canh thu hai: ");
        canh2 = sc.nextFloat();
        System.out.println("Nhap do dai canh thu ba: ");
        canh3 = sc.nextFloat();
        if (canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh3 <= canh1) {
            System.out.println("Day khong phai do dai cua mot tam giac, hay kiem tra lai!");
        
        }
        else if (canh1*canh1 == canh2*canh2 + canh3 *canh3||canh2*canh2 == canh1*canh1 + canh3 *canh3||canh3*canh3 == canh2*canh2 + canh1 *canh1){
            System.out.println("Day la tam giac vuong");
        }
        else if (canh1 == canh2 && canh1 == canh3){
            System.out.println("Day la tam giac deu");
        }
        else if (canh1 == canh2 ||canh1 == canh3 || canh2 == canh3){
            System.out.println("Day la tam giac can");
        }
        else{
            System.out.println("Day la tam giac thuong");
        }
    }
}
