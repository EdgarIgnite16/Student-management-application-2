package DTO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SinhVienDTO {
    private String ID, Fullname, Email, PhoneNumber, Address;
    private int Sex;

    public SinhVienDTO() {
    }

    public SinhVienDTO(String ID, String fullname, String email, String phoneNumber, int sex, String address) {
        this.ID = ID;
        this.Fullname = fullname;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Sex = sex;
        this.Address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    @Override
    public String toString() {
        return "SinhVienDTO{" +
                "ID='" + ID + '\'' +
                ", Fullname='" + Fullname + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", Sex=" + Sex +
                '}';
    }
}

