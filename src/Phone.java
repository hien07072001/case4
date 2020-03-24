public class Phone {

    private String name;
    private String phoneNumber;
    private String contact;
    private String sex;
    private String address;
    private String birth;
    private String email;

    public Phone() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone(String name, String phoneNumber, String contact, String sex, String address, String birth, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contact = contact;
        this.sex = sex;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }
    public String toString(){
        return this.name + "," + this.phoneNumber + "," + this.birth+ "," + this.address + "," + this.email + "," + this.sex;
    }

}
