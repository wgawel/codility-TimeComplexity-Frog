package pl.gawly;

public class Solution {

    public int solution(int X, int Y, int D) {
        int n = (Y - X) / D;
        return n + (n * D == (Y - X) ? 0 : 1);
    }
}
