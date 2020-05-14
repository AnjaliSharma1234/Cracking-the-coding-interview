String sort ( String s ) {

  char [] temp = s.toCharArray();
  java.util.Arrays.sort(temp);
  return new String ( temp ) ;

 }
  
boolean permutations ( String s , String t ) {

  if ( s.length() != t.length() ) {
    return false ;
  }
  
  return sort(s).equals(sort(t)) ;
  
}

