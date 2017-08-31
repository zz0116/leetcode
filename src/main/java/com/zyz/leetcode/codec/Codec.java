package com.zyz.leetcode.codec;

/**
 * @author Zhang Yuanzhuo.
 */
public class Codec {

    private String alia;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int aliaEnd = longUrl.indexOf('-');
        alia = longUrl.substring(0, aliaEnd+1);
        String ret = "http://" + longUrl.substring(aliaEnd+1, longUrl.length());
        ret += ".com/" + rondomString(6);
        return ret;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String ret = alia;
        int dot = shortUrl.indexOf('.');
        ret += shortUrl.substring(7, dot);
        return ret;
    }

    private String rondomString(int n) {
        StringBuffer s = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            s.append(randomChar());
        }
        return String.valueOf(s);
    }

    private char randomChar() {
        /*
          '0'~'9': 48~57
          'A'~'Z': 65~90
          'a'~'z': 97~122
          10+26+26=62个数
          从62个数里面随机取出一个，转换为对应字符
        */
        int random = (int) (Math.random() * 62);
        if (random < 10) {
            random += 48;
        } else if (random < 36) {
            random = random - 10 + 65;
        } else {
            random = random - 36 + 97;
        }
        return (char) random;
    }
}