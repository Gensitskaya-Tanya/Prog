package session2;


import java.io.*;

public class CatsToCVS implements DAOCats {
    private File file;


    public CatsToCVS(File file) {
        this.file = file;
    }

    public CatsToCVS() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void saveCat(Cat cat) {
       try {
           PrintWriter pw = new PrintWriter(file);
           pw.println(cat.getName() + ";" +cat.getColor() + ";" + cat.getAge() + ";" + cat.getType());
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    @Override
    public Cat loadCat() {
    try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String catsText = br.readLine();
        String [] catsDate = catsText.split(";");
        String name = catsDate[0];
        String color = catsDate[1];
        int age = Integer.valueOf(catsDate[2]);
        String type = catsDate[2];
        return  new Cat(name, color, age, type);


    } catch (IOException e) {
        System.out.println();
    }
        return null;
    }
}
