public  class TempMethods{
  public double C_F(double C)
  {
    double F = (C * 9/5) + 32;
    return F;
  }

  public double C_K(double C)
  {
    double K = C + 273.15;
    return K;
  }
  
  
  public double F_C(double F)
  {
    double C = (F - 32) * 5/9;
    return C;
  }
  
  public double F_K(double F)
  {
    double K = (F - 32) * 5/9 + 273.15;
    return K;
  }
  
  
  public double K_C(double K)
  {
    double C = K - 273.15;
    return C;
  }
  
  public double K_F(double K)
  {
    double F = (K - 273.15) * 9/5 + 32;
    return F;
  }
	}