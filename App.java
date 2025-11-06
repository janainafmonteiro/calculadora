
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
    
}
