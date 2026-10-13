package intro;

import java.io.*;
import java.util.Scanner;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        if(file.createNewFile()) {
            System.out.println(file.getName());
        }
        else {
            System.out.println("Could not create file.");
        }
        FileWriter fileWriter = new FileWriter("demo.txt",true);
        fileWriter.write("Hello my name is Shivendra.\n");
        fileWriter.append("Hello my name is sania....\n");
        fileWriter.close();
        System.out.println("Updated file..");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()) {
//            String text = scanner.nextLine();
//            System.out.println(text);
//        }

//        if(file.delete()) {
//            System.out.println("Deleted file.");
//        }
//        else {
//            System.out.println("Could not delete file.");
//        }

        if(file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File Readable: " + file.canRead());
            System.out.println("File Write: " + file.canWrite());
            System.out.println("File Size: " + file.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
