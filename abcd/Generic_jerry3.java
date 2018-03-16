package abcd;


class Generic_jerry3<T,S,U>{
  private T var1;
  private S var2;
  private U var3;

  Generic_jerry3(T value1, S value2, U value3){
    var1 = value1;
    var2 = value2;
    var3 = value3;
  }

  public T getT()
  {
    return var1;
  }

  public S getS()
  {
    return var2;
  }

  public U getU()
  {
    return var3;
  }
}

