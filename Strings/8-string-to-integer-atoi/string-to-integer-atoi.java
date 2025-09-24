class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        String result = "";
        boolean isNeg = false;
        boolean notFirst = false;
        boolean signEncountered = false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // skip leading spaces
            if (c == ' ' && !notFirst && !signEncountered) {
                continue;
            }

            // Handle sign
            if ((c == '-' || c == '+') && !notFirst && !signEncountered) {
                isNeg = (c == '-');
                signEncountered = true;
                continue;
            }

            // Break on non-digit
            if (c < '0' || c > '9') {
                if (!notFirst) {
                    return 0;
                } else {
                    break;
                }
            }

            // Append digit to result
            result += c;
            notFirst = true;
        }

        if (result.equals("")) {
            return 0;
        }

        // Build number manually to avoid overflow
        long ans = 0;
        for (int i = 0; i < result.length(); i++) {
            int digit = result.charAt(i) - '0';

            // Overflow check
            if (ans > (Long.MAX_VALUE - digit) / 10) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
        }

        if (isNeg) {
            ans = -ans;
        }

        // Clamp within integer bounds
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }
}
