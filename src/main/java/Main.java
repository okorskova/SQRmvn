import ru.netology.sqr.sqrmvn.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.sqrtInARange(200, 300));
    }
}
