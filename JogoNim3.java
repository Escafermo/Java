class JogoNim
{
  int n;               //Numero de pecas inicial
  int m;               //Numero de pecas maximo a retirar
  int na;              //Numero de pecas atual
  int x;               //Numero de pecas que o humano retira
  int m2;
  
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
      System.out.println ("Vou comecar.");
      m2 = m;
      na = na;
      System.out.println ("Agora o numero de pecas e' " + na + ". Sua vez!");
    
    }
  }
    
  void imprimePecas ()
  {
    System.out.println ("Número de pecas atual e' " + na);
  }
    
    
  void jogadaDoComputador ()
  {
    na = na - (na % (m2+1));
    System.out.println ("Agora o numero de b pecas e' " + na + ". Sua vez!");
  }
  
  void retirarPecas ( int x )
  {
    na = na - x;
    System.out.println ("Agora o numero de pecas e' " + na);
  }
      
  
  void verificaFimDeJogo ()
  {
    if ( na == 0)
      System.out.println ("Computador venceu!");
    
    else
      System.out.println ("Vez do humano.");
    
  }
  
  void imprimePecas2 ()
  {
    System.out.println ("Número de pecas atual e' " + m2);
  }
  
}