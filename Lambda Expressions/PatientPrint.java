import java.util.*;

public class PatientPrintDemo {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("ID1001", "ID1002", "ID1003");
        patientIDs.forEach(System.out::println); // Prints all IDs
    }
}
