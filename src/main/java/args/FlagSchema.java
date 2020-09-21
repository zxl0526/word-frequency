package args;

import java.lang.reflect.Type;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author adminzxl
 */
public class FlagSchema {

    private final String flag;
    private ValueType valueType;
//    private final Object type;


    public FlagSchema(String flag, ValueType valueType) {
        this.flag = flag;
        this.valueType = valueType;
//        this.type = type;
    }

    public boolean equalsWith(String flag) {
        return flag.equalsIgnoreCase(this.flag);
    }

    public String getType() {
        //return type;
        return valueType.getType();
    }

    public String getFlag() {
        return flag;
    }

    public Object getDefaultValue(){
        return valueType.getDefaultValue();
    }

    private void check(String args) {
        //不能为-p-d
        String regEx = "^.*-[A-Za-z]-.*$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(args);
        if (matcher.matches()) {
            throw new IllegalArgumentException("Param should have space!");
        }
    }
}
