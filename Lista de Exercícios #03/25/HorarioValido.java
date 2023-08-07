import java.util.Scanner;

public class HorarioValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário no formato HH:MM:SS");
        String horarioStr = sc.nextLine();

        if (validarHorario(horarioStr)) {
            System.out.println("Horário válido!");
        } else {
            System.out.println("Horário inválido!");
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
}
