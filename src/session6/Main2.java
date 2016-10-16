package session6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by ZaR on 15-Oct-16.
 */
public class Main2 {
    public static void main(String[] args) {

            try {
                URL url = new URL ("https://prog.kiev.ua/forum/index.php");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                Map<String, List<String>> reqMap = con.getHeaderFields();
                reqMap.forEach((key, value)->System.out.println(key + " --------------- " + value));
                String text = getStringFromUrl(con);
                saveToFile(text, new File("index.html"));

            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static String getStringFromUrl(HttpURLConnection con){
        StringBuilder sb = new StringBuilder();
            try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()))){
                String text = "";
                while ((text = br.readLine())!=null){
                    sb.append(text).append(System.lineSeparator());
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void saveToFile(String text, File filePath){
        try(PrintWriter pw = new PrintWriter(filePath)){
            pw.write(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
