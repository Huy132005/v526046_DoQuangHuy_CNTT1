public class PhanSo implements Comparable<PhanSo> {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this(0, 1);
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
        rutGon();
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.mauSo = mauSo;
        rutGon();
    }

    public PhanSo cong(PhanSo other) {
        return new PhanSo(
                Math.toIntExact((long) tuSo * other.mauSo + (long) other.tuSo * mauSo),
                Math.toIntExact((long) mauSo * other.mauSo));
    }

    public PhanSo tru(PhanSo other) {
        return new PhanSo(
                Math.toIntExact((long) tuSo * other.mauSo - (long) other.tuSo * mauSo),
                Math.toIntExact((long) mauSo * other.mauSo));
    }

    public PhanSo nhan(PhanSo other) {
        return new PhanSo(Math.toIntExact((long) tuSo * other.tuSo),
                Math.toIntExact((long) mauSo * other.mauSo));
    }

    public PhanSo chia(PhanSo other) {
        if (other.tuSo == 0) {
            throw new ArithmeticException("Khong the chia cho phan so 0");
        }
        return new PhanSo(Math.toIntExact((long) tuSo * other.mauSo),
                Math.toIntExact((long) mauSo * other.tuSo));
    }

    @Override
    public int compareTo(PhanSo other) {
        return Long.compare((long) tuSo * other.mauSo,
                (long) other.tuSo * mauSo);
    }

    public void rutGon() {
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        int gcd = ucln(Math.abs(tuSo), mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }

    private int ucln(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a == 0 ? 1 : a;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
