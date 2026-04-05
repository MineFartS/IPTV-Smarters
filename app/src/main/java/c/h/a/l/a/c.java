package c.h.a.l.a;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.amazonaws.http.HttpHeader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AsyncTask<String, String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f17945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileDescriptor f17947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f17948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17949e;

    public interface a {
        void a(File file);
    }

    public c(String str, Context context, a aVar) {
        this.f17946b = context;
        this.f17945a = aVar;
        this.f17949e = str;
    }

    public void a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        boolean z;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.connect();
            do {
                if (httpURLConnection.getResponseCode() == 301 || httpURLConnection.getResponseCode() == 302) {
                    httpURLConnection = (HttpURLConnection) new URL(httpURLConnection.getHeaderField(HttpHeader.LOCATION)).openConnection();
                    httpURLConnection.connect();
                    z = true;
                } else {
                    z = false;
                }
            } while (z);
            int contentLength = httpURLConnection.getContentLength();
            Log.d("DOWNLOADFILE", "Length of the file: " + contentLength);
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f17949e);
            this.f17948d = file;
            a(file.getParent());
            FileOutputStream fileOutputStream = new FileOutputStream(this.f17948d);
            Log.d("DOWNLOADFILE", "file saved at " + this.f17948d.getAbsolutePath());
            this.f17947c = fileOutputStream.getFD();
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return null;
                }
                j2 += (long) i2;
                publishProgress(BuildConfig.FLAVOR + ((int) ((100 * j2) / ((long) contentLength))));
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f17945a;
        if (aVar != null) {
            aVar.a(this.f17948d);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(String... strArr) {
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }
}
