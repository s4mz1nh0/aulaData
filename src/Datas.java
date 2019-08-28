
import java.time.*;
import java.time.LocalDate;
import java.time.format.*;
import java.util.Locale;
public class Datas {
    public static void main (String[] args){
    
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalDate atentados = LocalDate.of(2001, 9, 11);
        System.out.println(atentados);
        
        DateTimeFormatter formatador = DateTimeFormatter
                .ofLocalizedDate (FormatStyle.SHORT);
        
        String hojeFormatado = hoje.format (formatador);
        System.out.println(hojeFormatado);
        
        System.out.println("Dia da semana: "+hoje.getDayOfWeek());
        System.out.println("Dia: "+hoje.getDayOfMonth());
        System.out.println("mês: "+hoje.getMonthValue());
        System.out.println("Mês: "+hoje.getMonth().name());
        System.out.println("Ano: "+hoje.getYear());
    
        String diaDaSemana = hoje.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.getDefault());
        String mes = hoje.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Dia da semana: "+ diaDaSemana);
        System.out.println("Mês: "+mes);
        LocalDate niverSamuel = LocalDate.of(1995, Month.OCTOBER, 2);
        LocalDate niverThise = LocalDate.of(1996, 3, 29);
        
        Period periodo = Period.between(niverSamuel, niverThise);
        System.out.println("Anos: "+periodo.getYears());
        System.out.println("Meses: "+periodo.getMonths());
        System.out.println("Dias: "+periodo.getDays());
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data/Hora: "+agora);
        
        DateTimeFormatter formatador2 = DateTimeFormatter
                .ofLocalizedDateTime(
                        FormatStyle.SHORT,
                        FormatStyle.MEDIUM);
        
        String agoraFormatado2 = agora.format (formatador2);
        System.out.println(agoraFormatado2);
        
        System.out.println("Horas: ");
        System.out.println("Minutos: ");
        System.out.println("Segundos: ");
        System.out.println("Nanos: ");
    }
    
}