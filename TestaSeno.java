/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaSeno.java                                       **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaSeno 
{
  void testaSenoZero() // Metodo que testa o seno de zero: x=0
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaSeno(0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.0, 0.00000001) == false)
      System.out.println("Sen(0): Ops! Erro");
    else
      System.out.println("Sen(0): Sucesso!");
  }
  
  void testaSenoPiSobreDois() // Metodo que testa o seno de Pi sobre dois: x=1.5707
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaSeno(1.5707);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 1.0, 0.00000001) == false)
    {System.out.println (resultado);
      System.out.println("Sen(Pi/2): Ops! Erro");}
    else
      System.out.println("Sen(Pi/2): Sucesso!");
  }
  
  void testaSenoMenosPiSobreDois() // Metodo que testa o seno de menos Pi sobre dois: x= -1.5707
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaSeno(-1.5707);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, -1.0, 0.00000001) == false)
      System.out.println("Sen(-Pi/2): Ops! Erro");
    else
      System.out.println("Sen(-Pi/2): Sucesso!");
  }
  
  void testaSenoPiSobreQuatro() // Metodo que testa o seno de Pi sobre quatro: x=0.7853
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaSeno(0.7853);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.7070373675237164, 0.00000001) == false)
      System.out.println("Sen(Pi/4): Ops! Erro");
    else
      System.out.println("Sen(Pi/4): Sucesso!");
  }
  
    void testaSenoMenosPiSobreQuatro() // Metodo que testa o seno de menos Pi sobre quatro: x= -0.7853
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaSeno(-0.7853);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, -0.7070373675237164, 0.00000001) == false)
      System.out.println("Sen(-Pi/4): Ops! Erro");
    else
      System.out.println("Sen(-Pi/4): Sucesso!");
  }
}