/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroPar;

public class NumeroPar {
    public static void main(String args[]) {
        int n=(int) (Math.random()*101+100);

        System.out.print("El número es: "+n);
        if (n%2==0) {
            System.out.println(" y es par.");
        } else {
            System.out.println(" y es impar.");
        }
    }
}
