/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private boolean sex;
    private String birthDate;
    private String phone;
    private String address;
    private String email;
    private static int COUNT = 1;
    
    //----------------------------------------
    public Employee(String firtName, String lastName, boolean sex, String birthDate, String phone, String address, String email){
        this.id = COUNT++;
        this.firstName = firtName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }


    //----------------------------------------
    public int getId() {
        return id; }
    public String getFirstName() {
        return firstName; }
    public void setFirstName(String firstName) {
        this.firstName = firstName; }
    public String getLastName() {
        return lastName; }
    public void setLastName(String lastName) {
        this.lastName = lastName; }
    public boolean getSex() {
        return sex; }
    public void setSex(boolean sex) {
        this.sex = sex; }
    public String getBirthDate() {
        return birthDate; }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate; }
    public String getPhone() {
        return phone; }
    public void setPhone(String phone) {
        this.phone = phone; }
    public String getAddress() {
        return address;  }
    public void setAddress(String address) {
        this.address = address;  }
    public String getEmail() {
        return email;  }
    public void setEmail(String email) {
        this.email = email;  }
    public static int getCOUNT() {
        return COUNT;   }
}
