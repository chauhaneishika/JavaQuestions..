public class SearchMatrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){ // T.C. = 0(m+n)
            if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else return true;
        }
        //for(int i=0;i<m;i++){ //T.C. = 0(m+n)
        //    for(int j=0;j<n;j++){
        //       if(arr[i][j]==target) return true;
        //    }
        //}
        return false;
    }

    static void main() {
        int[][] arr = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        int target = 9;
        SearchMatrix sm = new SearchMatrix();
        boolean found = sm.searchMatrix(arr, target);

        System.out.println("Found? " + found);
    }
}
