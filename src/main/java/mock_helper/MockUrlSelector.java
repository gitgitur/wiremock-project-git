package mock_helper;

import config_qa.ConfigQa;
import mock_map.MockEnum;

import static config_qa.UrlEnum.*;

public class MockUrlSelector {

    public static String mockUrlSelector(MockEnum mockEnum) {
        switch (mockEnum) {
            case OPERATION_CHECKER_ALLOW:
                return ConfigQa.getInstance().getMapOfProperties().get(OPERATION_CHECKER_URL);
            case PERSONAL_INFO_INFO_456311:
                return ConfigQa.getInstance().getMapOfProperties().get(PERSONAL_INFO_URL);
            case PRODUCT_INFO_787DDFE:
                return ConfigQa.getInstance().getMapOfProperties().get(PRODUCT_INFO_URL);
            default:
                throw new IllegalArgumentException();
        }
    }
}