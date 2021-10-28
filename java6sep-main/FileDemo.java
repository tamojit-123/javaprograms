//Import the io package mandatory

import java.io.*;

class FileDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //creating a fileinput object with specified location and extension file
        FileInputStream fis = new FileInputStream("E:\\wave12_batch\\coreJava\\Filexample\\test.txt");
        //System.out.println((char)fis.read());
        //-1 is equalent  EOF (End of  the File)
        int n = 0;
        System.out.println(fis.available());
        System.out.println(fis.skip(10));
        while ((n = fis.read()) != -1) {
            System.out.print((char) n);
        }
        fis.close();
    }
}