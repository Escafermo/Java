class Retangulo
{
  double lado1;
  double lado2;
  
  void carregaLados ( double l1 , double l2 )
  {
   lado1 = l1;
   lado2 = l2;
  }
  
  double calculaPerimetro ()
  {
    return 2 * (lado1+lado2);
  }
  
  double calculaArea ()
  {
    return lado1*lado2;
  }
}