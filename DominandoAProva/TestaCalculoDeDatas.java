package DominandoAProva;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestaCalculoDeDatas {
    public static void main(String[] args) {
        Instant i = Instant.now();
        Duration dezSec = Duration.ofSeconds(10);
        Instant i2 = i.plus(dezSec);
        System.out.println(i);
        System.out.println(i2);

        Instant t1 = Instant.EPOCH; //1//1970
        Instant t2 = Instant.now();
        //intervalo de t1 e t2
        long segundos = Duration.between(t1, t2).getSeconds();
        System.out.println(segundos);

        LocalDate aniversario = LocalDate.of(2001, 03, 13);
        LocalDate agora = LocalDate.now();
        //diferença em anos entre duas localDates.
        System.out.println(ChronoUnit.YEARS.between(aniversario, agora));
        //diferença em meses entre duas localDates.
        System.out.println(ChronoUnit.MONTHS.between(aniversario, agora));
        //diferença em dias entre duas localDates.
        System.out.println(ChronoUnit.DAYS.between(aniversario, agora));

        //mostra o período dividido em cada unidade
        Period tempoDeVida = Period.between(aniversario, agora);
        System.out.println(tempoDeVida.getYears());
        System.out.println(tempoDeVida.getMonths());
        System.out.println(tempoDeVida.getDays());
    }
}
