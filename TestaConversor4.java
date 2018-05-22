class TestaConversor4
{
  int testaTudo()
  {
    Conversor4 c4 = new Conversor4 ();
    
    double celsius = 10.0;
    double fahrenheit = 50.0;
    
    if (c4.celsiusParaFahrenheit (celsius) != fahrenheit)
      System.out.println ("C->F nao funciona para " + celsius);
    if (c4.fahrenheitParaCelsius (fahrenheit) != celsius)
      System.out.println ("F->C nao funciona para " + fahrenheit);
    
    celsius = 200.0;
    fahrenheit = 12.0;
    
     if (c4.celsiusParaFahrenheit (celsius) != fahrenheit)
      System.out.println ("C->F nao funciona para " + celsius);
    if (c4.fahrenheitParaCelsius (fahrenheit) != celsius)
      System.out.println ("F->C nao funciona para " + fahrenheit);
      
    celsius = 40.0;
    fahrenheit = 20.0;
    
     if (c4.celsiusParaFahrenheit (celsius) != fahrenheit)
      System.out.println ("C->F nao funciona para " + celsius);
    if (c4.fahrenheitParaCelsius (fahrenheit) != celsius)
      System.out.println ("F->C nao funciona para " + fahrenheit);
    
    celsius = 101.0;
    fahrenheit = 213.8;
    
     if (c4.celsiusParaFahrenheit (celsius) != fahrenheit)
      System.out.println ("C->F nao funciona para " + celsius);
    if (c4.fahrenheitParaCelsius (fahrenheit) != celsius)
      System.out.println ("F->C nao funciona para " + fahrenheit);
    
    System.out.println ("Final dos testes");
    return 0;
  }
}
    