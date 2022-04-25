package Employee;
import java.util.Scanner;

import Person.Person;

public class Employee extends Person {
    private String employId;
    public void DiChuyen() {
        System.out.println("o to");
    }

    public String Luong() { 
        return "";
    };
    public void hienThi(){
        System.out.println("ID: "+employId);
        System.out.println("Luong: "+Luong());
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tnhap ID:");
        employId = sc.nextLine();

    }
}