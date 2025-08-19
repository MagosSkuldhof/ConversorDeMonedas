import java.util.Scanner;

public class Conversor {

    public void exhibirMenu(ExchangeRateResponse rates) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("1) Dólar (USD) → Peso Argentino (ARS)");
            System.out.println("2) Dólar (USD) → Real Brasileño (BRL)");
            System.out.println("3) Dólar (USD) → Peso Colombiano (COP)");
            System.out.println("4) Peso Argentino (ARS) → Dólar (USD)");
            System.out.println("5) Real Brasileño (BRL) → Dólar (USD)");
            System.out.println("6) Peso Colombiano (COP) → Dólar (USD)");
            System.out.println("7) Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa la cantidad: ");
                double cantidad = scanner.nextDouble();
                double resultado = 0;

                switch (opcion) {
                    case 1 -> resultado = cantidad * rates.getConversion_rates().get("ARS");
                    case 2 -> resultado = cantidad * rates.getConversion_rates().get("BRL");
                    case 3 -> resultado = cantidad * rates.getConversion_rates().get("COP");
                    case 4 -> resultado = cantidad / rates.getConversion_rates().get("ARS");
                    case 5 -> resultado = cantidad / rates.getConversion_rates().get("BRL");
                    case 6 -> resultado = cantidad / rates.getConversion_rates().get("COP");
                }

                System.out.println("Resultado: " + resultado);
            }

        } while (opcion != 7);

        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}
