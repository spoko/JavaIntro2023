package exceptiondemo;

import java.io.*;

public class FileReader {

    public static void readFile(String fullPathName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fullPathName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null){
            System.out.println(tmp);
        }
        bufferedReader.close();
        fileInputStream.close();
    }

    public static int divide(int a, int b) throws NoFriendsException{
        if (b==0) throw new NoFriendsException("You have no friends!");
        return a / b;
    }

}
