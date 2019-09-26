/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga.pkg4;

/**
 *
 * @author Ayink
 */
public class Segitiga4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=8;
        for (int i=1;i<=x;i++){
            for (int j=7;j>=i;j--){//spasi
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){//empat
                System.out.print("4");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("4");
            }
            System.out.println();
        }
    }
    
}
