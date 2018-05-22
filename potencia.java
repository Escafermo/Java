class Potencia
{

  double calculaPotencia ( double a , int b )
  {
    int cont = 1;
    double c = a;
    
    while ( cont < b )
    {
      a = a * c;
      cont++;
    }
    
    return a;
    
  }
}