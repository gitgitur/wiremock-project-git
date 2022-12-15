package mock_helper;

import io.restassured.response.Response;
import models.MockModel;

import java.util.HashSet;

import static endpoins.Endpoints.ADMIN_MAPPINGS;
import static io.restassured.RestAssured.given;

public class MockHelper {

    public static Response post(MockModel model, String url) {
        Response response = given()
                .header("Content-Type", "application/json")
                .body(model.getModel())
                .post(url + ADMIN_MAPPINGS.getEndpoint());
        return response;
    }

    public static void deleteMocks(HashSet<String> set) {
        for (String s : set) {
            given().delete(s);
        }
        set.clear();
    }

}
