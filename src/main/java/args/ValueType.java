package args;

/**
 * @author adminzxl
 */
public enum ValueType {

    /**
     * 设置默认值
     */
    BOOLEAN(true),
    INTEGER(0),
    STRING("");

    private Object defaultValue;

    ValueType(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getType() {
        return this.getDefaultValue().getClass().getTypeName();

    }
}
