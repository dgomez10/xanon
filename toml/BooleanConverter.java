package com.moandjiezana.toml;

import java.util.concurrent.atomic.AtomicInteger;


class BooleanConverter implements ValueConverter {
  
  static final BooleanConverter BOOLEAN_PARSER = new BooleanConverter(); 

  @Override
  public boolean canConvert(String s) {
    return s.startsWith("true") || s.startsWith("false");
  }

  @Override
  public Object convert(String s, AtomicInteger index, Context context) {
    s = s.substring(index.get());
    Boolean b = s.startsWith("true") ? Boolean.TRUE : Boolean.FALSE;
    
    int endIndex = b == Boolean.TRUE ? 4 : 5;
    
    index.addAndGet(endIndex - 1);
    
    return b;
  }

  private BooleanConverter() {}
}
