package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileService<T> {
    public FileService() {
    }

    public void printList(List<T> objects) {
        for (T object : objects) {
            System.out.println(object);
        }
    }

    public List<T> readFile(String fileName){
        List<T> objects = new ArrayList<>();
        try(ObjectInputStream file = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            boolean eof = false;
            while(!eof) {
                try {
                    T object = (T) file.readObject();
                    objects.add(object);
                } catch(EOFException e) {
                    eof = true;
                }
            }
        } catch(IOException io) {
            System.out.println("IO Exception" + io.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }
        return objects;
    }
    
    public void writeFile(String fileName, List<T> objects){
        try (ObjectOutputStream companyFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            for (T object : objects) {
                companyFile.writeObject(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
    
}
