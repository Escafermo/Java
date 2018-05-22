/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaLn.java                                         **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaLn
{
  void testaLnUm() // Metodo que testa o ln de um: x=1
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaLn(1.0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.0, 0.00000001) == false)
      System.out.println("Ln(1.0): Ops! Erro");
    else
      System.out.println("Ln(1.0): Sucesso!");
  }
  
  void testaLnMeio() // Metodo que testa o ln de meio: x=0.5
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaLn(0.5);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, -0.6931471705947683, 0.00000001) == false)
      System.out.println("Ln(0.5): Ops! Erro");
    else
      System.out.println("Ln(0.5): Sucesso!");
  }
  
  void testaLnUmQuarto() // Metodo que testa o ln de um quarto: x=0.25
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaLn(0.25);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, -1.386294329541158, 0.00000001) == false)
      System.out.println("Ln(0.25): Ops! Erro");
    else
      System.out.println("Ln(0.25): Sucesso!");
  }
    
}