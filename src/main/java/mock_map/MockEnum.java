package mock_map;

public enum MockEnum {
    OPERATION_CHECKER_ALLOW("operation_checker/allow.json"),
    PERSONAL_INFO_INFO_456311("personal_info/info_456311.json"),
    PRODUCT_INFO_787DDFE("product_info/info_787DDFE.json");
    private final String path;


    MockEnum(String path) {
        this.path = path;

    }

    public String getPath() {
        return path;
    }

}
