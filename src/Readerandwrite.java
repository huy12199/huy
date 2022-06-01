import java.io.*;
import java.util.ArrayList;

public class Readerandwrite {
    public void write(ArrayList<HocSinh> hocSinhs) {
        File file = new File("qls.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (HocSinh hs : hocSinhs) {
                bufferedWriter.write(hs.write());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }

    public ArrayList<HocSinh> reader() {
        ArrayList<HocSinh> hocSinhs = new ArrayList<>();
        File file = new File("qls.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            while (str!=null) {
                {
                    String[] arr = str.split(",");
                    String msv = arr[0];
                    String name = arr[1];
                    int age = Integer.parseInt(arr[2]);
                    String sex = arr[3];
                    String address = arr[4];
                    double dtb = Double.parseDouble(arr[5]);
                    hocSinhs.add(new HocSinh(msv, name, age, sex, address, dtb));
                }
                str = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hocSinhs;
    }
}
