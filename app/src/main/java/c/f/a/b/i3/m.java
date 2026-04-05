package c.f.a.b.i3;

import android.net.Uri;
import android.util.Base64;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f8929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f8930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8932i;

    public m() {
        super(false);
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        s sVar = this.f8929f;
        if (sVar != null) {
            return sVar.f9061a;
        }
        return null;
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f8932i;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(x0.i(this.f8930g), this.f8931h, bArr, i2, iMin);
        this.f8931h += iMin;
        this.f8932i -= iMin;
        v(iMin);
        return iMin;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        if (this.f8930g != null) {
            this.f8930g = null;
            w();
        }
        this.f8929f = null;
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws w1, q {
        x(sVar);
        this.f8929f = sVar;
        Uri uri = sVar.f9061a;
        String scheme = uri.getScheme();
        c.f.a.b.j3.g.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrU0 = x0.U0(uri.getSchemeSpecificPart(), ",");
        if (strArrU0.length != 2) {
            throw w1.b("Unexpected URI format: " + uri, null);
        }
        String str = strArrU0[1];
        if (strArrU0[0].contains(";base64")) {
            try {
                this.f8930g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw w1.b("Error while parsing Base64 encoded string: " + str, e2);
            }
        } else {
            this.f8930g = x0.k0(URLDecoder.decode(str, c.f.b.a.d.f15782a.name()));
        }
        long j2 = sVar.f9067g;
        byte[] bArr = this.f8930g;
        if (j2 > bArr.length) {
            this.f8930g = null;
            throw new q(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i2 = (int) j2;
        this.f8931h = i2;
        int length = bArr.length - i2;
        this.f8932i = length;
        long j3 = sVar.f9068h;
        if (j3 != -1) {
            this.f8932i = (int) Math.min(length, j3);
        }
        y(sVar);
        long j4 = sVar.f9068h;
        return j4 != -1 ? j4 : this.f8932i;
    }
}
