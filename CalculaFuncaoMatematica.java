/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: CalculaFuncaoMatematica.java                         **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class CalculaFuncaoMatematica 
{
  double p = 0.00000001;  // Precisao padrao de 10e-8
  
  void definePrecisao (double x)  // Metodo para, caso o usuario queira, inserir uma precisao diferente da padrao,
                                  // como, por exemplo, 0.001 tres casas decimais.
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
    
  
  double funcaoDoSeno ( double x, int k )  // Calcula o k-esimo termo da somatoria da serie de Taylor do seno (x)
  {
    return  ((potencia(-1,k) * potencia(x,(2*k+1))/fat(2*k+1)));

  }
  
    
  double calculaSeno (double x)  // Metodo para calcular seno (x), em radianos
  {
   double soma = 0; 
   int k = 0;
   
   while ( modulo ( funcaoDoSeno ( x, k )) >= p )
    {
      soma = soma + funcaoDoSeno (x, k);   
      k++;
    }
    
    return soma;
  }
  
  
  double funcaoDoCosseno ( double x, int k ) // Calcula o k-esimo termo da somatoria da serie de Taylor do cosseno (x)
  {
    return ((potencia(-1,k) * potencia(x,(2*k))/fat(2*k)));
  }
  
  
  double calculaCosseno (double x)  // Metodo para calcular cosseno (x), em radianos
  {
    double soma = 0;
    int k = 0;
           
    while ( modulo ( funcaoDoCosseno ( x, k )) >= p )
    {
      soma = soma + funcaoDoCosseno ( x, k);
      k++;
    }
    return soma;
  }
  
  
  double funcaoDoLn ( double x, int k )  // Calcula o k-esimo termo da somatoria da serie de Taylor do ln (x)
  {
    return potencia (-1,k-1) * potencia ( x, k) / k;
  }
  
  double calculaLn ( double umMaisX )  // Metodo para calcular funcao ln (x)
  {
    double x = umMaisX - 1;
    double soma = 0;
    int k = 1;
    
    if (umMaisX==0 || modulo(x)>=1)
    {
      System.out.println("Ln: Valor invalido para a funcao");
      return 0;
    }
    
    while ( modulo (funcaoDoLn ( x, k )) >= p )
    {
      soma = soma + funcaoDoLn ( x, k);
      k++;
    }
    return soma;
    
  }
  
  double funcaoDaRaiz ( double x, int k )  // Calcula o k-esimo termo da somatoria da serie de Taylor da raiz (x)
                                           // onde os resultador valem para x maior que zero e x menor ou igual a um
  {
    return (potencia(-1,k) * fat(2*k))/((1-2*k)*fat(k)*fat(k)*potencia(4,k)) * potencia(x,k);
  }
  
  double calculaRaiz (double umMaisX)  // A partir do exemplo da serie de Taylor para o calculo da raiz quadrada,
                                       // os resultados valem para x maior que zero e x menor ou igual a um
  {
    double x = umMaisX - 1;
    double soma = 0;
    int k = 0;
    
    while ( modulo (funcaoDaRaiz ( x, k )) >= p )
    {
      soma = soma + funcaoDaRaiz ( x, k);
      k++;
    }
    return soma;
  }
  
  double funcaoDoExp ( double x, int k )  // Calcula o k-esimo termo da somatoria da serie de Taylor do exponencial (x)
  {
    return potencia ( x, k) / fat(k);
  }
  
  double calculaExponencial (double x)  // Metodo para calcular o exponencial (x)
  {
    double soma = 0;
    int k = 0;
    
    while ( modulo (funcaoDoExp ( x, k )) >= p )
    {
      soma = soma + funcaoDoExp ( x, k);
      k++;
    }
    return soma;
  }
  
  double calculaTeorema (double x)  // Metodo que calcula o teorema fundamental da trigonometria: cos^2 + sen^2 = 1
  {
    double a = calculaSeno(x)*calculaSeno(x) + calculaCosseno(x)*calculaCosseno(x);
    return a;
  }
  
  double calculaExpLn (double x)
  {
    double a = calculaExponencial (calculaLn(x));
    return a;
  }
  
}