class Conversor5
{
  double celsiusParaFahrenheit ( double c )
  {
    return 9.0 * c / 5.0 + 32.0;
  }
  double celsiusParaKelvin ( double c )
  {
    return c - 273;
  }
  double fahrenheitParaCelsius ( double f )
  {
    return 5 * ( f - 32 ) / 9;
  }
  double fahrenheitParaKelvin ( double f )
  {
    return 5 * ( f + 241 ) / 9;
  }
  double kelvinParaCelsius ( double k )
  {
    return k + 273;
  }
  double kelvinParaFahrenheit ( double k )
  {
    return 9 * ( k - 241 ) / 5;
  }
}