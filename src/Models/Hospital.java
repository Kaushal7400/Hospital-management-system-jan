package Models;

import database.DoctorDataBase;
import database.PatientDatabase;
import database.RoomDatabase;

public class Hospital {
   private String name;
    private String address;
    private long phoneNumber;
    private String email;
    private PatientDatabase patientDatabase;
    private DoctorDataBase doctorDataBase;
    private RoomDatabase roomDatabase;

    public Hospital(String name, String asd, int i, String xyz) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.patientDatabase = new PatientDatabase();
        this.doctorDataBase = new DoctorDataBase();
        this.roomDatabase = new RoomDatabase();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void admitPatient(String name,int age,long phoneNumber,String email,String gender,String disease) {
//        Patient will provid datails
//        now it is work of hospital to assign doctor to patient
//        Hospital will assign rooms to patient
//        hospital will create Id for patient
//        when we will get all details we will create patient object
//        and we will be using our database to save that patient object

//        1.Generate id for patient
        int totalPatientCount = patientDatabase.getTotalPatientCount() +1;
        String pId = "PID" + totalPatientCount;

//        2. Get the doctor who is handling min number of patient
        Doctor doctor = doctorDataBase.getMinmumPatientDoctor();


//        3. get the empty room
        Room room = roomDatabase.getEmptyRoom();
        room.setOccupied(true);
        Patient p = new Patient(pId,name,age,phoneNumber,email,gender,disease,doctor,room,true);
        doctor.patientList.add(p);
        System.out.println("Patient got admitted successfully -> "+p);
    }
    public void createRoom(){
        String roomId  = "ROOMID" + (roomDatabase.getTotalRooms()+1);
        Room room = new Room(roomId,false,null,null);
        roomDatabase.addRoomToDB(room);
        System.out.println("Room added successfully -> " + room);
    }
    public void appointDoctor(String docDegree,String name,long phoneNumber,String speciality,int salary,String timeSlot){
        String docId = "DOCID" +(doctorDataBase.getTotalDoctors()+1);
        Doctor doc = new Doctor(docId,docDegree,name,phoneNumber,speciality,salary,timeSlot);
        doctorDataBase.adddoctorToDB(doc);
        System.out.println("Doctor created successfully -> "+ doc);
    }
}
