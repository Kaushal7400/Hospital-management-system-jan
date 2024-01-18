package Models;
public class Patient {
   String pId;
    String name;
    int age;
    String email;
    String gender;
    String disease;
    Doctor doctor;
    Room room;

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public java.lang.String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    public Patient(String pId, String name, int age, String email, String gender, String disease, Doctor doctor, Room room) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
    }
}
