package session6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by ZaR on 15-Oct-16.
 */
public class Main3 {
    private HashMap<String, String> inetAdress = new HashMap<>();
    public static void main(String[] args) {
        Set<String> url = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(new File("E:\\Other\\Prog\\src\\session6\\url.txt")))){
            String key = "";
            while ((key = br.readLine())!=null){
                url.add(key);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        try {
            for(String e: url){
                URL urlu = new URL (e);
                HttpURLConnection con = (HttpURLConnection) urlu.openConnection();
                int code = con.getResponseCode();
                String mess = con.getResponseMessage();
                System.out.println(code + " " + e + " " + mess);
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(File file){
        try {
            Files.lines(Paths.get(file.getAbsolutePath())).forEach((n -> inetAdress.put(n, " ")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
