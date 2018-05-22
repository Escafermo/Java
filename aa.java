void novaRodada ( int x )
{
  if ( a = 0 )
  {
    na = na - (na % (m2+1));
    System.out.println ("Jogada do computador. Retira " + (na % (m2+1)) + "pecas. Agora o numero de pecas e' " + na + ". Sua vez!");
    a = 1;
  }
  
  else if ( a = 1)
  {
    if ( x <= 0 )
      System.out.println ("Nâo pode retirar numeros negativo ou igual a zero!");
    else if ( x > m2 )
      System.out.println ("Nao pode retirar numero maior que o maximo! Maximo atual e' " + m2 + ".");
    else if ( x <= m2)
  {
    na = na - x;
    System.out.println ("Agora o numero de pecas e' " + na + ".");
    a = 0;
  }
    
    else if ( na == 0)
      System.out.println ("Computador venceu!");
    
  }  
  
}