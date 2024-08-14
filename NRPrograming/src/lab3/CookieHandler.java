package lab3;

import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL; // Corrected the import statement
import java.util.List;
import java.util.Map;

public class CookieHandler {
    public static void main(String[] args) {
        try {
            CookieManager cookieManager = new CookieManager();
            java.net.CookieHandler.setDefault(cookieManager); 
            
            URL url = new URL("https://www.amazon.com/iBuyPower-Computer-Desktop-Y40313A-Geforce/dp/B0BQXGWTXL/ref=sr_1_1?_encoding=UTF8&content-id=amzn1.sym.6afe7900-0834-4d0d-afa0-213431caed72&dib=eyJ2IjoiMSJ9.IyNfXE8rGE4YIILccSlty8yk9IME1hyBvmNkHs2UApuA5Nbp5zOlayt2qpiIsxmXa52V58eICXAaQOUvSQfJ8iUCHuxHmP_Pq6ZDJ_ek3-WNyp_Kvk6yy2ndRncV56MYt55NiwWk1tCftF-XQixa4O3T7tKCVOmSwHsvTbFEKeJ7CwFTaMZWOFWs1X9ZW2Z5cn6UMSngOZHpAGz8wJp6RgDBnSe6zJWP9oe9CpPmWMw.EGdWFhnOhPd3w1KZc3GzgK_9R0HeB9XeuJWgN6jqCJ4&dib_tag=se&keywords=computers&pd_rd_r=c94f6ca2-46e7-4d42-9dfd-ac4e2c80dd67&pd_rd_w=OU6CH&pd_rd_wg=BRsiZ&pf_rd_p=6afe7900-0834-4d0d-afa0-213431caed72&pf_rd_r=HC58E6858SWDTTDWVAYM&qid=1719719254&refinements=p_n_deal_type%3A23566065011&sr=8-1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); 
            
            connection.setRequestMethod("GET");
            connection.connect();
            
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            List<String> cookiesHeader = headerFields.get("Set-Cookie");
            if (cookiesHeader != null) { 
                for (String cookie : cookiesHeader) {
                    cookieManager.getCookieStore().add(null, HttpCookie.parse(cookie).get(0));
                }
            }
            System.out.println("Cookies: " + cookieManager.getCookieStore().getCookies()); 
            
            connection.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
