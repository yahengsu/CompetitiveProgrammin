class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] move = moves.toCharArray();
        for(int i = 0; i < move.length; i++) {
            if(move[i] == 'U'){
                x++;
            }
            else if(move[i] == 'D'){
                x--;
            }
            else if(move[i] == 'L'){
                y--;
            }
            else if (move[i] == 'R') {
                y++;
            }
        }
        boolean result = (x == 0) && (y == 0) ? true : false;
        return result;
    }
}