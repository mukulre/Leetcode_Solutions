class Solution(object):
    def pathSum(self, r, t):
        a=[]
        l=[]
        def ps(r,t,l):
            if not r:
                return 
            if not r.left and not r.right and r.val==t:
                l=l+[r.val]
                a.append(l)
            t=t-r.val
            ps(r.left,t,l+[r.val])
            ps(r.right,t,l+[r.val])
        ps(r,t,l)
        return a