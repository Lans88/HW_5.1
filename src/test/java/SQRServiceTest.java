import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.hw51.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "4, 100, 200",
            "9, 100, 400",
            "4, 250, 400",
            "1, 800, 900"
    })

    public void calculate(int expected, int min, int max) {
        SQRService service = new SQRService();
        //int expected = 9;
        int actual = service.square(min, max);
        Assertions.assertEquals(expected, actual);
    }

}
