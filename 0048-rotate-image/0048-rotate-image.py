class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        
        # transpose of matrix row to column
        '''
        1. first row to last column
        2. second row to thired col
        3. thrid row second col
        4. fourth row to first col
        '''

        for i in range(n):
            for j in range(i +1,n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

                # reversing rows only
        for i in range(n):
                    matrix[i].reverse()