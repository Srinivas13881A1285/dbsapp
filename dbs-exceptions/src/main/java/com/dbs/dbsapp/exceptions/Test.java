package com.dbs.dbsapp.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        /*Path temp = Files.move
                (Paths.get("D:\\epmcot\\sandbox\\uploads\\OrganizationInitiative_20190422164448.xlsx"),
                        Paths.get("D:\\epmcot\\sandbox\\process\\OrganizationInitiative_20190422164448.xlsx"));

        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }*/
        //readfiles();
        readListOfFiles();
    }

    public static void readfiles() throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get("/epmcot/sandbox/process"))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        }
    }

    public static void readListOfFiles() throws IOException {
        List<File> filesInFolder = Files.walk(Paths.get("/epmcot/sandbox/process"))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
        System.out.println("Size :: " + filesInFolder.size());
    }
}