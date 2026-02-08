package projetos.verificacao_de_tempo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

class RespostaTempo {

    public Current current;
}

class Current {

    public double temperature_2m;
    public String time;
}

public class vericadorTempo {

    public String api() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m"))
                .GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static void main(String[] args) {
        String jsonResposta = "{ \"current\": { \"temperature_2m\": 15.5, \"time\": \"2026-02-06T10:00\" } }";

        try {
            ObjectMapper mapper = new ObjectMapper();
            RespostaTempo dados = mapper.readValue(jsonResposta, RespostaTempo.class);
            System.out.println("Temperatura atual: " + dados.current.temperature_2m + "°C");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
