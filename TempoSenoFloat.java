/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TempoSenoFloat.java                                  **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/




class TempoSenoFloat 
{
  double p = 0.00000001;  // Precisao padrao de 10e-8
  
  void definePrecisao (double x)  // Metodo para, caso o usuario queira, inserir uma precisao diferente da padrao
  { 
    p = x;
  
  }
  
  double fat ( int n ) // Metodo para calcular fatorial que sera utilizado pelas funcoes
   {
    double fat = 1;
    int i = 2;
  
    while( i <= n )
    {
      fat = fat*i;
      i++;
    }
    
   return fat;
  }
  
   double potencia ( double a , int b )  // Metodo para calcular potencia que sera utilizado pelas funcoes
  {
    if ( b == 0 )
        return 1;
    
    else
      {
        int cont = 1;
        double c = a;
    
        while ( cont < b )
        {
          a = a * c;
          cont++;
        }
      }
    
    return a;
    
  }
   
   double modulo ( double a ) // Calcula modulo de uma funcao qualquer
   {
     
     if ( a < 0  )
     {
       a = a * -1;
     }
     return a;
   }
   
  double funcaoDoSenoFloat ( float x, int k )  // Calcula o k-esimo termo da somatoria da serie de Taylor do seno (x)
  {
    return  ((potencia(-1,k) * potencia(x,(2*k+1))/fat(2*k+1)));

  }
  
    
  double calculaSenoFloat (float x)  // Metodo para calcular seno (x) usando o tipo float ao invez do tipo double
  {
   double soma = 0; 
   int k = 0;
   
   while ( modulo ( funcaoDoSenoFloat ( x, k )) >= p )
    {
      soma = soma + funcaoDoSenoFloat (x, k);   
      k++;
    }
    
    return soma;
  }
}