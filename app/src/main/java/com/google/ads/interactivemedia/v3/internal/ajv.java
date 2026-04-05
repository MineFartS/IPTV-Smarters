package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class ajv extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f19955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f19956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19958d;

    public ajv() {
        super(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) throws aju {
        try {
            Uri uri = ajlVar.f19897a;
            this.f19956b = uri;
            i(ajlVar);
            try {
                String path = uri.getPath();
                ajr.b(path);
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.f19955a = randomAccessFile;
                randomAccessFile.seek(ajlVar.f19901e);
                long length = ajlVar.f19902f;
                if (length == -1) {
                    length = this.f19955a.length() - ajlVar.f19901e;
                }
                this.f19957c = length;
                if (length < 0) {
                    throw new aji();
                }
                this.f19958d = true;
                j(ajlVar);
                return this.f19957c;
            } catch (FileNotFoundException e2) {
                if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                    throw new aju(e2);
                }
                throw new aju(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
            }
        } catch (aju e3) {
            throw e3;
        } catch (IOException e4) {
            throw new aju(e4);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws aju {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19957c;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f19955a;
            int i4 = amn.f20135a;
            int i5 = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (i5 > 0) {
                this.f19957c -= (long) i5;
                g(i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new aju(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19956b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f19956b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19955a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f19955a = null;
                if (this.f19958d) {
                    this.f19958d = false;
                    h();
                }
            } catch (IOException e2) {
                throw new aju(e2);
            }
        } catch (Throwable th) {
            this.f19955a = null;
            if (this.f19958d) {
                this.f19958d = false;
                h();
            }
            throw th;
        }
    }
}
