package _1_arrays_hashing._8_neetcode;

import java.util.ArrayList;
import java.util.List;

public class _1_8_6_EncodeDecodeString {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the next '#' delimiter
            int j = s.indexOf('#', i);

            // Extract length
            int length = Integer.parseInt(s.substring(i, j));

            // Extract the actual string using length
            String str = s.substring(j + 1, j + 1 + length);
            result.add(str);

            // Move i to the start of the next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}
