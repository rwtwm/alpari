package com.sparta.waj;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class RatesJSONParser
{

    private JSONObject ratesJSON;

    public RatesJSONParser(String fileLocation)
    {
        RatesFileReader fileReader = new RatesFileReader(fileLocation);
        JSONParser parser = new JSONParser();
        try
        {
            ratesJSON = (JSONObject) parser.parse(fileReader.getFileReader());
        } catch (IOException|ParseException e)
        {
            e.printStackTrace();
        }

    }

    public void check()
    {
        System.out.println(ratesJSON.getClass());
    }

}
