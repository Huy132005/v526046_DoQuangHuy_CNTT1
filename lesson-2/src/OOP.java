
import java.util.Scanner;

abstract class Hinh {
    abstract void nhap(Scanner sc);
    abstract double tinhDienTich();

    void hienThi() {
        System.out.printf("Dien tich: %.2f%n", tinhDienTich());
    }
}


class TamGiac extends Hinh {
    double a, b, c;

    @Override
    void nhap(Scanner sc) {
        System.out.print("Nhap 3 canh a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }

    @Override
    double tinhDienTich() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


class ChuNhat extends Hinh {
    double dai, rong;

    @Override
    void nhap(Scanner sc) {
        System.out.print("Nhap chieu dai va chieu rong: ");
        dai = sc.nextDouble();
        rong = sc.nextDouble();
    }

    @Override
    double tinhDienTich() {
        return dai * rong;
    }
}


class HinhTron extends Hinh {
    double r;

    @Override
    void nhap(Scanner sc) {
        System.out.print("Nhap ban kinh: ");
        r = sc.nextDouble();
    }

    @Override
    double tinhDienTich() {
        return Math.PI * r * r;
    }
}

public class OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Muon nhap bao nhieu hinh? ");
        int n = sc.nextInt();

        Hinh[] ds = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nChon hinh thu " + (i + 1));
            System.out.println("1. Tam giac");
            System.out.println("2. Chu nhat");
            System.out.println("3. Hinh tron");
            System.out.print("Lua chon: ");

            int chon = sc.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new TamGiac();
                    break;
                case 2:
                    ds[i] = new ChuNhat();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    i--;
                    continue;
            }

            ds[i].nhap(sc);
        }

        System.out.println("\n===== KET QUA =====");
        for (int i = 0; i < n; i++) {
            System.out.print("Hinh " + (i + 1) + " - ");
            ds[i].hienThi();
        }

        sc.close();
    }
}
