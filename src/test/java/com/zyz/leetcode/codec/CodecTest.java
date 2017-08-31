package com.zyz.leetcode.codec;

/**
 * @author Zhang Yuanzhuo.
 */
public class CodecTest {
    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";

        Codec codec = new Codec();

        String encode = codec.encode(url);
        System.out.println(encode);

        String decode = codec.decode(encode);
        System.out.println(decode);

//        System.out.println("a: " + (int) 'a' + "\nz: " + (int) 'z' +
//                "\nA: " + (int) 'A' + "\nZ: " + (int) 'Z' +
//                "\n0: " + (int) '0' + "\n9: " + (int) '9');
    }
}