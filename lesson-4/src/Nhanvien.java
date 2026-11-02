import java.util.Scanner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;
    private static final double LCB = 1.5;

    public Nhanvien() {
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() {
        return snct;
    }

    public double tinhTienLuong() {
        return LCB * hsl + 0.2 * snct;
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("So nam cong tac: ");
        snct = Integer.parseInt(scanner.nextLine());
        System.out.print("He so luong: ");
        hsl = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | So nam cong tac: %d | He so luong: %.2f | Tien luong: %.2f trieu%n",
                snct, hsl, tinhTienLuong());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Nhanvien> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap nhan vien thu " + (i + 1) + ":");
            Nhanvien nhanVien = new Nhanvien();
            nhanVien.nhap(scanner);
            danhSach.add(nhanVien);
        }

        if (!danhSach.isEmpty()) {
            Nhanvien thamNienNhat = danhSach.stream()
                    .max(Comparator.comparingInt(Nhanvien::getSnct))
                    .orElseThrow(IllegalStateException::new);
            System.out.println("\nNhan vien co so nam cong tac nhieu nhat:");
            thamNienNhat.xuat();
        }

        danhSach.sort(Comparator.comparingDouble(Nhanvien::tinhTienLuong).reversed());
        System.out.println("\nDanh sach nhan vien theo thu tu luong tu cao den thap:");
        for (Nhanvien nhanVien : danhSach) {
            nhanVien.xuat();
        }
    }
}
