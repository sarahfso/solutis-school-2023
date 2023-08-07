import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SomarDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite a data no formato dia/mês/ano:");
        String dataStr = input.next();

        System.out.println("Digite a quantidade de dias a serem somados:");
        int quantidadeDias = input.nextInt();

        try {
            Date data = dateFormat.parse(dataStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);
            calendar.add(Calendar.DAY_OF_MONTH, quantidadeDias);

            Date novaData = calendar.getTime();
            String dataSomadaStr = dateFormat.format(novaData);

            System.out.println("A data somada é: " + dataSomadaStr);
        } catch (ParseException e) {
            System.out.println("Data inválida! Certifique-se de usar o formato dia/mês/ano.");
        }

        input.close();
    }
}
