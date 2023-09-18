package DominandoAProva;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class TestaDateTime3 {
    public static void main(String[] args) {
        //convertendo date da classe java util para date da classe java time
        Date d = new Date();
        Instant i = d.toInstant(); //pega os milissegundos
        System.out.println(i);
        LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
        System.out.println(ldt);

        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        System.out.println(i2);
        LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());
        System.out.println(ldt2);

        Instant i3 = ldt.toInstant(ZoneOffset.UTC);
        //pega o fuso de acordo com o gmt3 sem se importar com o lugar
        System.out.println(i3);
        Date d2 = Date.from(i3);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);
    }
}
