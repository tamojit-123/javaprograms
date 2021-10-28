import java.io.*;

class FileSearch {

    public static void main(String[] ar) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("E:\\wave12_batch\\coreJava\\Filexample\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] words = null;
        String input = "content";
        int count = 0;
        String inputdata;
        while ((inputdata = br.readLine()) != null) {
            words = inputdata.split(" "); // "of a package"
            for (String word : words) {
                if (word.equals(input)) {
                    count++;
                }//if end
            }//for end
        }//file end

        if (count != 0) {
            System.out.println("The given word is there in file " + count + "Times in  a file");
        } else {
            System.out.println("OoPs no word");
        }

    }
}