import java.util.ArrayList;
import java.util.List;

public class MainPoint {

    public static void main(String[] args) {

        // Tao danh sach chua cac diem 2D va 3D
        List<Point2D> l_points = new ArrayList<>();

        // Tao cac diem 2D
        Point2D p_2D_1 = new Point2D(1.0, 5.0);
        Point2D p_2D_2 = new Point2D(3.0, 7.0);

        // Tao cac diem 3D
        Point3D p_3D_1 = new Point3D(1.0, 5.0, 3.5);
        Point3D p_3D_2 = new Point3D(3.0, 7.0, 2.0);

        // Dua cac diem vao danh sach
        l_points.add(p_2D_1);
        l_points.add(p_2D_2);
        l_points.add(p_3D_1);
        l_points.add(p_3D_2);

        // 1. Tinh khoang cach giua 2 diem 2D
        System.out.println("Khoang cach giua 2 diem 2D: "
                + p_2D_1.distance(p_2D_2));

        // 2. Tinh khoang cach giua 2 diem 3D
        System.out.println("Khoang cach giua 2 diem 3D: "
                + p_3D_1.distance(p_3D_2));

        // 3. Tinh tien cac diem
        p_2D_1.translate(2.0, 3.0);
        p_3D_1.translate(2.0, 3.0, 4.0);

        // 4. Tinh tong khoang cach cac diem 2D va 3D
        double sum_2D = 0.0;
        double sum_3D = 0.0;

        for (Point2D point : l_points) {

            if (point instanceof Point3D) {
                sum_3D += point.distance();
            } else {
                sum_2D += point.distance();
            }
        }

        System.out.println("Tong khoang cach cac diem 2D: " + sum_2D);
        System.out.println("Tong khoang cach cac diem 3D: " + sum_3D);

        // 5. Dua cac diem doi xung vao danh sach
        List<Point2D> l_symmetric = new ArrayList<>();

        for (Point2D point : l_points) {
            l_symmetric.add(point.symmetric());
        }

        l_points.addAll(l_symmetric);

        // 6. Hien thi danh sach cac diem
        System.out.println("\nDanh sach cac diem sau khi them diem doi xung:");

        for (Point2D point : l_points) {
            System.out.println(point.toString());
        }
    }
}
