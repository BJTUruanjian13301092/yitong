package com.example.yitong.util;

import com.csvreader.CsvReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

    public static List<String[]> readCSV(String filepath) {
        List<String[]> dataList = new ArrayList<>();
        try{
            CsvReader csvReader = new CsvReader(filepath, ',', Charset.forName("utf-8"));
            csvReader.readHeaders();
            while (csvReader.readRecord()) {
                dataList.add(csvReader.getValues());
            }
            csvReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return dataList;
    }
}
