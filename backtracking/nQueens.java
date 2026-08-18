class Solution {
    void nqueen(int col,char[][] board,int[] leftrow,int[] lowerd,int[] upperd,List<List<String>> ans,int n){
        if(col==n) {
           List<String> list=new ArrayList<>();
           for(int row=0;row<n;row++){
             list.add(new String(board[row]));
           }
            ans.add(list);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && lowerd[row+col]==0 && upperd[(n-1)+col-row]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                lowerd[row+col]=1;
                upperd[(n-1)+col-row]=1;
                nqueen(col+1,board,leftrow,lowerd,upperd,ans,n);
                board[row][col]='.';
                leftrow[row]=0;
                lowerd[row+col]=0;
                upperd[(n-1)+col-row]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
           Arrays.fill(board[i],'.');
        }
        int[] leftrow=new int[n];
        int[] lowerd=new int[2*n-1];
        int[] upperd=new int[2*n-1];
        nqueen(0,board,leftrow,lowerd,upperd,ans,n);
        return ans;
        
    }
}