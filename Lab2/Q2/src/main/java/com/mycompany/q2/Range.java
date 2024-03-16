package com.mycompany.q2;
/**
 *
 * @author ADMIN
 */
public class Range {
    
    private int start;
    private int end;
 
public Range(int s, int e)
{
 start = s;
 end = e;
}

public boolean contains(int number)
{
  int i;
  for(i=start;i<=end;i++)
  {
    if(i==number)
        return true;
  }
    return false; 
}

public static Range intersection(Range r1,Range r2)
{
  int s = Math.max(r1.start,r2.start);
  int e = Math.min(r1.end,r2.end);
    if(s<e)
        return new Range(s,e);
    else if(s == e)
        return new Range(s,s);
    else
        return null;
}
public int get_s()
{
  return start;  
}
public int get_e()
{
  return end;  
}
public void set_s(int s)
{
  start = s;  
}
public void set_e(int e)
{
  end = e;  
}
}