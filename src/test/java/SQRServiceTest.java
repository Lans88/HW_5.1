import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.hw51.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "9, 100, 400",
            "5, 250, 400",
            "9, 800, 900"
    })

    public void calculate(int expected, int x, int y) {
        SQRService service = new SQRService();
        //int expected = 9;
        int actual = service.square(x, y);
        Assertions.assertEquals(expected, actual);
    }

}
