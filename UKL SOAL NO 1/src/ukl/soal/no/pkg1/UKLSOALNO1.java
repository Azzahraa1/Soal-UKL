/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.soal.no.pkg1;

/**
 *
 * @author HP-MC
 */
public class UKLSOALNO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=8;
        int b=3;
        int n=19;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i >=5 && i <=19){
                System.out.println("Suku ke-"+i+"adalah "+a);
                sum=sum+a;
            }
            a+=b;
        }
        System.out.println("Jumlah Deret Aritmatika adalah "+sum);
    }
    
    }
    

