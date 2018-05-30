package lastlectures;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class HowToDownloadImage {

    public static void main(String[] args) {
        URL imgURL = null;
        try {
            imgURL = new URL("https://upload.wikimedia.org/wikipedia/commons/d/d1/Famous_fantastic_mysteries_193909-10_v1_n1.jpg");
            InputStream stream=  imgURL.openStream();
            Files.copy(stream, Paths.get("../mysteries.png"));
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}