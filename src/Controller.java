import java.io.*;
import java.util.ArrayList;

public class Controller {
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public void WriteFile(ArrayList<Phone> phoneList,String file) throws IOException {

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < phoneList.size(); i++) {
                bufferedWriter.write(phoneList.get(i).getName());
                bufferedWriter.write(phoneList.get(i).getPhoneNumber());
                bufferedWriter.write(phoneList.get(i).getContact());
                bufferedWriter.write(phoneList.get(i).getSex());
                bufferedWriter.write(phoneList.get(i).getAddress());
                bufferedWriter.write(phoneList.get(i).getBirth());
                bufferedWriter.write(phoneList.get(i).getEmail());


            }
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void  readFile(ArrayList<Phone> phoneList,String file) throws Exception{
        bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            String[] word =line.split(",");
        }
        bufferedReader.close();


    }


}
