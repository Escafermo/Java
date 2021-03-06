/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaExp.java                                        **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaExp
{
  void testaExpUm() // Metodo que testa o exponencial de um: x=1
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaExponencial(1.0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 2.718281828, 0.00000001) == false)
      System.out.println("Exp(1.0): Ops! Erro");
    else
      System.out.println("Exp(1.0): Sucesso!");
  }
  
  void testaExpMeio() // Metodo que testa o exponencial de meio: x=1/2
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaExponencial(0.5);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 1.648721271, 0.00000001) == false)
      System.out.println("Exp(0.5): Ops! Erro");
    else
      System.out.println("Exp(0.5): Sucesso!");
  }
  
   void testaExpZero() // Metodo que testa o exponencial de zero: x=0
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaExponencial(0.0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 1.0, 0.00000001) == false)
      System.out.println("Exp(0.0): Ops! Erro");
    else
      System.out.println("Exp(0.0): Sucesso!");
  }
    
}