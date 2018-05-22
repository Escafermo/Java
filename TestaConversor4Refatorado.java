class TestaConversor4Refatorado
{
  int testePontual ( double celsius ,  double fahrenheit)
  {
    Conversor4 c4 = new Conversor4 ();
    if (c4.celsiusParaFahrenheit (celsius) != fahrenheit)
          System.out.println ("C->F nao funciona para " + celsius);
    if (c4.fahrenheitParaCelsius (fahrenheit) != celsius)
          System.out.println ("F-> nao funciona para " + fahrenheit);
    
    return 0;
  }
  
  int testaTudo()
    
  {
    testePontual ( 100.0 , 50.0 );
    testePontual( 22.0, 71.6 );
    testePontual( 101.0, 213.8 );
  
    System.out.println ("Fim dos testes");
    return 0;
    
  }
}