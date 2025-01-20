class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int n = arr.length;
        int[][] pos = new int[r*c + 1][2];
        int[] rowCount = new int[r];
        int[] colCount = new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                pos[mat[i][j]][0] = i;
                pos[mat[i][j]][1] = j; 
            }
        }

        for(int i=0;i<n;i++){
            rowCount[pos[arr[i]][0]]++;
            colCount[pos[arr[i]][1]]++;

            if(rowCount[pos[arr[i]][0]] == c || colCount[pos[arr[i]][1]] == r) return i;

        }
        return -1;
    }
}