package database;

import Models.Doctor;

import java.util.HashMap;

public class DoctorDataBase {
    HashMap<String, Doctor> DoctorDataBase;
    DoctorDataBase(){
        this.DoctorDataBase = new HashMap<>();
    }
}
