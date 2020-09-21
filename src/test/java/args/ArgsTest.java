package args;

import org.junit.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArgsTest {
    @Test
    public void shouldReturnStringList_WhenScan_GivenString(){

        Set<FlagSchema> flagSchemaSet = new HashSet<FlagSchema>();
        flagSchemaSet.add(new FlagSchema("l",ValueType.BOOLEAN));
        Schema schema = new Schema(flagSchemaSet);

        String argsTest = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsTest, schema);
        List<KeyValuePair> keyValuePairs = args.scan();
        assertEquals(3,keyValuePairs.size());
        assertTrue(keyValuePairs.contains(new KeyValuePair("l", "true")));
    }

    @Test
    public void shouldReturnCorrectValue_WhenScan_GetValueOfFlag(){

        Set<FlagSchema> flagSchemaSet = new HashSet<FlagSchema>();
        flagSchemaSet.add(new FlagSchema("l", ValueType.BOOLEAN));
        Schema schema = new Schema(flagSchemaSet);

        String argsTest = "-l true -p 8080 -d usr/logs";
        Args args = new Args(argsTest,schema);
        Object value = args.getValueOf("l");

        assertEquals(value,true);
    }
}