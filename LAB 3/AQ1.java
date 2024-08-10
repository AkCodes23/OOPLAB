class FourDigitCombinations {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        
        System.out.println("Case 1: Duplication of digit is allowed");
        withdup(digits);
        
        System.out.println("\nCase 2: Duplication of digit is not allowed");
        nodup(digits);
    }

    // Case 1: Duplication of digit is allowed
    public static void withdup(int[] digits) {
        for (int i : digits) {
            for (int j : digits) {
                for (int k : digits) {
                    for (int l : digits) {
                        System.out.println("" + i + j + k + l);
                    }
                }
            }
        }
    }

    // Case 2: Duplication of digit is not allowed
    public static void nodup(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (j == i) continue;
                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < digits.length; l++) {
                        if (l == i || l == j || l == k) continue;
                        System.out.println("" + digits[i] + digits[j] + digits[k] + digits[l]);
                    }
                }
            }
        }
    }
}

