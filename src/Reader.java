import java.io.*;

public class Reader {
    private final String path;
    public Reader(String path){
        this.path = path;
    }
    public int readFile() throws IOException {
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String word;
        int count=0;
        while ((word = reader.readLine()) != null) {
            // String[] w = word.split("[!?.:]+");
            // space += w.length;
            //charater = word.length();
            for(int i=0; i< word.length(); i++){
                if(word.charAt(i) == ' ')
                    count++;
            }

        }
        return count;
    }
}
