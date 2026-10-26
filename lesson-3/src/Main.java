import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HinhTron ht1 = new HinhTron(1, 1, 3.5);
        HinhTron ht2 = new HinhTron();

        System.out.println(ht1);
        System.out.println(ht2);

        System.out.println("Dien tich hinh tron 1: " + ht1.DT());
        System.out.println("Dien tich hinh tron 2: " + ht2.DT());

        //Hãy cho biết hình nào có diện tích lớn hơn
        if (ht1.DT() > ht2.DT()) {
            System.out.println("Hinh tron 1 co dien tich lon hon hinh tron 2");
        } else if (ht1.DT() < ht2.DT()) {
            System.out.println("Hinh tron 2 co dien tich lon hon hinh tron 1");
        } else {
            System.out.println("Hai hinh tron co dien tich bang nhau");
        }

        //Nhập vào 1 giá trị d, tịnh tiến hình tròn theo giá trị d

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri d: ");
        double d = scanner.nextDouble();
        ht1.tinhTien(d);
        ht2.tinhTien(d);
        System.out.println("Hinh tron 1 sau khi tinh tien: " + ht1);
        System.out.println("Hinh tron 2 sau khi tinh tien: " + ht2);
    }
}
