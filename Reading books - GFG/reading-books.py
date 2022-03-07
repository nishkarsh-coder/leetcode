#User function Template for python3

class Solution:
    def maxPoint(self, N, K, A, B):
        # code here
        res=0
        for i in range(N):
            x=K//A[i]
            point=x*B[i]
            res=max(point,res)
        return res

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N, K = [int(x) for x in input().split()]
        A = input().split()
        B = input().split()
        for i in range(N):
            A[i] = int(A[i])
            B[i] = int(B[i])
        
        ob = Solution()
        print(ob.maxPoint(N, K, A, B))
# } Driver Code Ends