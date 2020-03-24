import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        PhoneManager phoneManager = new PhoneManager(phoneList);
        int choice=0;
        menu();
        while (true) {

            String name;
            String phoneNumber;

            switch (choice) {
                case 1:
                    phoneManager.displayListPhone(phoneList);
                    break;
                case 2:
                    phoneManager.addPhone(phoneList);
                    break;
                case 3:
                    break;
            }
        }

    }
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1.Xem danh sach");
        System.out.println("2.Thêm danh sách ");
        System.out.println("3.Cập nhật danh sách ");
        System.out.println("4.Tìm kiếm danh sách ");
        System.out.println("4.Xoá danh sách ");
        System.out.println("0.Exit");
        System.out.println("Mời bạn chọn 1 mục ");
    }
}
