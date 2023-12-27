package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//출력 방식 : BufferedWriter, PrintWrite, FileOutput, Files, DataOutputStream
public class BufferWriterEx1 {
    public static void main(String[] args) {
        /*
        String path = "d:\\kim\\java\\out3.txt";
        File file = new File(path);
        */
        try {
            File file = new File("out3.txt");  //노트
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file); //연필
            BufferedWriter writer = new BufferedWriter(fw); //연필 사용자

            //연필로 노트에 쓰기
            writer.write("점심시간 10분전");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
