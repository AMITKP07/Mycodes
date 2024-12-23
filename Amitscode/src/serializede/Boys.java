package serializede;

import java.io.Serializable;

 class Boys implements Serializable {

     private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;
    private String email;
    Boys(String name,int age, String address, String email) {
        this.name=name;
        this.age=age;
        this.address=address;
        this.email=email;
    }
    public Boys() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void displayName() {
        System.out.println("My name is="+this.name);
    }
}
