/*******************************************************************/
/**   MAC 115 - Introducao a Computaçao                           **/
/**   IF-USP - Segundo Semestre de 2009                           **/
/**   Turma 23 - Professor Marcelo Finger                         **/
/**                                                               **/
/**   Exercicio-Programa -- Jogo do NIM                           **/
/**   Arquivo: JogoNim.java                                       **/
/**                                                               **/
/**   Aluno Joao Pedro Azevedo Maldos - N.USP 6800938             **/
/**                                                               **/
/**   <data de entrega>                                           **/
/*******************************************************************/


class JogoNim
{
  int n;   // Numero inicial de pecas.
  int m;   // Numero maximo de pecas a serem retiradas.
  int na;  // Numero atual, durante o jogo, de pecas.
  int x;   // Numero de pecas retiradas pelo jogador humano.
  int m2;  // Variavel auxiliar, para transferencia entre metodos.
  
  void novoJogo ( int n , int m ) // Carrega valor inicial de pecas, n, e valor maximo de pecas a serem retiradas, m.
  {
     if ( n <= 0 ) // Se n e' menor ou igual a zero, o jogo nao pode iniciar.
        System.out.println ("Inicializacao nao permitida! Numero inicial de pecas nao pode ser menor ou igual a zero!");
      
     else if ( m <= 0 ) // Se m e' menor ou igual a zero, o jogo nao pode iniciar.
     {
       System.out.print   ("Inicializacao nao permitida! Numero maximo de pecas a serem retiradas nao pode ser menor");
       System.out.println (" ou igual a zero.");
     }
     
     else if ( n < m ) // Se n e' menor que m, o jogo nao pode iniciar.
     { 
        System.out.print   ("Inicializacao nao permitida! Numero inicial de pecas menor do que numero maximo de pecas");
        System.out.println (" a serem retiradas!");
     }
        
      else if ( n % (m+1) == 0 ) // Se n e' multiplo de m+1, o computador convida o jogador humano a iniciar o jogo.
      {
        m2 = m; // Carrega variavel auxiliar com valor de m.
        na = n; // Carrega na com valor de n.
        System.out.println ("Jogador humano começa. Por favor, inicie uma nova rodada. Restam " + na + " pecas.");
      }
    
      else if ( n % (m+1) != 0 ) // Como n nao e' multiplo de m+1, o computador comeca.
      {
        System.out.println ("Computador comeca.");
        m2 = m; // Carrega variavel auxiliar com valor de m.
        int n2 = (n % (m+1)); /* Carrega variavel n2 para subtracao de n, de modo que o jogador humano fique com 
                              um multiplo de m+1.*/
        na = n - n2;
        System.out.println ("Retirei " + n2 + " pecas. Agora o numero de pecas e' " + na + ". Inicie uma nova rodada.");
      }
  
  }
  
  
  void novaRodada ( int x ) // Carrega numero de pecas a serem retiradas, x, pelo jogador humano.
  {
     if ( na == 0 ) // Se na e' igual a zero, o jogo termina.
      System.out.println ("Computador ja venceu! Tente novamente, inicie novo jogo com outros valores!");
     
     else if ( x <= 0 ) // Nao pode retirar numeros negativos ou igual a zero.
        System.out.println ("Nao pode retirar numeros negativo ou igual a zero!");
     
     else if ( x > m2 ) /* Nao pode retirar numero maior que o maximo, carregado inicialmente como m, transportado 
                        pela variavel m2.*/
        System.out.println ("Nao pode retirar numero maior que o maximo! Maximo atual e' " + m2 + ".");
     
     else if ( x <= m2) /* Sendo x menor ou igual a m, tendo m sido transportado para este metodo pela variavel 
                           auxiliar m2, a jogada pode ser computada.*/
        {
         if ( na == 0)
         System.out.println ("Computador ganhou!");
       
         else
         {
         na = na - x;
         System.out.println ("Agora o numero de pecas e' " + na + ".");
         int na2 = (na % (m2+1)); /* Carrega variavel na2 para subtracao de na, de modo que o jogador humano fique com 
                              um multiplo de m+1.*/
         na = na - na2;
         System.out.println ("Retirei " + na2 + " pecas. Agora o numero de pecas e' " + na + ".");
         }
         
        }
     
  }
  
}