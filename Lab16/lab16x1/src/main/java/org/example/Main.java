package org.example;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
        Set<String> fileSet = new HashSet<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    fileSet.add(path.getFileName()
                        .toString());
                    System.out.println(path.getFileName()
                        .toString());
                }
            }
        }
        return fileSet;
    }
    public static void main(String[] args) throws IOException {
        
        listFilesUsingDirectoryStream("C:\\Users\\quoch\\Downloads");

    }
}