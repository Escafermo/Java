class Baskara
{
  double _a;
  double _b;
  double _c;
  double _delta;  
  
  void carregaValores (double a , double b, double c)
  {
    _a = a;
    _b = b;
    _c = c;
  _delta = delta ();
  }
  
  double delta ()
  {
    return _b*_b - 4 * _a * _c;
  }
  
  int numeroDeRaizesReais ()
  {
    int resp;
    
    if (_delta < 0 )
      resp = 0;
    else if (_delta == 0 )
      resp = 1;
    else
      resp = 2;
    return resp;
    
  }
  
  void imprimeRaizesReais ()
  {
    int n = numeroDeRaizesReais();
    
    if ( n == 0)
      System.out.println ("Nao ha raizes reais!");
    else if ( n == 1)
      System.out.println ("Uma raiz real " +  (-_b/(2*_a)));
    else 
    {
      double rd = java.lang.Math.sqrt (_delta);
      double x1 = (-_b - rd)/(2*_a);
      double x2 = (-_b + rd)/(2*_a);
      System.out.println ("Duas raizes reais: " + x1 + " e " + x2);
    }
    
  }
    
}