package com.sparta.waj;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class ReaderTester
{
    private static final String fs = File.separator;
    private static final String FILE_LOCATION = "resources" + fs + "testfile.txt";
    private static File file;

    @BeforeClass
    public static void init()
    {
        file = new File(FILE_LOCATION);
        try
        {
            file.createNewFile();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        //Create a file and store it in the resources
    }

    @Test
    public void check()
    {
        RatesFileReader ratesReader = new RatesFileReader(FILE_LOCATION + "x");
        ratesReader.closeReader();
    }

    @AfterClass
    public static void tearDown()
    {
        file.delete();
    }
}
