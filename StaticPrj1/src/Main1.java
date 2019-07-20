import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * utility methods are best used as static
 *
 * both the method and fields are static
 * avoid object creation
 */
class MyDateUtil {

    static final String TARGET_DATE_PATTERN = "mm/dd/yyyy";

    /**
     *
     * @param d date to format
     * @return formatted date given pattern
     */
    public static String getFormattedDate(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat(TARGET_DATE_PATTERN);

        return sdf.format(d);
    }

}

public class Main1 {
    public static void main(String[] args) {
        MyDateUtil util = new MyDateUtil();

        Date now = new Date();
        System.out.println(now);

        String formattedDate = util.getFormattedDate(now);
        System.out.println(formattedDate);

    }
}
