package c.h.a.h.k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.Headers;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public URL f16921b;

    public b(URL url) {
        this.f16921b = url;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        double dCurrentTimeMillis;
        byte[] bArr = new byte[153600];
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                httpURLConnection = (HttpURLConnection) this.f16921b.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
                httpURLConnection.setRequestProperty(Headers.CONNECTION, "Keep-Alive");
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr, 0, 153600);
                dataOutputStream.flush();
                httpURLConnection.getResponseCode();
                double d2 = c.f16922b;
                double d3 = 153600;
                Double.isNaN(d3);
                Double.isNaN(d2);
                c.f16922b = (int) (d2 + (d3 / 1024.0d));
                dCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis;
                Double.isNaN(dCurrentTimeMillis);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (dCurrentTimeMillis / 1000.0d >= 10) {
                return;
            }
            dataOutputStream.close();
            httpURLConnection.disconnect();
        }
    }
}
