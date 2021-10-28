import java.io.*;

class FileWriterDemo1 {

    public static void main(String[] ar) throws FileNotFoundException, IOException {

        /*File file = new File("D:\\myfile.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter  bw  = new BufferedWriter(fw);*/
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("myfile.txt")));
        String content = "Example of Character Stream ";
        bw.write(content);
        bw.close();
    }

}