package dto;

import enums.Gender;
import enums.Hobbies;

import java.util.List;

public class Student {
    private String name;
    private String Lastname;
    private String email;
    private Gender gender;
    private String mobil;
    private String dateOfBirth;
    private String subject;
    private List<Hobbies> hobbies;
    private String picture;
    private String address;
    private String state;
    private String city;

    public Student(String name, String lastname,
                   String email, Gender gender,
                   String mobil, String dateOfBirth,
                   String subject, List<Hobbies> hobbies,
                   String picture, String address,
                   String state, String city) {
        this.name = name;
        Lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.mobil = mobil;
        this.dateOfBirth = dateOfBirth;
        this.subject = subject;
        this.hobbies = hobbies;
        this.picture = picture;
        this.address = address;
        this.state = state;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
