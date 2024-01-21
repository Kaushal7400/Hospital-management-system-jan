package database;

import Models.Doctor;
import Models.Patient;

import java.util.HashMap;
import java.util.List;

public class DoctorDataBase {
    HashMap<String, Doctor> DoctorDataBase;
   public DoctorDataBase(){
        this.DoctorDataBase = new HashMap<>();
    }

    public Doctor getMinmumPatientDoctor(){
       Doctor minDoc = null;
       int min = Integer.MAX_VALUE;
       for(String key : DoctorDataBase.keySet()) {
           Doctor doc = DoctorDataBase.get(key);
           List<Patient> patientList = doc.getPatientList();
           if(patientList.size() < min) {
               minDoc = doc;
               min = patientList.size();
           }
       }
       return minDoc;
    }

    public void adddoctorToDB(Doctor doctor) {
       String docId = doctor.getDocId();
        DoctorDataBase.put(docId,doctor);
    }
    public Doctor getDoctorID(String id) {
       return DoctorDataBase.get(id);
    }
    public int getTotalDoctors(){
       return DoctorDataBase.size();
    }
}
