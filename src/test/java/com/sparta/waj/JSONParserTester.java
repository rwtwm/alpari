package com.sparta.waj;

import org.junit.Test;

public class JSONParserTester
{
    private static final String RATES_LOCATION = "resources/rates.json";

    @Test
    public void parserTest()
    {
        RatesJSONParser parser = new RatesJSONParser(RATES_LOCATION);
        parser.check();
    }

}
