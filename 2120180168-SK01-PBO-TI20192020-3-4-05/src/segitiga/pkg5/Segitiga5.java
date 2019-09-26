/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga.pkg5;

/**
 *
 * @author Ayink
 */
public class Segitiga5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int z=10;z>=i;z--){
                System.out.print("5");
            }
            for(int k=9;k>=i;k--){
                System.out.print("5");
            }
            System.out.println("");
        }
    }
    
}
