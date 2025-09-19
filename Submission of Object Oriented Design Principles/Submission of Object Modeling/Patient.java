import java.util.ArrayList;

class Patient {
    String name;
    ArrayList<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }

    void showDoctors() {
        System.out.println(name + "'s doctors:");
        for (Doctor d : doctors) {
            System.out.println(d.name);
        }
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient p : patients) {
            System.out.println(p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Jones");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.addPatient(p1);
        d1.addPatient(p2);

        d2.addPatient(p1);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}
