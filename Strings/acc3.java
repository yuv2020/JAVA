package Strings;

public class acc3 {
    public static String bestMatch(String s, String[] d) {
        String bestMatch = &quot;&quot;;
        int maxCount = 0;
        for (String word : d) {
            if (s.equals(word)) {
            continue;
        }
        int count = 0;
        int minLen = Math.min(s.length(), word.length());
        for (int j = 1; j &lt;= minLen; j++) {
            if (s.charAt(s.length() - j) == word.charAt(word.length() - j)) {
                count++;
            } 
            else {
                break;
            }
        }
        
        if (count &gt; maxCount) {
            bestMatch = word;
            maxCount = count;
        }
    }
    
    if (bestMatch.isEmpty()) {
    return &quot;no words&quot;;
    } else {
    return bestMatch;
    }
    }
    public static void main(String[] args) {
    String s = &quot;thunder&quot;;
    String[] d = {&quot;phizzle&quot;, &quot;thunder&quot;, &quot;powder&quot;, &quot;blender&quot;, &quot;under&quot;};
    String s1 = &quot;try&quot;;
    String[] d1 = {&quot;try&quot;, &quot;fry&quot;, &quot;cry&quot;};
    System.out.println(bestMatch(s, d));
    System.out.println(bestMatch(s1, d1));
    }
    }