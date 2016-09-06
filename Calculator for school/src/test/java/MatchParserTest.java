import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DarthVader on 05.09.2016.
 */
public class MatchParserTest {
    MatchParser matchParser = new MatchParser();

    @Test
    public void testTwoPlusTwo() throws Exception {
        double parse = matchParser.parse("2+2");
        Assert.assertEquals(new Double(4), new Double(parse));
    }

    @Test
    public void testTwoPluFive() throws Exception {
        double parse = matchParser.parse("2+5");
        Assert.assertEquals(new Double(7), new Double(parse));
    }

    @Test
    public void invalidStatement() throws Exception {
        double parse = matchParser.parse("2+5s");
        Assert.assertNull(parse);
    }

    @Test
    public void minus() throws Exception {
        double parse = matchParser.parse("-2");
        Assert.assertEquals(new Double(-2), new Double(parse));
    }

}