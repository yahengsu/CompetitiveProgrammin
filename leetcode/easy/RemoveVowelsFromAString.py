class Solution:
    def removeVowels(self, S: str) -> str:
        c = "aeiou"
        
        for v in c:
            S = S.replace(v, "")
        
        return S