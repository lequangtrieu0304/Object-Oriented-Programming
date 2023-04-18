package student;

public class Student extends Person{
    private float diemToan = 0f;
    private float diemLy = 0f;
    private float diemHoa = 0f;
    private double dtb;

    public Student(
            Integer id, String name, String address, float diemToan, float diemLy, float diemHoa
    ) {
        super(id, name, address);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.dtb = Math.round((double) (this.diemToan + this.diemLy + this.diemHoa) / 3 * 100.0) / 100.0;
    }
    public Student() {
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
        this.dtb = Math.round((double) (this.diemToan + this.diemLy + this.diemHoa) / 3 * 100.0) / 100.0;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
        this.dtb = Math.round((double) (this.diemToan + this.diemLy + this.diemHoa) / 3 * 100.0) / 100.0;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
        this.dtb = Math.round((double) (this.diemToan + this.diemLy + this.diemHoa) / 3 * 100.0) / 100.0;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    @Override
    public void showInfo() {
        System.out.println("MaSV: " + getId() +
                ", Ten :" + getName() +
                ", Dia chi: " + getAddress() +
                ", Diem Toan: " + this.diemToan +
                ", Diem Ly: " + this.diemLy +
                ", Diem Hoa: " + this.diemHoa +
                ", Diem Trung Binh: " + this.dtb);
    }
}
