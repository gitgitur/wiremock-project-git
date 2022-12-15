import io.restassured.response.Response;
import mock_helper.MockHelper;
import mock_helper.MockUrlSelector;
import mock_map.MockEnum;
import models.MockModel;
import org.testng.annotations.AfterMethod;

import java.util.HashSet;

import static endpoins.Endpoints.ADMIN_MAPPINGS;

public class BaseTest {
    private static final HashSet<String> MOCKS_SET = new HashSet<>();

    protected void initMock(MockEnum mockEnum) {
        MockModel model = new MockModel(mockEnum);
        String url = MockUrlSelector.mockUrlSelector(mockEnum);
        Response response = MockHelper.post(model, url);
        String mockId = response
                .getBody()
                .jsonPath()
                .prettyPeek()
                .get("id");

        MOCKS_SET.add(url + ADMIN_MAPPINGS.getEndpoint() + "/" + mockId);
    }

    // После каждого метода помеченного аннотацией @Test будет запускаться метод cleanup()
    @AfterMethod
    public void cleanup() {
        MockHelper.deleteMocks(MOCKS_SET);
    }
}
