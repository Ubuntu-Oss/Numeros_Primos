import java.util.*;



public class Numeros_Primos {

 //variaveis

 static Scanner ler = new Scanner(System.in);

 static String resp="os números primos são:";

 static int n; 

        int i;

        int i2;

        ArrayList<Integer> lista = new ArrayList<Integer>();  

        //metodo construtor da classe        

        public Numeros_Primos(int n){

         n=n;

        }

        //metodo que cria a lista de numeros primos       

        public String criarLista(int n){

         //cria a lista de 2 até o numero digitado

         for (i=2;i<=n;i++){

          lista.add(i);

         }

         //seleciona em ordem crescente um numero da lista

         for (i=0;i<lista.size();i++){

            //faz a divisão de todos os numeros da lista pelo numero que está selecionado (Crivo de Eratóstenes)

            for (i2=0;i2<lista.size();i2++){

               if (lista.get(i2) % lista.get(i) == 0 & lista.get(i2) != lista.get(i)){

                  lista.remove(i2);

                  i2--;

               } else if (lista.get(i2) == lista.get(i)){

                  //montando a resposta

                  resp += "\n" + lista.get(i2);

                 }

            }

         }

         return resp;

        } 

   //metodo main

   public static void main(String[] args){

      //solicitando dado ao usuário  

      System.out.println("Digite um numero");

      n = ler.nextInt();

      //instanciando a classe

      Numeros_Primos np = new Numeros_Primos(n);

      //chamando o metodo

      np.criarLista(n);

      //saida dos dados

      System.out.println("" + resp);

      
      System.exit(0);      

   }

}
