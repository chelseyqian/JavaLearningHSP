package Chapter13;

import java.time.Instant;
import java.util.Date;


public class Instant1 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        // Instant转Date
        Date date = Date.from(now);

        // Date转Instant
        Instant instant = date.toInstant();
    }
}
