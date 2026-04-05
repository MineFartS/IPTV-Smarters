package c.f.c.u;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class q implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f16394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.c.o.i<Bitmap> f16395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile InputStream f16396d;

    public q(URL url) {
        this.f16394b = url;
    }

    public static q l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new q(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            c.f.a.c.j.f.h.a(this.f16396d);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }

    public Bitmap d() throws IOException {
        String strValueOf = String.valueOf(this.f16394b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrI = i();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrI, 0, bArrI.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.f16394b);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf3 = String.valueOf(this.f16394b);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final byte[] i() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f16394b.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.f16396d = inputStream;
            byte[] bArrA = c.f.a.c.j.f.g.a(c.f.a.c.j.f.g.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String strValueOf = String.valueOf(this.f16394b);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(bArrA.length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrA.length <= 1048576) {
                return bArrA;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    c.f.a.c.j.f.o.a(th, th2);
                }
            }
            throw th;
        }
    }

    public c.f.a.c.o.i<Bitmap> m() {
        return (c.f.a.c.o.i) c.f.a.c.f.q.o.i(this.f16395c);
    }

    public void n(Executor executor) {
        this.f16395c = c.f.a.c.o.l.c(executor, new Callable(this) { // from class: c.f.c.u.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f16393a;

            {
                this.f16393a = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.f16393a.d();
            }
        });
    }
}
