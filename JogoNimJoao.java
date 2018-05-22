class JogoNim2
{
  int n;               //Numero de pecas inicial
  int m;               //Numero de pecas maximo a retirar
  int t = n % (m+1);   //Numero de pecas a serem retiradas pelo computador
  int na;              //Numero de pecas atual
  int x;               //Numero de pecas que o humano retira
  
  void novoJogo ( int n , int m )
  {
    if ( n < m )
      System.out.println ("Inicializacao nao permitida! Numero inicial de pecas menor do que numero maximo de pecas a serem retiradas!");

    else if ( n == m )
      System.out.println ("Inicializacao nao permitida! Numero inicial de pecas igual ao numero maximo de pecas a serem retiradas!");
    
    else if ( n % (m+1) == 0 )
      System.out.println ("Por favor, comece...");
      
    else if ( n % (m+1) != 0 )
    {
      System.out.println ("Vou comecar.");
         na = n - t;
      System.out.println ("Agora o numero de pecas e' " + na + ". Sua vez!");
    
    }
    
  }
  
  
  void novaRodada ( int x )
  
  {
    if ( na < 0 )
      System.out.println ("ERRO! Inicialize de novo...");
      
      
    else if ( na > 0 )
    {
      na = na - x;
      System.out.println ("Numero de pecas agora e' " + na);
    }   
  }
  
   
}




