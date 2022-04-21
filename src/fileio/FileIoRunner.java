package fileio;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileIoRunner {

    // Here, we have our 'orchestration' method init() - the piece of code used to bring together our helpers and
    // arranged in a way we see fit for our usecase.
    // We could write another method somewhere which orchestrates the FileHelper methods completely differently!
    public static void init(){
        Path newPath = FileHelper.tryMakeFileDirectory();

        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello!");
        linesToWrite.add("It's Thursday, yall!");
        FileHelper.tryWriteFile(newPath, linesToWrite);

        //do a null check
        for (String line : FileHelper.tryReadFile(newPath)){
            System.out.println(line);
        };
    }
}