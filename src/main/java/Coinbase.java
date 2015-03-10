

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class CoinbaseExample {

    static String API_KEY = "FSDgDrPrhUous5p4";

    static String API_SECRET = "NfGzjzNy6zfCpeLG41pR0pbmN9AuoxQA";

    public static String getHttp(String url, String body)
            throws InvalidKeyException, NoSuchAlgorithmException,
            ClientProtocolException, IOException {

        String nonce = String.valueOf(System.currentTimeMillis());
        String message = nonce + url + (body != null ? body : "");

        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(API_SECRET.getBytes(), "HmacSHA256"));
        String signature = new String(Hex.encodeHex(mac.doFinal(message.getBytes())));

        HttpRequestBase request;
        if (body == null || body.length() == 0)
            request = new HttpGet(url);
        else {
            HttpPost post = new HttpPost(url);
            post.setEntity(new StringEntity(body));
            request = post;
        }
        request.setHeader("ACCESS_KEY", API_KEY);
        request.setHeader("ACCESS_SIGNATURE", signature);
        request.setHeader("ACCESS_NONCE", nonce);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        if (entity != null)
            return EntityUtils.toString(entity);
        return null;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getHttp("https://api.coinbase.com/v1/account/balance", null));
    }
}