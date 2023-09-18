package DominandoAProva;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestaDateTime2 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate(); //pegando apenas a parte da data
        LocalTime lt = ldt.toLocalTime(); //pegando apenas a hora
        LocalTime ldt2 = LocalTime.from(ld.atTime(lt));
        System.out.println(ldt2);
    }
}
