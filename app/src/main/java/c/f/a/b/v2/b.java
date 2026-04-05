package c.f.a.b.v2;

import android.media.MediaCodec;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f10253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f10255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f10256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f10260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0140b f10261j;

    /* JADX INFO: renamed from: c.f.a.b.v2.b$b, reason: collision with other inner class name */
    public static final class C0140b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f10262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f10263b;

        public C0140b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f10262a = cryptoInfo;
            this.f10263b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void b(int i2, int i3) {
            this.f10263b.set(i2, i3);
            this.f10262a.setPattern(this.f10263b);
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10260i = cryptoInfo;
        this.f10261j = x0.f9296a >= 24 ? new C0140b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f10260i;
    }

    public void b(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f10255d == null) {
            int[] iArr = new int[1];
            this.f10255d = iArr;
            this.f10260i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f10255d;
        iArr2[0] = iArr2[0] + i2;
    }

    public void c(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f10257f = i2;
        this.f10255d = iArr;
        this.f10256e = iArr2;
        this.f10253b = bArr;
        this.f10252a = bArr2;
        this.f10254c = i3;
        this.f10258g = i4;
        this.f10259h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f10260i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (x0.f9296a >= 24) {
            ((C0140b) c.f.a.b.j3.g.e(this.f10261j)).b(i4, i5);
        }
    }
}
