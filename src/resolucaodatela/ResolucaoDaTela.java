/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author z1175727
 */
public class ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("O tamanho da tela é: ");
        System.out.println(tela.width + "X" + tela.height);
    }
    
}
