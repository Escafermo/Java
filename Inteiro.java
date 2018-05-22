class Inteiro
{
 int _valor;
  
  void carregaValor (int val )
  {
    _valor = val;
  }
  
  int devolveValor ()
  {
    return _valor;
  }
  
  int devolveValorAbsoluto()
  {
    if ( _valor < 0)
      return -_valor;
    else
      return _valor;
  }
  
  void imprime ()
  {
   System.out.println ("O Valor é " + _valor);
  }

  int soma (int v)
  {
   _valor = _valor + v;
     return _valor;    
  }
  
  int subtrai (int v)
  {
    _valor = _valor - v;
    return _valor;
  }
  
  int multiplicaPor (int v)
  {
    _valor = _valor * v;
      return _valor;
  }
  
  int dividePor ( int divisor)
  {
    if (divisor == 0)
    {
      System.out.println ("Nao dividiras por zero!!!");
      return _valor;
    }
        else
        {
          _valor = _valor / divisor;
        return _valor;
        }
  }
}