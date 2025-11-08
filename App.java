
import java.util.Scanner;



public class App {

    public static void main(String[] args) throws Exception {
        String expressao;
        
       do { 
        System.out.println("Digite as expressao:");
        Scanner scan = new Scanner(System.in);
        expressao = scan.nextLine();
        analisarExpressao verificar = new analisarExpressao(expressao);    
        if(!expressao.equals("fim")){          
            if(verificar.verificar()){
                System.out.println("Expressao valida");
                System.out.println(verificar.getExpressao());
                
            }else{
                System.out.println("Expressao invalida");
            }
        }
       } while (!expressao.equals("fim"));
    } 
    //Exemplo de uma conta com a clase NumComplexo e Operacoes
    //NumComplexo a = new NumComplexo(16,2);
    //NumComplexo b = new NumComplexo(4, 0);
    //System.out.println(Operacoes.multiplicar(a, b));
    
}
