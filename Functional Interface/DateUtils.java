import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
interface DateUtils {
    static String format(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
System.out.println(DateUtils.format(LocalDate.now()));
