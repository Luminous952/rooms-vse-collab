package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logic {

    public static void printToUser(String toPrint) {
        System.out.println(toPrint);
        writeToFile(toPrint); // Write log to file simultaneously
    }

    private static void writeToFile(String toWrite) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(toWrite);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
