import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpRequest;

public class HttpRequestExample {
    public static void main(String... args) {
        HttpClient client = HttpClient.createDefault();
        HttpRequest request = new HttpRequest(HttpMethod.GET, "https://example.com");
    }
}
