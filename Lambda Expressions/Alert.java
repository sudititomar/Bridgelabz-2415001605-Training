import java.util.*;
import java.util.function.Predicate;

class Alert {
    String msg;
    String type;

    Alert(String m, String t) {
        msg = m;
        type = t;
        public String toString () {
            return msg + " (" + type + ")";
        }
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Patient fever", "critical"),
                new Alert("Medicine due", "info"),
                new Alert("Emergency incident", "emergency")
        );
        Predicate<Alert> filter = alert -> alert.type.equals("critical") || alert.type.equals("emergency");
        alerts.stream().filter(filter).forEach(System.out::println); // Only show relevant alerts
    }
}
