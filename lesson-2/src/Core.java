
import java.util.Scanner;

public class Core {

    // 1. Nhập mảng và tính tổng
    static void bai1(Scanner sc) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Tong = " + sum);
    }

    // 2. Cộng 2 mảng
    static void bai2(Scanner sc) {
        System.out.print("Nhap so phan tu mang a: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap so phan tu mang b: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int k = Math.max(n, m);
        int[] c = new int[k];

        for (int i = 0; i < k; i++) {
            int x = (i < n) ? a[i] : 0;
            int y = (i < m) ? b[i] : 0;
            c[i] = x + y;
        }

        System.out.print("Mang tong: ");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }


    static void bai3(Scanner sc) {
        sc.nextLine();

        System.out.print("Nhap cac so cach nhau boi dau cach: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("So phan tu: 0; Tong: 0");
            return;
        }

        String[] parts = s.split("\\s+");
        int sum = 0;

        for (int i = 0; i < parts.length; i++) {
            sum += Integer.parseInt(parts[i]);
        }

        System.out.println("So phan tu: " + parts.length
                + "; Tong: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap mang va tinh tong");
            System.out.println("2. Cong hai mang");
            System.out.println("3. Nhap mang bang mot chuoi");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    bai1(sc);
                    break;
                case 2:
                    bai2(sc);
                    break;
                case 3:
                    bai3(sc);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
