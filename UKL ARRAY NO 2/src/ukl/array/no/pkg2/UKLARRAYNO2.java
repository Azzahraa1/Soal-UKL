/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.array.no.pkg2;

/**
 *
 * @author HP-MC
 */
public class UKLARRAYNO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = {{4,4,4},{4,4,4},{4,4,4},{4,4,4}};//4x3
        int b[][] = {{3,3,3,3},{3,3,3,3},{3,3,3,3}}; //3x4
        int h[][] = {{0,0,0}, {0,0,0},{0,0,0},{0,0,0}}; //untuk hasil

        System.out.println("Hasil Matriks AxB adalah");
         for (int i = 0; i < 3; i++) { //baris
            for (int j = 0; j < 3; j++) { //kolom
                for (int k = 0; k < 2; k++) { //hasil
                    h[i][j]=h[i][j]+a[i][k]*b[k][j]; //operasi                                                                                                     aritmatika
                }
            }
        }
        for (int i = 0; i < 3; i++) { //baris
            for (int j = 0; j <2 ; j++) { //kolom
                System.out.print(h[i][j]+"\t"); //t tab agar output rapi
            }
            System.out.println(""); // mengakhiri hasil
        }
     }
    }
 
    

    

