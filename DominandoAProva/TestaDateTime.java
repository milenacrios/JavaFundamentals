package DominandoAProva;
import java.time.*;
import java.time.temporal.ChronoField;

public class TestaDateTime {
    public static void main(String[] args) {
        /**LocalDate = Data sem hora;
        LocalTime = hora;
        LocalDateTime = Data com hora;
        MonthDay = Dia de um mês;
        DayOfWeek = Dia de uma semana;
        YearMonth = Mês e ano;**/

        LocalDate d = LocalDate.now(); //data atual
        LocalTime t = LocalTime.now(); //hora atual
        LocalDateTime ldt = LocalDateTime.now(); //data e hora atual

        System.out.println(d);
        System.out.println(t);
        System.out.println(ldt);

        //Determinando o fuso horário
        LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
        LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println("CHICAGO: "+t1);
        System.out.println("SÃO PAULO: "+t2);

        //criar uma data e hora aleatória
        LocalTime meioDia = LocalTime.of(12, 0);
        System.out.println("meio dia:"+meioDia);

        LocalDate umNatal = LocalDate.of(2014, 12, 25);
        System.out.println("Natal: "+umNatal); //ou
        LocalDate umNatal2 = LocalDate.of(2019, Month.DECEMBER, 25);
        System.out.println("Natal2: "+umNatal2);

        //juntando data e hora:
        LocalDateTime almocoDeNatal = LocalDateTime.of(umNatal, meioDia);
        System.out.println("Almoço de Natal: "+almocoDeNatal);

        //extraindo partes de uma data
        LocalDateTime ldt2 = LocalDateTime.of(2014, 12, 25, 12, 0);
        System.out.println(ldt2.getDayOfMonth()); //que dia do mês foi
        System.out.println(ldt2.getDayOfWeek()); //dia da semana
        System.out.println(ldt2.getHour());

        System.out.println(ldt2.get(ChronoField.DAY_OF_WEEK));

        MonthDay md = MonthDay.of(1, 1);
        MonthDay md2 = MonthDay.of(2, 1);
        //verificando qual dia vem antes
        System.out.println(md2.isBefore(md));

        //objetos date time são imutáveis
        LocalDate d1 = LocalDate.of(2012, 10, 03);
        LocalDate d2 = d1.withMonth(2); //posso modificar assim, retornando um novo objeto
        System.out.println(d2);

        LocalDate d3 = LocalDate.of(2023,8,13);
        LocalDate d4 = d3.withMonth(5).withYear(2018); //convertendo vários fatores
        System.out.println(d4);

        LocalDate d5 = d4.plusDays(5); //somando 5 dias e retornando um novo objeto
        System.out.println(d5);
        LocalDate d6 = d4.minusYears(4);
        System.out.println(d6);


    }
}
