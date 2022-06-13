/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.soal.no.pkg4;

/**
 *
 * @author HP-MC
 */
public class UKLSOALNO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a=8;
        int b=3;
        int sum = 0;
        System.out.println("Deret Aritmatikanya adalah");
            for (int i=0;i<3;i++){
                for(int j=0;j<3-i;j++){
                    System.out.print(a+"\t");
                    sum += a;
                    a += b;
                }
                System.out.println();
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<=1+i;j++){
                    System.out.print(a+"\t");
                    sum += a;
                    a += b;
                }
                System.out.println();
            }
        System.out.println("Jumlah Deret Aritmatiknya adalah "+sum);
    }
    
}
