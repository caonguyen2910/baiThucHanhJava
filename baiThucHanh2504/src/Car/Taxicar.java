package Car;


public class Taxicar implements Car {
    public void Move(){
        System.out.println("Dang chay xe");
    }

    public void Stop(){
        System.out.println("ko dung lai! ");
    }

    public void TurnRight(){
        System.out.println(" dang re phai ");
    }

    public void Turnleft(){
        System.out.println("khong re trai ");
    }

    public void Reverse(){
        System.out.println("khong quay dau ");
    }
}