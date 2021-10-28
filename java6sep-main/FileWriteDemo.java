import java.io.*;

class FileWriteDemo {
    public static void main(String[] ar) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream("test1.txt"); //->fileisexist()->replace the content
        //createNewFile()
        String str = "Example  of file write concepts using fileoutput  stream class";
        byte b[] = str.getBytes();

        fos.write(b);
        fos.flush();
        fos.close();
    }
}
/*

 */