/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//Binary file-character stream
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class NewClass1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        FileReader fis=null;
        FileWriter fos=null;
        fis=new FileReader("C:\\Users\\jayashree\\Pictures\\USB Drive\\Lighthouse.jpg");
        fos=new FileWriter("programoutput1.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
    }
}
