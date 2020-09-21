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
}
