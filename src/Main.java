import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String apiKey = "57343c66eacc9c1f9939916c";  // API aquí
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        // 1) Call API
        ClienteHttp cliente = new ClienteHttp();
        String json = cliente.obtenerDatos(url);

        // 2) Parse JSON
        Gson gson = new Gson();
        ExchangeRateResponse rates = gson.fromJson(json, ExchangeRateResponse.class);

        // 3) Menu launch
        Conversor conversor = new Conversor();
        conversor.exhibirMenu(rates);
    }
}
