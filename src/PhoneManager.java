import java.util.ArrayList;
import java.util.Scanner;

public class PhoneManager {
    private  ArrayList<Phone> phoneList;
    Scanner scanner=new Scanner(System.in);

    public PhoneManager (ArrayList<Phone> phoneList){
    }


    public void addPhone(ArrayList<Phone>phoneList){
        String name=scanner.nextLine();
        String phoneNumber=scanner.nextLine();
        String contact=scanner.nextLine();
        String sex=scanner.nextLine();
        String address=scanner.nextLine();
        String birth=scanner.nextLine();
        String email=scanner.nextLine();

        Phone phone=new Phone(name,phoneNumber,contact,sex,address,birth,email);
        phoneList.add(phone);
    }
    public void editPhone(ArrayList<Phone>phoneList,String phoneNumber){
        boolean had=false;

        for (int i=0;i<phoneList.size();i++){
            if (phoneList.get(i).getPhoneNumber().equals(phoneNumber)){
                had=true;
                phoneList.get(i).setName(scanner.nextLine());
                phoneList.get(i).setContact(scanner.nextLine());
                phoneList.get(i).setSex(scanner.nextLine());
                phoneList.get(i).setAddress(scanner.nextLine());
                phoneList.get(i).setBirth(scanner.nextLine());
                phoneList.get(i).setEmail(scanner.nextLine());
            }
        }
        if (!had){
            System.out.println("So dien thoai khong hop len ");
        }

    }

    public void searchPhone(String phoneNumber) {
        boolean had = false;
        for (Phone phone:phoneList){
            if (phone.getName().equals(phoneNumber)){
                System.out.println(phone.toString());
                had = true;
                break;
            }
        }
        if (!had){
            System.out.println("Không tìm thấy");
        }
    }

    public void deletedPhone(ArrayList<Phone>phoneList,String phoneNumber){
        Phone phone=null;
        for (int i=0;i<phoneList.size();i++){
            if (phoneList.get(i).getPhoneNumber().equals(phoneNumber)){
                phone =phoneList.get(i);
                break;
            }
            if (phone !=null){
                phoneList.remove(phone);
            }
        }
    }
    public void displayListPhone(ArrayList<Phone>phoneList){
        for (Phone phone:phoneList){
            System.out.println("Name:" + phone.getName() +",PhoneNumber: " + phone.getPhoneNumber()+",Contact:"+phone.getContact()+
                    ",sex:"+phone.getSex()+",address"+phone.getAddress()+",birth:"+phone.getBirth()+",email:"+phone.getEmail());
        }
    }

}
