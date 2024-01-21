package Models;
public class Patient {
    String pId;
    String name;
    int age;
    long phoneNumber;
    boolean isAdmit;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAdmit() {
        return isAdmit;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    public Patient(String pId, String name, int age, long phoneNumber, String email, String gender, String disease, Doctor doctor, Room room, boolean isAdmit) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;

        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
        this.isAdmit = isAdmit;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", isAdmit=" + isAdmit +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                '}';
    }
}
