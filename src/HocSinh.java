import javax.naming.Name;
import java.util.Date;

public class HocSinh {
    private String msv;
    private String Name;
    private int age;
    private String sex;
    private String address;
    private double dtb;

    public HocSinh() {

    }

    public HocSinh(String msv, String name, int age, String sex, String address, double dtb) {
        this.msv = msv;
        this.Name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.dtb = dtb;
    }

    public HocSinh(String msv, String name, int age, String sex, double dtb) {
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String write() {
        return msv + "," + Name + "," + age + "," + sex + "," + address + "," + dtb;

    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "msv='" + msv + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", dtb=" + dtb +
                '}';
    }
}
