package me.yuge.nonmem;

import com.intellij.testFramework.ParsingTestCase;

public class NonmemParsingTest extends ParsingTestCase {
    public NonmemParsingTest() {
        super("", "ctl", true, new NonmemParserDefinition());
    }

    public void testRun001() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
