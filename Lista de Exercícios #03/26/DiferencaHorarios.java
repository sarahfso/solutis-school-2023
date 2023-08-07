import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiferencaHorarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro horário no formato HH:MM:SS");
        String horario1Str = sc.nextLine();

        System.out.println("Digite o segundo horário no formato HH:MM:SS");
        String horario2Str = sc.nextLine();

        if(validarHorario(horario1Str) && validarHorario(horario2Str)) {
            long diferencaSegundos = calcularDiferencaEmSegundos(horario1Str, horario2Str);
            System.out.println("A diferença entre os horários é de " + diferencaSegundos + " segundos.");
        }else{
            System.out.println("É necessário fornecer horários válidos.");
        }

        sc.close();
    }

    public static boolean validarHorario(String horarioStr) {
        // Verifica se o horário possui o formato correto HH:MM:SS
        if (!horarioStr.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return false;
        }

        // Separa as partes do horário (horas, minutos e segundos)
        String[] partes = horarioStr.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);

        // Verifica se as horas, minutos e segundos estão dentro dos limites válidos
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
            return false;
        }

        return true;
    }

    public static long calcularDiferencaEmSegundos(String horario1Str, String horario2Str) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        try {
            // Parse dos horários para objetos Date
            Date horario1 = sdf.parse(horario1Str);
            Date horario2 = sdf.parse(horario2Str);

            // Calcula a diferença em milissegundos
            long diferencaMilissegundos = Math.abs(horario1.getTime() - horario2.getTime());

            // Converte a diferença para segundos
            long diferencaSegundos = diferencaMilissegundos / 1000;
            return diferencaSegundos;
        } catch (ParseException e) {
            System.out.println("Formato de horário inválido. Certifique-se de usar o formato HH:mm:ss.");
            return -1; // Valor negativo para indicar que houve erro na conversão
        }
    }
}
