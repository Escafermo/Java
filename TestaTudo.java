/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaTudo.java                                       **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaTudo 
{
  double modulo ( double a ) // Calcula modulo da funcao
  {
    if ( a < 0  )
    {
      a = a * -1;
    }
    return a;
  }
  
  boolean igual (double x, double y, double erroAceitavel)  // Metodo boolean de calculo do erro aceitavel
  {
    if (modulo(x-y) < erroAceitavel)
      return true;
    else
      return false;
  }
  
  void testaTudo()  // Metodo que realiza todos os testes pedidos
  {
    TestaSeno testador1 = new TestaSeno();
    testador1.testaSenoZero();
    testador1.testaSenoPiSobreDois();
    testador1.testaSenoMenosPiSobreDois();
    testador1.testaSenoPiSobreQuatro();
    testador1.testaSenoMenosPiSobreQuatro();
    TestaCosseno testador2 = new TestaCosseno ();
    testador2.testaCossenoZero();
    testador2.testaCossenoPiSobreDois();
    testador2.testaCossenoMenosPiSobreDois();
    testador2.testaCossenoPiSobreQuatro();
    testador2.testaCossenoMenosPiSobreQuatro();
    TestaRaizQuadrada testador3 = new TestaRaizQuadrada ();
    testador3.testaRaizMeio();
    testador3.testaRaizUm();
    testador3.testaRaizUmQuarto();
    TestaLn testador4 = new TestaLn ();
    testador4.testaLnUm();
    testador4.testaLnMeio();
    testador4.testaLnUmQuarto();
    TestaExp testador5 = new TestaExp ();
    testador5.testaExpMeio();
    testador5.testaExpZero();
    testador5.testaExpUm();
    TestaPropriedades testador6 = new TestaPropriedades ();
    testador6.testaTeoremaFundamentalDaTrigonometriaPiSobreDois();
    testador6.testaTeoremaFundamentalDaTrigonometriaPiSobreQuatro();
    testador6.testaTeoremaFundamentalDaTrigonometriaUm();
    testador6.testaExpDeLnUmQuarto();
    testador6.testaExpDeLnMeio();
    testador6.testaExpDeLnUm();
    testador6.testaExpDeLnUmQuinto();
  }
}