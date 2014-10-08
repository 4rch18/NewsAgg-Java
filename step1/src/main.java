/**
 * Created by phoenix on 8/10/14.
 */

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputstream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    static ArrayList<String> stopwords = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        createStopList();

    }

    public static void createStopList() throws FileNotFoundException, IOException {
        BufferedReader in;
        in = new BufferedReader(new FileReader("stop.txt"));
        String tempText;
        String trimmed;
        while ((tempText = in.readLine()) != null) {
            if (!(trimmed = tempText.replaceAll("\\|.*$", "").trim()).equals(""))
                stopwords.add(trimmed);
        }
    }

}
