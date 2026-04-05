package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.amazonaws.event.ProgressEvent;

/* JADX INFO: loaded from: classes.dex */
public final class wt implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23634a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rm f23643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private wy f23645l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aml f23635b = new aml(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alx f23637d = new alx(ProgressEvent.PART_FAILED_EVENT_CODE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<ws> f23636c = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wr f23638e = new wr();

    static {
        vr vrVar = vr.f23377a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) {
        vz wbVar;
        int iO;
        ajr.c(this.f23643j);
        long jC = rkVar.c();
        if (jC != -1 && !this.f23638e.e()) {
            return this.f23638e.a(rkVar, rzVar);
        }
        if (!this.f23644k) {
            this.f23644k = true;
            if (this.f23638e.b() != -9223372036854775807L) {
                wy wyVar = new wy(this.f23638e.d(), this.f23638e.b(), jC);
                this.f23645l = wyVar;
                this.f23643j.bb(wyVar.b());
            } else {
                this.f23643j.bb(new sb(this.f23638e.b()));
            }
        }
        wy wyVar2 = this.f23645l;
        if (wyVar2 != null && wyVar2.d()) {
            return this.f23645l.a(rkVar, rzVar);
        }
        rkVar.i();
        long jD = jC != -1 ? jC - rkVar.d() : -1L;
        if ((jD != -1 && jD < 4) || !rkVar.l(this.f23637d.K(), 0, 4, true)) {
            return -1;
        }
        this.f23637d.I(0);
        int iE = this.f23637d.e();
        if (iE == 441) {
            return -1;
        }
        if (iE == 442) {
            rkVar.g(this.f23637d.K(), 0, 10);
            this.f23637d.I(9);
            iO = (this.f23637d.k() & 7) + 14;
        } else {
            if (iE != 443) {
                if ((iE >> 8) != 1) {
                    rkVar.j(1);
                    return 0;
                }
                int i2 = iE & 255;
                ws wsVar = this.f23636c.get(i2);
                if (!this.f23639f) {
                    if (wsVar == null) {
                        vz vqVar = null;
                        if (i2 == 189) {
                            vqVar = new vq();
                            this.f23640g = true;
                            this.f23642i = rkVar.e();
                        } else {
                            if ((i2 & 224) == 192) {
                                wbVar = new wm(null);
                                this.f23640g = true;
                            } else if ((i2 & 240) == 224) {
                                wbVar = new wb(null);
                                this.f23641h = true;
                            }
                            this.f23642i = rkVar.e();
                            vqVar = wbVar;
                        }
                        if (vqVar != null) {
                            vqVar.b(this.f23643j, new xg(i2, 256));
                            wsVar = new ws(vqVar, this.f23635b);
                            this.f23636c.put(i2, wsVar);
                        }
                    }
                    boolean z = this.f23640g;
                    long j2 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    if (z && this.f23641h) {
                        j2 = this.f23642i + 8192;
                    }
                    if (rkVar.e() > j2) {
                        this.f23639f = true;
                        this.f23643j.ba();
                    }
                }
                rkVar.g(this.f23637d.K(), 0, 2);
                this.f23637d.I(0);
                int iO2 = this.f23637d.o() + 6;
                if (wsVar == null) {
                    rkVar.j(iO2);
                } else {
                    this.f23637d.E(iO2);
                    rkVar.h(this.f23637d.K(), 0, iO2);
                    this.f23637d.I(6);
                    wsVar.a(this.f23637d);
                    alx alxVar = this.f23637d;
                    alxVar.H(alxVar.b());
                }
                return 0;
            }
            rkVar.g(this.f23637d.K(), 0, 2);
            this.f23637d.I(0);
            iO = this.f23637d.o() + 6;
        }
        rkVar.j(iO);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23643j = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        if (this.f23635b.e() == -9223372036854775807L || (this.f23635b.c() != 0 && this.f23635b.c() != j3)) {
            this.f23635b.h(j3);
        }
        wy wyVar = this.f23645l;
        if (wyVar != null) {
            wyVar.c(j3);
        }
        for (int i2 = 0; i2 < this.f23636c.size(); i2++) {
            this.f23636c.valueAt(i2).b();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        byte[] bArr = new byte[14];
        rkVar.g(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        rkVar.f(bArr[13] & 7);
        rkVar.g(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
