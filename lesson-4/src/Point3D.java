
public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + this.z + "]";
    }

    @Override
    public double distance() {
        return Math.sqrt(
                super.distance() * super.distance()
                        + this.z * this.z
        );
    }

    public double distance(Point3D p) {
        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.getY();
        double dz = this.z - p.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Dinh nghia lai ham doi xung
    @Override
    public Point3D symmetric() {
        return new Point3D(
                -this.getX(),
                -this.getY(),
                -this.z
        );
    }

    // Tinh tien diem 3D
    public void translate(double dx, double dy, double dz) {
        super.translate(dx, dy);
        this.z += dz;
    }

}
