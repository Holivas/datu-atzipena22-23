package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;


public class JsonFitxategiaIrakurri {
    public static void main(String[] args) throws FileNotFoundException {

        JsonReader reader = Json.createReader(new FileReader("test.json"));
        JsonStructure jsonst = reader.read();
        System.out.println(jsonst);

    }

}
