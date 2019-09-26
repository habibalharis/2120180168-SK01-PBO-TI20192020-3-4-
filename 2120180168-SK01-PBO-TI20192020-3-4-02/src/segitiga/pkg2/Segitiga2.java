/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga.pkg2;

/**
 *
 * @author Ayink
 */
public class Segitiga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=9;
        for (int b=1;b<=a;b++){ 
            for (int c=8;c>=b;c--){ //spasi
                System.out.print(" ");
            }
            for (int d=1;d<=b;d++){ // dua
                System.out.print("2");
            }
            System.out.println();
        }
    }
    
}
