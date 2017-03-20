
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade2 {

    public static void main(String[] args) {
        double produto,impos,valorf,impost,valorfi,impostoin,valorin;
        String fabr;
       Scanner entrada = new Scanner (System.in);
       System.out.println("Digite o valor do produto:");
       produto = entrada.nextFloat ();
       System.out.println("O seu produto foi fabricado no Brasil?");
       fabr = entrada.next();
       if (fabr.toUpperCase().equals("NAO")){
           impostoin = (produto*0.50);
           valorin = (produto-impostoin);
           System.out.println("O valor do imposto é "+impostoin+",o valor do produto sem impostos é "+valorin);
       }else if ((fabr.toUpperCase().equals("SIM"))&&(produto<1000)){
           impos = (produto*0.10);
           valorf = (produto-impos);
           System.out.println("O valor do imposto é "+impos+",o valor do produto sem imposto é "+valorf);
       }else if (produto>=1000){
           impost = (produto*0.15);
           valorfi =  (produto-impost);
           System.out.println("O valor do imposto é "+impost+", o valor do produto sem imposto é "+valorfi);   
       }
       
       
    }
}
