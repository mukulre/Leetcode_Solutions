class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        int x=numRows-2;
        if(x<0) x=0;
        if(numRows==1) return s;

        boolean nextDiag = true;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(j,j+1);
                ans+=a;
                if(i==0 || i==numRows-1){
                    //currently top or bottom row
                    //no letters in middle
                    j+=numRows-1+x;
                } 
                else if(j<numRows || nextDiag){ //if not in diagonal, or if its first column
                    j+=numRows+x-(i*2)-1;
                    nextDiag=false;
                } else { //else its in the diagonal
                    j+=(i*2)-1;
                    nextDiag=true;
                }
            }
        }


        return ans;

    }
}