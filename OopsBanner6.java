import java.util.*;

class UC8_OOPS_Banner {

    static Map<Character, String[]> patternMap = new HashMap<>();
    public static void main(String[] args) {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
        String word = "OOPS";
        renderBanner(word);
    }
    public static void renderBanner(String word) {
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                String[] pattern = patternMap.get(letter);
                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }
            System.out.println();
        }
    }
}