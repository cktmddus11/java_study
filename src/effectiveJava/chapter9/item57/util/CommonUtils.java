package effectiveJava.chapter9.item57.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class CommonUtils {
    public static String getNewRid(){
        return UUID.randomUUID().toString().substring(0, 5);
    }

    public static String getRcptNo(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String now = LocalDateTime.now().format(dtf);
        return now + UUID.randomUUID().toString().substring(0, 5);
    }
}
