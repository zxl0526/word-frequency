package args;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FlagTest {
    @Test
    public void shouldThrowException_When_InputIsNotLegal(){
        Set<FlagSchema> flagSchemaSet = new HashSet<FlagSchema>();
        flagSchemaSet.add(new FlagSchema("d", ValueType.STRING));
        Schema schema = new Schema(flagSchemaSet);

        String argsTest = "-l-p 8080 -d";
        Args args = new Args(argsTest,schema);

        String errorStr = "";
        try {
            Object value = args.getValueOf("d");
        } catch (Exception e) {
            errorStr = e.getMessage();
        }
    }
}
