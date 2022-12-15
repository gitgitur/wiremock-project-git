import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static mock_map.MockEnum.OPERATION_CHECKER_ALLOW;

public class NeoflexerTest extends BaseTest {
    @BeforeTest
    public void init() {
        initMock(OPERATION_CHECKER_ALLOW);
    }

    @Test
    public void simpleTest() {

    }

}
