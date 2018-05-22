/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: MedidorDeDesempenho.java                             **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/




class MedidorDeDesempenho
{
  double modulo ( double a ) // Calcula modulo de uma funcao qualquer
   {
     if ( a < 0  )
     {
       a = a * -1;
     }
     return a;
   }
  
  void tempoSeno ()  // Calcula a media do tempo decorrido de 100 execucoes da funcao seno, em nanosegundos
  {
    double media = 0;
    double desvio = 0;
    double k = 0;
    double n = 1;
    double cont = 1;
    
    while ( cont<=100 )
    {
      long a = System.nanoTime();
      CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
      double resultado = c.calculaSeno(0);
      long b = System.nanoTime();
      long d = b-a;
      media = d/cont;
      cont++;
      
      while ( cont == 1)
      {
        k = d;
      }
    }
        
    while (  n <=100 )
    {
      desvio = (1/(n-1)) * ( k - media ) * ( k - media);
      n++;
    }
    
    System.out.print ("A media do tempo decorrido de 100 execucoes da funcao seno foi de " + media);
    System.out.println (" nanosegundos, com um desvio padrao de " + desvio + ".");
  }
  
  
  void tempoCosseno ()  // Calcula a media do tempo decorrido de 100 execucoes da funcao cosseno, em nanosegundos
  {
    double media = 0;
    double desvio = 0;
    double k = 0;
    double n = 1;
    double cont = 1;
    while ( cont<=100 )
    {
      long a = System.nanoTime();
      CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
      double resultado = c.calculaCosseno(0);
      long b = System.nanoTime();
      long d = b-a;
      media = d/cont;
      cont++;
            
      while ( cont == 1)
      {
        k = d;
      }
    }
        
    while (  n <=100 )
    {
      desvio = (1/(n-1)) * ( k - media ) * ( k - media);
      n++;
    }
    
    System.out.print ("A media do tempo decorrido de 100 execucoes da funcao cosseno foi de " + media );
    System.out.println (" nanosegundos, com um desvio padrao de " + desvio + ".");
  }
    
  
  void tempoExp ()  // Calcula a media do tempo decorrido de 100 execucoes da funcao exponencial, em nanosegundos
  {
    double media = 0;
    double desvio = 0;
    double k = 0;
    double n = 1;
    double cont = 1;
    
    while ( cont<=100 )
    {
      long a = System.nanoTime();
      CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
      double resultado = c.calculaExponencial(0.0);
      long b = System.nanoTime();
      long d = b-a;
      media = d/cont;
      cont++;
            
      while ( cont == 1)
      {
        k = d;
      }
    }
        
    while (  n <=100 )
    {
      desvio = (1/(n-1)) * ( k - media ) * ( k - media);
      n++;
    }
    
    System.out.print ("A media do tempo decorrido de 100 execucoes da funcao exponencial foi de " + media );
    System.out.println (" nanosegundos, com um desvio padrao de " + desvio + ".");
  }
  
 void tempoLn ()  // Calcula a media do tempo decorrido de 100 execucoes da funcao ln, em nanosegundos
  {
    double media = 0;
    double desvio = 0;
    double k = 0;
    double n = 1;
    double cont = 1;
    
    while ( cont<=100 )
    {
      long a = System.nanoTime();
      CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
      double resultado = c.calculaLn(1);
      long b = System.nanoTime();
      long d = b-a;
      media = d/cont;
      cont++;
            
      while ( cont == 1)
      {
        k = d;
      }
    }
        
    while (  n <=100 )
    {
      desvio = (1/(n-1)) * ( k - media ) * ( k - media);
      n++;
    }
    
    System.out.print ("A media do tempo decorrido de 100 execucoes da funcao ln foi de " + media );
    System.out.println (" nanosegundos, com um desvio padrao de " + desvio + ".");
  }
 
 void tempoRaiz ()  // Calcula a media do tempo decorrido de 100 execucoes da funcao raiz quadrada, em nanosegundos
  {
    double media = 0;
    double desvio = 0;
    double k = 0;
    double n = 1;
    double cont = 1;
    
    while ( cont<=100 )
    {
      long a = System.nanoTime();
      CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
      double resultado = c.calculaRaiz(1);
      long b = System.nanoTime();
      long d = b-a;
      media = d/cont;
      cont++;
            
      while ( cont == 1)
      {
        k = d;
      }
    }
        
    while (  n <=100 )
    {
      desvio = (1/(n-1)) * ( k - media ) * ( k - media);
      n++;
    }
    
    System.out.print ("A media do tempo decorrido de 100 execucoes da funcao raiz quadrada foi de " + media );
    System.out.println (" nanosegundos, com um desvio padrao de " + desvio + ".");
  }
  
  void imprimeRelatorioDeDesempenho ()  // Imprime o relatorio de desempenho da media de 100 execucoes de cada uma
                                        // das funcoes matematicas pedidas
    {
     MedidorDeDesempenho m = new MedidorDeDesempenho ();
     m.tempoSeno();
     m.tempoCosseno();
     m.tempoRaiz();
     m.tempoLn();
     m.tempoExp();
    }
  
  void porcentagemTempoSenoFloat ()  // Calcula a porcentagem de ganho de tempo ao calcular a funcao seno utilizando
                                     // o tipo float ao invez do tipo double
  {
    double media = 0;
    double media2 = 0;
    double porcentagem = 0;
    
    for ( double cont = 1; cont <= 100 ; cont++)
     {
       long a = System.nanoTime();
       TempoSenoFloat t = new TempoSenoFloat();
       double resultado = t.calculaSenoFloat(0);
       long b = System.nanoTime();
       long d = b-a;
       media = d/cont;
       
       long a2 = System.nanoTime();
       CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
       double resultado2 = c.calculaSeno(0);
       long b2 = System.nanoTime();
       long d2 = b2-a2;
       media2 = d2/cont;
        
      }
    
    porcentagem = ((media2-media)*100)/media2;
    
    if ( porcentagem < 0 )
    {
      porcentagem = modulo (porcentagem);
      System.out.println ("Porcentagem de tempo perdido com a utilizacao de float ao invez de double foi de " + porcentagem + "%.");
    }
    else if (porcentagem > 0 )
      System.out.println ("Porcentagem de tempo ganho com a utilizacao de float ao invez de double foi de " + porcentagem + "%.");
    else
      System.out.println ("Nao houve ganho de tempo ao utilizar float ao invez de double.");
  }
  
}