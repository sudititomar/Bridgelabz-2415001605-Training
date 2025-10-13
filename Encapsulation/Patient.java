abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract double calculateBill();
    public String getPatientDetails() {
        return patientId + " " + name + " " + age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double admissionFee = 2000;
    private String record = "";
    public InPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return admissionFee + 5000; }
    public void addRecord(String r) { record = r; }
    public String viewRecords() { return record; }
}

class OutPatient extends Patient implements MedicalRecord {
    private String record = "";
    public OutPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 500; }
    public void addRecord(String r) { record = r; }
    public String viewRecords() { return record; }
}
