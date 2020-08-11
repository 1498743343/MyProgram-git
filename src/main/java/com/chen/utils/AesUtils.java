package com.chen.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AesUtils {
    private static final String KEY_ALGORITHM = "AES";
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String CHARSET = "utf8";
    private static final String KEY_STR = "5f98H*^hsfa%dfs$";

    public AesUtils() {
    }

    public static String encrypt(String var0) {
        return encrypt(var0, "5f98H*^hsfa%dfs$");
    }

    public static String decrypt(String var0) {
        return decrypt(var0, "5f98H*^hsfa%dfs$");
    }

    private static String encrypt(String var0, String var1) {
        try {
            Cipher var2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] var3 = var0.getBytes(Charset.forName("utf8"));
            SecretKeySpec var4 = new SecretKeySpec(var1.getBytes(Charset.forName("utf8")), "AES");
            var2.init(1, var4);
            byte[] var5 = var2.doFinal(var3);
            return (new String(Base64.getEncoder().encode(var5), StandardCharsets.UTF_8)).replace("\r\n", "");
        } catch (Exception var6) {
            var6.printStackTrace();
            return var0;
        }
    }

    private static String decrypt(String var0, String var1) {
        try {
            Cipher var2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec var3 = new SecretKeySpec(var1.getBytes(Charset.forName("utf8")), "AES");
            var2.init(2, var3);
            byte[] var4 = var2.doFinal(Base64.getDecoder().decode(var0.replace("\r\n", "").getBytes(StandardCharsets.UTF_8)));
            return new String(var4, Charset.forName("utf8"));
        } catch (Exception var5) {
            var5.printStackTrace();
            return var0;
        }
    }
}
