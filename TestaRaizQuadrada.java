/*******************************************************************/
/** MAC 115 - Introducao a Computacao                             **/
/** IME-USP - Segundo Semestre de 2009                            **/
/** Professor: Marecelo Finger                                    **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/** Arquivo: TestaRaizQuadrada.java                               **/
/**                                                               **/
/** Bruno Malta - Numero Usp: 5126225                             **/
/** Joao Pedro Maldosa - Numero Usp: 6800938                      **/
/**                                                               **/
/**        01/11/2009                                             **/
/*******************************************************************/



class TestaRaizQuadrada
{
  void testaRaizMeio() // Metodo que testa o raiz de meio: x=0.5
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaRaiz(0.5);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.7071067935519466, 0.00000001) == false)
      System.out.println("Raiz(0.5): Ops! Erro");
    else
      System.out.println("Raiz(0.5): Sucesso!");
  }
  
  void testaRaizUm() // Metodo que testa o raiz de um: x=1
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaRaiz(1.0);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 1.0, 0.00000001) == false)
      System.out.println("Raiz(1): Ops! Erro");
    else
      System.out.println("Raiz(1): Sucesso!");
  }
  
   void testaRaizUmQuarto() // Metodo que testa o raiz de um quarto: x=0.25
  {
    CalculaFuncaoMatematica c = new CalculaFuncaoMatematica();
    double resultado = c.calculaRaiz(0.25);
    TestaTudo comparador = new TestaTudo();
    if (comparador.igual(resultado, 0.5000000297111, 0.00000001) == false)
      System.out.println("Raiz(0.25): Ops! Erro");
    else
      System.out.println("Raiz(0.25): Sucesso!");
  }
    
}