class Inteiro
{
  int _valor;
  
  void carregaValor ( int val )
  {
    _valor = val;
  }
  
  int devolveValor ()
  {
    if ( _valor < 0)
      return - _valor;
      
    else
      return _valor;    
  }
  
  int soma ( int v)
  {
    _valor = _valor +v;
    return _valor;
  }
  
  int sub (int v)
  {
    _valor = _valor - v;
    return _valor;
  }
  
  int multiplicaPor ( int v )
  {
    _valor = _valor * v;
    return _valor;
  }
  
  int dividePor ( int v )
  {
    if ( v == 0 )
      System.out.println ("Não dividirás por zero!");
      
    else
    {
      _valor = _valor / v;
      return _valor;
    }
  return _valor;
  }
  
}