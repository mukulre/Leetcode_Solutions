class Solution {
    public boolean isNumber(String s) {
        s.trim();// remove leading and end white spaces
        if(s.isEmpty())
            return false;
        
        boolean seenNum=false; //chk digit
        boolean seenE=false; // check e,E
        boolean seenDot=false;    //chk dot

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='.') {
                 // Only one decimal point is allowed, and it must not come after 'e'
                if(seenE || seenDot)
                    return false;
                seenDot=true;
            }
            else if(c=='+' || c=='-') {
                 // Signs can only appear at the beginning or after 'e'
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') {
                    return false;
                }
            }
            else if(c=='e' || c=='E') {
                 // 'e' or 'E' should not appear before any number, and must be followed by a valid number
                if(seenE || !seenNum)
                    return false;
                seenE=true;
                seenNum=false;  // Reset seenNum for the part after 'e'
            }
            else if(Character.isDigit(c)) {
                seenNum= true;  // Check for valid digits
            }

            else {
                return false;// Invalid character
            }

            
        }


return seenNum;// The string is valid if we have seen at least one number
        
    }
}