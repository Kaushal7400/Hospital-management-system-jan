import Models.Hospital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Hospital h = new Hospital("asd","asd",123,"xyz");
        h.appointDoctor("mbbs","Kaushal",123,"heartSurgeon",10000,"12:30");
        h.createRoom();
        h.admitPatient("Deepak",23, 123L,"233","M","kuch nhi");


    }
}