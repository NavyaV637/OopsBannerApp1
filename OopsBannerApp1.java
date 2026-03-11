class UC6_OOPS_Banner_StaticFunctions {
    public static void main(String[] args) {
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();
        for (int i = 0; i < 7; i++) {
            String line = String.join(" ", O[i], O[i], P[i], S[i]);
            System.out.println(line);
        }
    }
    public static String[] buildO() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }
    public static String[] buildP() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }
    public static String[] buildS() {
        return new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }
}