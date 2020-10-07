/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

//copies student file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class NewClass3 {
    public static void main(String [] args) throws FileNotFoundException, IOException{
            FileInputStream fis = new FileInputStream("C:\\Users\\jayashree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\javaapplication4\\student.txt"); 
            FileOutputStream fos = new FileOutputStream("C:\\Users\\jayashree\\Documents\\NetBeansProjects\\JavaApplication4\\src\\javaapplication4\\studentoutput.txt");
            int read;
            while((read=fis.read())!=-1)
            {
                if((char)read!=' ')
                {
                    fos.write(read);
                }
            }
            fis.close();
            fos.close();
    }
    
}
