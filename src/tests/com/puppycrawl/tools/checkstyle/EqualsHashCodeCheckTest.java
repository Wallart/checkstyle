package com.puppycrawl.tools.checkstyle;

import com.puppycrawl.tools.checkstyle.checks.EqualsHashCodeCheck;

public class EqualsHashCodeCheckTest
        extends BaseCheckTestCase
{
    public EqualsHashCodeCheckTest(String aName)
    {
        super(aName);
    }

    public void testIt() throws Exception
    {
        final CheckConfiguration checkConfig = new CheckConfiguration();
        checkConfig.setClassname(EqualsHashCodeCheck.class.getName());
        final Checker c = createChecker(checkConfig);
        final String fname = getPath("InputSemantic.java");
        final String[] expected = {
            "125:9: Definition of 'equals()' without corresponding defnition of 'hashCode()'.",
            "162:13: Definition of 'equals()' without corresponding defnition of 'hashCode()'.",
        };
        verify(c, fname, expected);

    }

}