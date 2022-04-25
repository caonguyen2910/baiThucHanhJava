package main;

import Animal.Tiger;
import Car.Taxicar;
import Employee.FulltimeEmployee;
import Employee.PasstimeEmployee;
import Student.OfflineStudent;
import Student.OnlineStudent;

public class App2504 {
    public static void main(String[] arg){
        //hoc offline
        OfflineStudent st1 = new OfflineStudent();
        st1.DiHoc();
        System.out.println("--------------");
        //hoc online
        OnlineStudent st2 = new OnlineStudent();
        st2.DiHoc();
        System.out.println("--------------");
        //nhan vien passtime
        PasstimeEmployee nv1 = new PasstimeEmployee();
        nv1.nhap();
        nv1.hienThi();
        nv1.DiChuyen();
        System.out.println("--------------");
        //nhan vien fulltime
        FulltimeEmployee nv2 = new FulltimeEmployee();
        nv2.nhap();
        nv2.hienThi();
        nv2.DiChuyen();
        System.out.println("--------------");
        //Tiger
        Animal ho1 = new Tiger();
        ho1.Eat();
        ho1.Sleep();
        ho1.Roar();
        ho1.Run();
        System.out.println("--------------");
        Taxicar car1 = new Taxicar();
        car1.Move();
        car1.Stop();
        car1.Reverse();
        car1.TurnRight();
        car1.Turnleft();
        
    }

}
