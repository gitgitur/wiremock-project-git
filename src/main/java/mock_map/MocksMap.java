package mock_map;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Getter;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MocksMap {
    private static MocksMap instance;
    @Getter
    private final Map<MockEnum, ObjectNode> mocksMap = new HashMap<>();
    private ObjectNode mock;

    MocksMap() {
        for (MockEnum value : MockEnum.values()) {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(value.getPath()).getFile());

            try {
                String data = FileUtils.readFileToString(file, "UTF-8");
                mock = (ObjectNode) new ObjectMapper().readTree(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mocksMap.put(value, mock);
        }
    }

    public static MocksMap getInstance() {
        if (instance == null) {
            instance = new MocksMap();
        }
        return instance;
    }
}
