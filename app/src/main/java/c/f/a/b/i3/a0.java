package c.f.a.b.i3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import c.f.a.b.i3.p;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RandomAccessFile f8838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f8839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8841i;

    public static final class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n0 f8842a;

        @Override // c.f.a.b.i3.p.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a() {
            a0 a0Var = new a0();
            n0 n0Var = this.f8842a;
            if (n0Var != null) {
                a0Var.h(n0Var);
            }
            return a0Var;
        }
    }

    public static class b extends q {
        public b(String str, Throwable th, int i2) {
            super(str, th, i2);
        }

        public b(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public a0() {
        super(false);
    }

    public static RandomAccessFile z(Uri uri) throws b {
        int i2 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) c.f.a.b.j3.g.e(uri.getPath()), "r");
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            if (x0.f9296a < 21 || !c.b(e2.getCause())) {
                i2 = 2005;
            }
            throw new b(e2, i2);
        } catch (SecurityException e3) {
            throw new b(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new b(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8839g;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws b {
        if (i3 == 0) {
            return 0;
        }
        if (this.f8840h == 0) {
            return -1;
        }
        try {
            int i4 = ((RandomAccessFile) x0.i(this.f8838f)).read(bArr, i2, (int) Math.min(this.f8840h, i3));
            if (i4 > 0) {
                this.f8840h -= (long) i4;
                v(i4);
            }
            return i4;
        } catch (IOException e2) {
            throw new b(e2, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8839g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8838f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new b(e2, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f8838f = null;
            if (this.f8841i) {
                this.f8841i = false;
                w();
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws b {
        Uri uri = sVar.f9061a;
        this.f8839g = uri;
        x(sVar);
        RandomAccessFile randomAccessFileZ = z(uri);
        this.f8838f = randomAccessFileZ;
        try {
            randomAccessFileZ.seek(sVar.f9067g);
            long length = sVar.f9068h;
            if (length == -1) {
                length = this.f8838f.length() - sVar.f9067g;
            }
            this.f8840h = length;
            if (length < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f8841i = true;
            y(sVar);
            return this.f8840h;
        } catch (IOException e2) {
            throw new b(e2, AdError.SERVER_ERROR_CODE);
        }
    }
}
