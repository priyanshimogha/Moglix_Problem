class Brute {
  public int longestValidParentheses(String s) {
    int max = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 2; j <= s.length(); j += 2) {
        if (isValid(s.substring(i, j))) {
          max = Math.max(max, j - i);
        }
      }
    }

    return max;
  }

  private boolean isValid(String str) {
    int count = 0;

    for (char ch : str.toCharArray()) {
      if (ch == '(') {
        count++;
      } else {
        count--;
      }

      if (count < 0) {
        return false;
      }
    }

    return count == 0;
  }
}