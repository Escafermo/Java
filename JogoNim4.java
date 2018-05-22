class JogoNim
{
  int n;               //Numero de pecas inicial
  int m;               //Numero de pecas maximo a retirar
  int na;              //Numero de pecas atual
  int x;               //Numero de pecas que o humano retira
  int m2;              //Variavel auxiliar, para transferencia entre metodos
    
  void novoJogo ( int n , int m )
  {
    if ( n < m )
      System.out.println ("Inicializacao nao permitida! Numero inicial de pecas menor do que numero maximo de pecas a serem retiradas!");

    else if ( n == m )
      System.out.println ("Inicializacao nao permitida! Numero inicial de pecas igual ao numero maximo de pecas a serem retiradas!");
    
    else if ( n % (m+1) == 0 )
    {
      m2 = m;
      na = n;
      System.out.println ("Por favor, comece...");
    }
      
      
    else if ( n % (m+1) != 0 )
    {
      System.out.println ("Computador comeca.");
      m2 = m;
      na = n - (n % (m+1));
      System.out.println ("Agora o numero de pecas e' " + na + ". Sua vez!");
    
    }
  }
          
  void jogadaDoComputador ()
  {
    na = na - (na % (m2+1));
    System.out.println ("Retirei " + (na % (m2+1)) + "pecas. Agora o numero de pecas e' " + na + ". Sua vez!");
  }
  
  void retirarPecas ( int x )
  {
    if ( x <= 0 )
      System.out.println ("Nâo pode retirar numeros negativo ou igual a zero!");
    else if ( x > m2 )
      System.out.println ("Nao pode retirar numero maior que o maximo! Maximo atual e' " + m2 + ".");
    else if ( x <= m2)
  {
    na = na - x;
    System.out.println ("Agora o numero de pecas e' " + na + ".");
  }
  }   
  
  void verificaFimDeJogo ()
  {
    if ( na == 0)
      System.out.println ("Computador venceu!");
    
    else
      System.out.println ("Vez do humano.");
    
  }
  
  void imprimePecas ()
  {
    System.out.println ("Número de pecas atual e' " + na + ".");
  }
  
}