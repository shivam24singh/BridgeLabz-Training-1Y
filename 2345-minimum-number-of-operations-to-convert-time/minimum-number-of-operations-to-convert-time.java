class Solution {
    public int convertTime(String current, String correct) {
        int cur = Integer.parseInt(current.substring(0, 2)) * 60
                + Integer.parseInt(current.substring(3));

        int cor = Integer.parseInt(correct.substring(0, 2)) * 60
                + Integer.parseInt(correct.substring(3));

        int diff = cor - cur;
        int count = 0;

        count += diff / 60;
        diff %= 60;

        count += diff / 15;
        diff %= 15;

        count += diff / 5;
        diff %= 5;

        count += diff;

        return count;
    }
}