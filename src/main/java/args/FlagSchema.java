package args;

import java.lang.reflect.Type;

public class FlagSchema {
    private final String flag;
    private final Object type;
    public FlagSchema(String flag,Object type){
        this.flag=flag;
        this.type=type;

    }
    public boolean equalsWith(String flag){
        return flag.equals(this.flag);

    }
    public Object getType(){
        return type;
    }
}
