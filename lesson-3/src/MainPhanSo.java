public class MainPhanSo {
    public static void main(String[] args) {
        PhanSo[] danhSach = {
                new PhanSo(1, 2),
                new PhanSo(3, 4),
                new PhanSo(5, 2),
                new PhanSo(6, 3)
        };

        PhanSo tong = new PhanSo();
        PhanSo lonNhat = danhSach[0];
        int soPhanSoKhongNguyen = 0;

        for (PhanSo phanSo : danhSach) {
            tong = tong.cong(phanSo);
            if (phanSo.compareTo(lonNhat) > 0) {
                lonNhat = phanSo;
            }
            if (phanSo.getMauSo() != 1) {
                soPhanSoKhongNguyen++;
            }
        }

        System.out.println("Danh sach phan so:");
        for (PhanSo phanSo : danhSach) {
            System.out.println(phanSo);
        }
        System.out.println("Phan so lon nhat: " + lonNhat);
        System.out.println("Tong cac phan so: " + tong);
        System.out.println("So phan so khong phai so nguyen: " + soPhanSoKhongNguyen);
    }
}
