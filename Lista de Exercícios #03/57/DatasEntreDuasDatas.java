import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DatasEntreDuasDatas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite a primeira data (dia/mês/ano):");
        String dataInicioStr = input.next();

        System.out.println("Digite a segunda data (dia/mês/ano):");
        String dataFimStr = input.next();

        try {
            Date dataInicio = dateFormat.parse(dataInicioStr);
            Date dataFim = dateFormat.parse(dataFimStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataInicio);
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            System.out.println("Datas entre as duas datas informadas:");
            while (!calendar.getTime().equals(dataFim)) {
                System.out.println(dateFormat.format(calendar.getTime()));
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
        } catch (ParseException e) {
            System.out.println("Data inválida! Certifique-se de usar o formato dia/mês/ano.");
        }

        input.close();
    }
}
