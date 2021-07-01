package avaliaçãoexer4resposta;
/**
 * @author Felipe
 *
 * Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e
um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, escreva
um programa, que imprima o tempo necessário para que a população do país A ultrapasse
a população do país B. Utilize laços de repetições para resolver o problema.
 */
public class AvaliaçãoEXER4resposta {
    public static void main(String[] args) {
        int A, B, anos, NA, NB;
        A = 5000000;//numero de habitantes
        B = 7000000;//numero de habitantes
        anos = 0;
        while(B > A){
            NA = A * 3;
            NB = B * 2;
            A = A + NA;
            B = B + NB;
            anos = anos + 1;
            System.out.println("Em \n" +anos+"anos o país A passará o país B");
        }//fim do while
    }//fim da programação
}//fim da classe
