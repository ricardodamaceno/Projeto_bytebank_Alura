
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate copa = LocalDate.of(2024, Month.JULY, 07);
		System.out.println(copa);
		
		int anos = copa.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, copa);
		System.out.println(periodo);
//		System.out.println(periodo.getDays());
//		System.out.println(periodo.getMonths());
//		System.out.println(periodo.getYears());
		
		System.out.println(hoje.plusDays(1));
		System.out.println(hoje.minusDays(1));
		
		LocalDate futuro = hoje.plusYears(3);
		System.out.println(futuro);
		
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String hojeFormatado = hoje.format(formataData);
		System.out.println(hojeFormatado);
		
		LocalDateTime tempo = LocalDateTime.now();
		System.out.println(tempo);
		
		DateTimeFormatter fomataTempo = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String tempoFormatado = tempo.format(fomataTempo);
		System.out.println(tempoFormatado);
		
		YearMonth anoMes = YearMonth.of(2022, Month.AUGUST);
		System.out.println(anoMes);
		
		LocalTime comer = LocalTime.of(12, 30);
		System.out.println(comer);
		
		LocalDate alura = LocalDate.of(2029, Month.JANUARY, 25);
		System.out.println(alura);
		
		Period aluraPeriodo = Period.between(alura, hoje);
		System.out.println(aluraPeriodo);
		
		DateTimeFormatter aluraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(alura.format(aluraFormatada));
		
		
	}

}

