import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Readerandwrite readerandwrite = new Readerandwrite();
    ArrayList<HocSinh> hocSinhs = new ArrayList<>();

    public Manager() {
      hocSinhs = readerandwrite.reader();
    }

    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("====menu===");
        System.out.println("0. thoat khỏi menu");
        System.out.println("1. thêm  ");
        System.out.println("2. Xem danh sách sinh viên ");
        System.out.println("3. xóa học sinh ");
        System.out.println("4. xắp sếp ");
        System.out.println("5. sửa  ");
        int choice1;
        while (true) {
            try {
                choice1 = Integer.parseInt(sc.nextLine());
                if (choice1 < 0 || choice1 > 5) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("mời bạn nhập lại theo đúng menu");
            }
        }
        switch (choice1) {
            case 1:
                hocSinhs.add(add());
                readerandwrite.write(hocSinhs);
                break;
            case 2:
                show();
                break;
            case 3:
                delete();
                readerandwrite.write(hocSinhs);
                break;
            case 4:
                xapsep();
                readerandwrite.write(hocSinhs);
                break;
            case 5:
                edit();
                readerandwrite.write(hocSinhs);
                break;
            case 0:
                System.exit(0);
        }
    }

    public HocSinh add() {
        String msv;
        do {
            System.out.println("nhập mã sinh viên");
            msv = sc.nextLine();
        }
        while (checkmsv(msv) == true);
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập tuổi của sinh viên ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập giới tính");
        String sex = sc.nextLine();
        System.out.println("nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("nhập điểm trung bình của sinh viên");
        double dtb = Double.parseDouble(sc.nextLine());
        return new HocSinh(msv, name, age, sex, address, dtb);
    }

    public boolean checkmsv(String msv) {
        for (int i = 0; i < hocSinhs.size(); i++) {
            if (hocSinhs.get(i).getMsv().equals(msv)) {
                return true;
            }
        }
        return false;
    }

    public void delete() {
        String msv;
        do {
            System.out.println("nhập mã sinh viên cần xóa");
            msv = sc.nextLine();
        }
        while (checkmsv(msv) == false);
        for (int i = 0; i < hocSinhs.size(); i++) {
            if (hocSinhs.get(i).getMsv().equals(msv)) {
                hocSinhs.remove(i);
            }
        }
    }

    public void edit() {
        String msv;
        do {
            System.out.println("nhập mã sinh viên cần xóa");
            msv = sc.nextLine();
        }
        while (checkmsv(msv) == false);
        for (int i = 0; i < hocSinhs.size(); i++) {
            if (hocSinhs.get(i).getMsv().equals(msv)) {
                hocSinhs.set(i, add());
            }
        }
    }

    public void xapsep() {
        System.out.println("1. xắp sếp tăng dần");
        System.out.println("2. xắp sếp giảm dần");
        int choice2;
        while (true) {
            try {
                choice2 = Integer.parseInt(sc.nextLine());
                if (choice2 < 0 || choice2 > 2) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("mời bạn nhập lại theo đúng menu");
            }
        }
        switch (choice2) {
            case 1:
                hocSinhs.sort(new Tangdan());
                break;
            case 2:
                hocSinhs.sort(new Giamdan());
                break;
        }
    }

    public void show() {
        for (HocSinh sv : hocSinhs) {
            System.out.println(sv);
        }
    }
}
