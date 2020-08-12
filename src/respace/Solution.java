package respace;

import java.util.Arrays;

public class Solution {
    /**
     *哦，不！你不小心把一个长篇文章中的空格、标点都删掉了，并且大写也弄成了小写。
     * 像句子"I reset the computer. It still didn’t boot!"已经变成了"iresetthecomputeritstilldidntboot"。
     * 在处理标点符号和大小写之前，你得先把它断成词语。
     * 当然了，你有一本厚厚的词典dictionary，不过，有些词没在词典里。
     * 假设文章用sentence表示，设计一个算法，把文章断开，要求未识别的字符最少，返回未识别的字符数。
     *
     * 注意：本题相对原题稍作改动，只需返回未识别的字符数
     *
     * 示例：
     *
     * 输入：
     * dictionary = ["looked","just","like","her","brother"]
     * sentence = "jesslookedjustliketimherbrother"
     * 输出： 7
     * 解释： 断句后为"jess looked just like tim her brother"，共7个未识别字符。
     * 提示：
     *
     * 0 <= len(sentence) <= 1000
     * dictionary中总字符数不超过 150000。
     * 你可以认为dictionary和sentence中只包含小写字母。
     */
    public int respace(String[] dictionary, String sentence) {
        /**
         * 该方法有两个问题：
         * 1、删除字符串, 生成新的字符串, 可能会生成匹配字典中数据的字符串 比如 [aaaa, bbbbb], aaabbbbbaaa
         * 2、如果使用匹配字符串使用空格占位的话, 会出现 字典中的数据存在长度相等的字符串数据, 存在先后删除的原因, 使得结果存在偏差
         */
        int len = 0;
        if(sentence.length() == 0){
            return len;
        }
        //首先，给dictionary进行排序，长的在前面，短的在后面
        for (int i = 0; i < dictionary.length; i++) {
            for (int j = i+1; j < dictionary.length; j++) {
                String pre = dictionary[i];
                String next = dictionary[j];
                if(next.length() > pre.length()){
                    dictionary[i] = next;
                    dictionary[j] = pre;
                }
            }
        }
        for (String s : dictionary) {
            if (sentence.contains(s)) {
                //语句中包含字典项中的字符
                sentence = sentence.replaceAll(s, " ");
            }
        }
        return sentence.replaceAll(" ","").length();
    }

    /**
     * 使用字典树trie+动态规划
     * @param dictionary
     * @param sentence
     * @return
     */
    public int respace1(String[] dictionary, String sentence) {
        int n = sentence.length();

        Trie root = new Trie();
        for (String word: dictionary) {
            root.insert(word);
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            dp[i] = dp[i - 1] + 1;

            Trie curPos = root;
            for (int j = i; j >= 1; --j) {
                int t = sentence.charAt(j - 1) - 'a';
                if (curPos.next[t] == null) {
                    break;
                } else if (curPos.next[t].isEnd) {
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
                if (dp[i] == 0) {
                    break;
                }
                curPos = curPos.next[t];
            }
        }
        return dp[n];
    }

    /**
     * trie树（字典树、前缀树）
     */
    static class Trie {
        public Trie[] next;
        public boolean isEnd;

        public Trie() {
            next = new Trie[26];
            isEnd = false;
        }

        /**
         * 插入字符串（反序插入）
         * @param s 字符串
         */
        public void insert(String s) {
            Trie curPos = this;

            for (int i = s.length() - 1; i >= 0; --i) {
                int t = s.charAt(i) - 'a';
                if (curPos.next[t] == null) {
                    curPos.next[t] = new Trie();
                }
                curPos = curPos.next[t];
            }
            curPos.isEnd = true;
        }
    }
}
