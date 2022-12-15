package models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import mock_map.MockEnum;

public class OperationCheckerModel extends MockModel {


    public OperationCheckerModel(MockEnum mockEnum) {
        super(mockEnum);
    }

    //Внутри методы мы спускаемся по json вниз до permission и заменяем его.
    public OperationCheckerModel setPersmission(String permission) {
        ((ObjectNode) getModel()
                .get("response")
                .get("jsonBody"))
                .put("permission", permission);
        return this;
    }
}
