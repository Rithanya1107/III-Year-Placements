import java.util.*;

class Patient {
    String name;
    int token;

    Patient(String name, int token) {
        this.name = name;
        this.token = token;
    }
}

public class HospitalToken {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Harshini", 2));
        patients.add(new Patient("John",1));
        patients.add(new Patient("Kumaran", 3));

        // Sort patients based on token number
        patients.sort((p1, p2) -> p1.token - p2.token);

        System.out.println("Treatment Order:");
        for (Patient p : patients) {
            System.out.println("Token " + p.token + " - " + p.name);
        }

        System.out.println("\nPatient treated first: "
                + patients.get(0).name
                + " (Token " + patients.get(0).token + ")");
    }
}

