package ie.atu;

public  class Person {
    private String name;
    private String address;
    private String phoneNum;

    // Default constructor
    public Person() {
        this.name = "";
        this.address = "";
        this.phoneNum = "";
    }
    // Constructor
    public Person(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    // Setters
    public void setName(String getName) {
        this.name = name;
    }
    public void setAddress(String getAdress) {
        this.address = address;
    }
    public void setPhoneNum(String getPhoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
