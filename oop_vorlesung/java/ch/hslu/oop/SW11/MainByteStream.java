package ch.hslu.oop.SW11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class MainByteStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainByteStream.class);
    public static final String TXT_FILE = "C:\\OOP\\oop_exercises\\src\\main\\java\\ch\\hslu\\oop\\SW11\\output.txt";

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    // Schreibt eine Int und zwei Zeilen String in eine Textdatei.
    public static void writeFile() {
        try ( DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(TXT_FILE));) {
            dataOutputStream.writeInt(50);
            dataOutputStream.writeUTF("Hallo Welt");
            dataOutputStream.writeUTF("Und ein paar Sonderzeichen äöü");
        } catch (IOException ioe) {
            LOGGER.error(ioe.getMessage(), ioe);
        }
    }

    // Liest eine Int und zwei Zeilen String aus einer Textdatei
    public static void readFile() {
        try ( DataInputStream dataInputStream = new DataInputStream(new FileInputStream(TXT_FILE));) {
            LOGGER.info(null, dataInputStream.readInt());
            LOGGER.info(dataInputStream.readUTF());
            LOGGER.info(dataInputStream.readUTF());
        } catch (IOException ioe) {
            LOGGER.error(ioe.getMessage(), ioe);
        }
    }
}
