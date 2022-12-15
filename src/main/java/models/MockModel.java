package models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Getter;
import mock_map.MockEnum;
import mock_map.MocksMap;

public class MockModel {
    @Getter
    private final ObjectNode model;

    public MockModel(MockEnum mockEnum) {
        this.model = MocksMap.getInstance().getMocksMap().get(mockEnum).deepCopy();
    }
}
