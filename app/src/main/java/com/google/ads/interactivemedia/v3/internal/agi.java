package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class agi implements sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ke f19586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yw f19587b = new yw();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sf f19588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ke f19589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ke f19590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f19591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19592g;

    static {
        kd kdVar = new kd();
        kdVar.ae("application/id3");
        f19586a = kdVar.s();
        kd kdVar2 = new kd();
        kdVar2.ae("application/x-emsg");
        kdVar2.s();
    }

    public agi(sf sfVar, int i2) {
        this.f19588c = sfVar;
        if (i2 == 1) {
            this.f19589d = f19586a;
            this.f19591f = new byte[0];
            this.f19592g = 0;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown metadataType: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private final void g(int i2) {
        byte[] bArr = this.f19591f;
        if (bArr.length < i2) {
            this.f19591f = Arrays.copyOf(bArr, i2 + (i2 >> 1));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ int a(aje ajeVar, int i2, boolean z) {
        return us.h(this, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void b(ke keVar) {
        this.f19590e = keVar;
        this.f19588c.b(this.f19589d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ void c(alx alxVar, int i2) {
        us.i(this, alxVar, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void d(long j2, int i2, int i3, int i4, se seVar) {
        ajr.b(this.f19590e);
        int i5 = this.f19592g - i4;
        alx alxVar = new alx(Arrays.copyOfRange(this.f19591f, i5 - i3, i5));
        byte[] bArr = this.f19591f;
        System.arraycopy(bArr, i5, bArr, 0, i4);
        this.f19592g = i4;
        if (!amn.O(this.f19590e.f22156l, this.f19589d.f22156l)) {
            if (!"application/x-emsg".equals(this.f19590e.f22156l)) {
                String strValueOf = String.valueOf(this.f19590e.f22156l);
                Log.w("EmsgUnwrappingTrackOutput", strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                return;
            }
            yv yvVarC = yw.c(alxVar);
            ke keVarB = yvVarC.b();
            if (keVarB == null || !amn.O(this.f19589d.f22156l, keVarB.f22156l)) {
                Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f19589d.f22156l, yvVarC.b()));
                return;
            }
            alxVar = new alx((byte[]) ajr.b(yvVarC.b() != null ? yvVarC.f23813e : null));
        }
        int iA = alxVar.a();
        this.f19588c.c(alxVar, iA);
        this.f19588c.d(j2, i2, iA, i4, seVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final int e(aje ajeVar, int i2, boolean z) throws EOFException {
        g(this.f19592g + i2);
        int iB = ajeVar.b(this.f19591f, this.f19592g, i2);
        if (iB != -1) {
            this.f19592g += iB;
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void f(alx alxVar, int i2) {
        g(this.f19592g + i2);
        alxVar.D(this.f19591f, this.f19592g, i2);
        this.f19592g += i2;
    }
}
