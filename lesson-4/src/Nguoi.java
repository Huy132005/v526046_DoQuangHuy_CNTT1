import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void nhap(Scanner scanner) {
        System.out.print("Ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Tuoi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
    }

    public void xuat() {
        System.out.printf("Ho ten: %s | Tuoi: %d", hoTen, tuoi);
    }
}
