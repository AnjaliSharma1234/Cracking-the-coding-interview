public static boolean isUnique( String s ) {
        
        if ( s.length() > 256 ) return false ;
        
        boolean [] temp = new boolean[256];
        
        for ( int i = 0 ; i < s.length() ; i++ ) {
            
            int index = (int)s.charAt(i);
            
            if (temp[index]) {
                return false;
            }
            
            temp[index] = true ;
            
        }
        
        return true ;
}
