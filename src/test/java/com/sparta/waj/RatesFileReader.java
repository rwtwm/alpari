package com.sparta.waj;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader
{
    private static final String RATES_LOCATION = "resources/rates.json";
    private FileReader fileReader;

    public RatesFileReader()
    {
        try
        {
            fileReader = new FileReader(RATES_LOCATION);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public FileReader getFileReader()
    {
        return fileReader;
    }
}
