package bankmanagement.people;
//Stores common information about any person in the bank.
public class Person {
    private String name,address,phoneNo ;
    private int age;
    public Person(){
        this.name = "Unknown";
        this.age = 0;
        this.phoneNo = "Not Available";
        this.address = "Not Available";
    }
    public Person(String name,String address, String phoneNo,int age){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age =age;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getPhoneNumber(){
        return phoneNo;
    }
    public void setPhoneNumber(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void displayDetails(){
        System.out.println("member's name: "+ getName());
        System.out.println("member's age: "+ getAge());
        System.out.println("member's phone no: "+ getPhoneNumber());
        System.out.println("member's address: "+ getAddress());
    }
}
