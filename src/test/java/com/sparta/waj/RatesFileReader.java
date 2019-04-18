package com.sparta.waj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesFileReader
{
    private static final String RATES_LOCATION = "resources/rates.json";
    private FileReader fileReader;

    //TODO add rates location as argument in the constructor
    public RatesFileReader(String ratesFileLocation)
    {
        try
        {
            fileReader = new FileReader(ratesFileLocation);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void closeReader()
    {
        try
        {
            fileReader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public FileReader getFileReader()
    {
        return fileReader;
    }
}
