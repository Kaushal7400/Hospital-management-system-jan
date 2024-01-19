package Models;

public class Room {
    String roomID;
    boolean isOccupied;
    Patient patient;
    Doctor doctor;

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Room(String roomID, boolean isOccupied, Patient patient, Doctor doctor) {
        this.roomID = roomID;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID='" + roomID + '\'' +
                ", isOccupied=" + isOccupied +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
