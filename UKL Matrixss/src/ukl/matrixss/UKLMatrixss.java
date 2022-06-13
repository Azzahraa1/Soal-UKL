/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.matrixss;

/**
 *
 * @author HP-MC
 */
public class UKLMatrixss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inisialisasi variable
        int a=11;
        int b=5;
        int sum = 0;
    /*  PERULANGAN MEMBUAT BARIS
        nilai awal j adalah 0 dan ketika i kurang dari 5 maka i++*/
        for(int i=0;i<5;i++){
    /*  PERULANGAN MEMBUAT KOLOM
            nilai awal j adalah 0 dan ketika j kurang dari 6 maka j++*/
                for(int j=0;j<6;j++){
    /*  ketika perulangan j berjalan maka tampilan u kemudian berikan spasi"\t"
        setlah itu u + b dan s + u*/
                    System.out.print(a+"\t");
                    sum += a;
                    a += b;
                }
    //  ketika perulangan j berakhir maka berikan pengganti baris atau "enter"
            System.out.println();
    /*  kemudian cek apakah perulangan i masih berjalan, jika masih maka ulangi 
            dari atas*/
        }
    //  jika perulangan i sudah berakhir maka tampilkan sum
        System.out.println("Jumlah Deret Aritmatikanya adalah "+sum);
    }
    
}
