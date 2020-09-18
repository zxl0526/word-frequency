package args;

import java.util.Set;

/**
 * @author adminzxl
 */
public class Schema {
    private Set<FlagSchema> flagsSchema;
    public Schema(Set<FlagSchema> flagSchema){
        this.flagsSchema=flagSchema;

    }
    public Object getTypeOf(String flag){
        return flagsSchema.stream()
                .filter(flagSchema -> flagSchema.equalsWith(flag))
                .findFirst().get().getType();

    }

}
