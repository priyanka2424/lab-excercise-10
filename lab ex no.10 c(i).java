/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//Binary file-Byte stream
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewClass{
        public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("C:\\Users\\jayashree\\Pictures\\USB Drive\\Jellyfish.jpg");
        fos=new FileOutputStream("programoutput.jpg");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
        }
}