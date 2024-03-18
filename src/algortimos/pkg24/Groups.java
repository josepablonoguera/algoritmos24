/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algortimos.pkg24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

/**
 *
 * @author pablonoguera
 */
public class Groups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Student[] students = readFile();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name +", Nota: "+ students[i].grade);
        }
      
        
        //Su laboratorio despúes de aquí 

    }

    private static Student[] readFile() throws FileNotFoundException, IOException {

        Student[] students = new Student[30];

        String fileName = "data.txt";

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        try {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                Student student = new Student(
                        line.split(",")[1],
                        line.split(",")[2],
                        Integer.parseInt(line.split(",")[3])
                );
                students[i] = student;
                i++;
            }
        } finally {
            br.close();
        }

        return students;
    }

}
