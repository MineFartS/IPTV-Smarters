package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class aiv extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f19857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f19858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19860e;

    public aiv(Context context) {
        super(false);
        this.f19856a = context.getAssets();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) throws aiu {
        try {
            Uri uri = ajlVar.f19897a;
            this.f19857b = uri;
            String path = uri.getPath();
            ajr.b(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            i(ajlVar);
            InputStream inputStreamOpen = this.f19856a.open(path, 1);
            this.f19858c = inputStreamOpen;
            if (inputStreamOpen.skip(ajlVar.f19901e) < ajlVar.f19901e) {
                throw new aji();
            }
            long j2 = ajlVar.f19902f;
            if (j2 != -1) {
                this.f19859d = j2;
            } else {
                long jAvailable = this.f19858c.available();
                this.f19859d = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f19859d = -1L;
                }
            }
            this.f19860e = true;
            j(ajlVar);
            return this.f19859d;
        } catch (IOException e2) {
            throw new aiu(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws aiu {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19859d;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new aiu(e2);
            }
        }
        InputStream inputStream = this.f19858c;
        int i4 = amn.f20135a;
        int i5 = inputStream.read(bArr, i2, i3);
        if (i5 == -1) {
            return -1;
        }
        long j3 = this.f19859d;
        if (j3 != -1) {
            this.f19859d = j3 - ((long) i5);
        }
        g(i5);
        return i5;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19857b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f19857b = null;
        try {
            try {
                InputStream inputStream = this.f19858c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19858c = null;
                if (this.f19860e) {
                    this.f19860e = false;
                    h();
                }
            } catch (IOException e2) {
                throw new aiu(e2);
            }
        } catch (Throwable th) {
            this.f19858c = null;
            if (this.f19860e) {
                this.f19860e = false;
                h();
            }
            throw th;
        }
    }
}
