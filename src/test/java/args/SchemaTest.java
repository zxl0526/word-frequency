package args;

import org.junit.Test;
import java.util.Set;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class SchemaTest {
    @Test
    public void should_return_boolen_when_get_type_given_flag(){
        Set<FlagSchema> flagsSchema=new HashSet<>();
        flagsSchema.add(new FlagSchema("l",Boolean.TYPE));
        Schema schema =new Schema(flagsSchema);
        Object type=schema.getTypeOf("l");
        assertEquals(Boolean.TYPE,type);
    }


}
