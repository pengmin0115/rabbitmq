package com.rabbit;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

/**
 * @author: pengmin
 * @date: 2021/11/9 14:27
 */
public class MessageDecodeTest {
    @Test
    public void decodeMessage(){
        String msg = "rO0ABXNyAB9jb20uYWxpYmFiYS5mYXN0anNvbi5KU09OT2JqZWN0AAAAAAAAAAECAAFMAANtYXB0AA9MamF2YS91dGlsL01hcDt4cHNyABFqYXZhLnV0aWwu\n" +
                "SGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAx3CAAAABAAAAADdAACazF0AAJ2MXQAAmsydAACdjJ0AAJrM3QA\n" +
                "AnYzeA==";
        System.out.println(JSONObject.parse(new String(Base64.decodeBase64(msg.getBytes(StandardCharsets.UTF_8)))));
    }
}
