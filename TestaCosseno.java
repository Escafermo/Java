/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaCosseno.java                                    **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaCosseno 
{
  void testaCossenoZero()  // Metodo que testa o cosseno de zero: x=0
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaCosseno(0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 1.0, 0.00000001) == false)
      System.out.println("Cosseno(0): Ops! Erro");
    else
      System.out.println("Cosseno(0): Sucesso!");
  }
  
  void testaCossenoPiSobreDois() // Metodo que testa o cosseno de Pi/2: x=1.5707
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaCosseno(1.5707);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.0000963331107, 0.00000001) == false)
      System.out.println("Cosseno(Pi/2): Ops! Erro");
    else
      System.out.println("Cosseno(Pi/2): Sucesso!");
  }
  
  void testaCossenoMenosPiSobreDois() // Metodo que testa o cosseno de -Pi/2: x= -1.5707
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaCosseno(-1.5707);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.0000963331107, 0.00000001) == false)
      System.out.println("Cosseno(-Pi/2): Ops! Erro");
    else
      System.out.println("Cosseno(-Pi/2): Sucesso!");
  }
  
  void testaCossenoPiSobreQuatro() // Metodo que testa o cosseno de Pi/4: x=0.7853
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaCosseno(0.7853);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.7071761896691259, 0.00000001) == false)
      System.out.println("Cosseno(Pi/4): Ops! Erro");
    else
      System.out.println("Cosseno(Pi/4): Sucesso!");
  }
  
    void testaCossenoMenosPiSobreQuatro() // Metodo que testa o cosseno de -Pi/4: x= -0.7853
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaCosseno(-0.7853);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.7071761896691259, 0.00000001) == false)
      System.out.println("Cosseno(-Pi/4): Ops! Erro");
    else
      System.out.println("Cosseno(-Pi/4): Sucesso!");
  }
}