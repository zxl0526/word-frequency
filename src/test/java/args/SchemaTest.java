package args;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void should_Return_FlagType(){
        Set<FlagSchema> flagSchemaSet = new HashSet<FlagSchema>();
        flagSchemaSet.add(new FlagSchema("l", ValueType.BOOLEAN));
        Schema schema = new Schema(flagSchemaSet);
        String type = schema.getTypeOf("l");
        assertEquals("java.lang.Boolean",type);
    }

    @Test
    public void should_Return_FlagTypeWithP(){
        Set<FlagSchema> flagSchemaSet = new HashSet<FlagSchema>();
        flagSchemaSet.add(new FlagSchema("p",ValueType.INTEGER));
        Schema schema = new Schema(flagSchemaSet);
        Object type = schema.getTypeOf("p");
        assertEquals("java.lang.Integer",type);
    }
}
