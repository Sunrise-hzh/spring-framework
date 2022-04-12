package com.sunrise.sf.core.containerOverview;

import org.springframework.util.DigestUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Maindemo {
    public static void main(String[] args) {
//        String code = "600239";
//        String s = "dygas232b2e8e-402b-11ec-92d2-fa163ee36d30" + code;
//        String s1 = DigestUtils.md5DigestAsHex(s.getBytes(StandardCharsets.UTF_8));
//        System.out.println(s1);
//        System.out.println("" +
//"https://wp.dyg.com.cn/login?userid=e18bf9f4-61f9-11ec-8ff7-fa163ee36d30&tokenid=0bda50ea-d36f-490c-bdcb-0b2b4c0cf174&redirect=/preview?gns=FB3E6DDA38B64780AB4B21CA9F7B6505/418ED07171034095AC24DDC23B1CF8E9");

        // 方法签名
        System.out.println("方法签名");
        doPostThirdApi("createuser");
    }

    public static final String APPID = "dygas";
    public static final String APPKEY = "232b2e8e-402b-11ec-92d2-fa163ee36d30";

    public static void doPostThirdApi(String method) {
        String bodyJson = "{\"loginName\": \"015412\", \"displayName\": \"王林\", \"password\": \"Dyg@hec20211111.\",\"type\":1,\"depIds\":[\"453617e2-66e0-11ec-b85f-fa163ee36d30\"]}";

        System.out.println(calcShaHash(method, bodyJson));
    }

    private static String calcShaHash (String method, String body) {
        String data = "dygas"+method+body;
        String HMAC_SHA1_ALGORITHM = "HmacSHA1";
        String result = null;
        try {
            Key signingKey = new SecretKeySpec(APPKEY.getBytes(), HMAC_SHA1_ALGORITHM);
            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
            result = Base64.getEncoder().encodeToString(rawHmac);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
