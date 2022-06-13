/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.kedua.no.pkg1;

/**
 *
 * @author HP-MC
 */
public class UKLKEDUANO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a[][]={{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},};
        int b[][]={{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},};
        System.out.println("Hasil A-B");
//      Menghitung berapa kolom(kebawah)
        for(int i=0;i<5;i++){
//      Menghitung berapa garis(kesamping)
            for(int j=0;j<5;j++){
//              Jika penjumlahan hanya mengganti operator aritmatika dibawah
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
        }
    }
    }
    

