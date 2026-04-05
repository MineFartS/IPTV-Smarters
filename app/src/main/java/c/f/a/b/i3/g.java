package c.f.a.b.i3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AssetManager f8870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f8871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f8872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8874j;

    public static final class a extends q {
        public a(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public g(Context context) {
        super(false);
        this.f8870f = context.getAssets();
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8871g;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws a {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f8873i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new a(e2, AdError.SERVER_ERROR_CODE);
            }
        }
        int i4 = ((InputStream) x0.i(this.f8872h)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        long j3 = this.f8873i;
        if (j3 != -1) {
            this.f8873i = j3 - ((long) i4);
        }
        v(i4);
        return i4;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8871g = null;
        try {
            try {
                InputStream inputStream = this.f8872h;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new a(e2, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f8872h = null;
            if (this.f8874j) {
                this.f8874j = false;
                w();
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws a {
        try {
            Uri uri = sVar.f9061a;
            this.f8871g = uri;
            String strSubstring = (String) c.f.a.b.j3.g.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            x(sVar);
            InputStream inputStreamOpen = this.f8870f.open(strSubstring, 1);
            this.f8872h = inputStreamOpen;
            if (inputStreamOpen.skip(sVar.f9067g) < sVar.f9067g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j2 = sVar.f9068h;
            if (j2 != -1) {
                this.f8873i = j2;
            } else {
                long jAvailable = this.f8872h.available();
                this.f8873i = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f8873i = -1L;
                }
            }
            this.f8874j = true;
            y(sVar);
            return this.f8873i;
        } catch (a e2) {
            throw e2;
        } catch (IOException e3) {
            throw new a(e3, e3 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }
}
