class JogoNim
{
  int n;   // Numero inicial de pecas.
  int m;   // Numero maximo de pecas a serem retiradas.
  int na;  // Numero atual, durante o jogo, de pecas.
  int x;   // Numero de pecas retiradas pelo jogador humano.
  int m2;  // Variavel auxiliar, para transferencia entre metodos.
  
  void novoJogo ( int n , int m )
  {
     if ( n < 0 )
        System.out.println ("Inicializacao nao permitida! Numero inicial de pecas nao pode ser menor que zero!");
      
     else if ( m < 0 )
        System.out.println ("Inicializacao nao permitida! Numero maximo de pecas a serem retiradas nao pode ser menor que zero!"); 
    
     else if ( n < m )
        System.out.println ("Inicializacao nao permitida! Numero inicial de pecas menor do que numero maximo de pecas a serem retiradas!");
        
      else if ( n % (m+1) == 0 )
      {
        m2 = m;
        na = n;
        System.out.println ("Humano começa. Por favor, inicie uma nova rodada. Restam " + na + " pecas.");
      }
    
      else if ( n % (m+1) != 0 )
      {
        System.out.println ("Computador comeca.");
        m2 = m;
        int n2 = (n % (m+1));
        na = n - n2;
        System.out.println ("Retirei " + n2 + " pecas. Agora o numero de pecas e' " + na + ". Inicie uma nova rodada.");
      }
  
  }
  
  
  void novaRodada ( int x )
  {
     if ( na == 0 )
      System.out.println ("Computador ja venceu! Tente novamente, inicie novo jogo com outros valores!");
     
     else if ( x <= 0 )
        System.out.println ("Nao pode retirar numeros negativo ou igual a zero!");
     
     else if ( x > m2 )
        System.out.println ("Nao pode retirar numero maior que o maximo! Maximo atual e' " + m2 + ".");
     
     else if ( x <= m2)
        {
         na = na - x;
         System.out.println ("Agora o numero de pecas e' " + na + ".");
         int na2 = (na % (m2+1));
         na = na - na2;
         System.out.println ("Retirei " + na2 + " pecas. Agora o numero de pecas e' " + na + ".");
        }
     
  }
  
}