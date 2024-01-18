package Models;

public class Room {
    String roomID;
    boolean isOccupied;
    Patient patient;
    Doctor doctor;

    public Room(String roomID, boolean isOccupied, Patient patient, Doctor doctor) {
        this.roomID = roomID;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.doctor = doctor;
    }
}
