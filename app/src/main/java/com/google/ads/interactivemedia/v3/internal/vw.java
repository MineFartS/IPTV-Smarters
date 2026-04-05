package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vw implements xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ke> f23427b;

    public vw() {
        this(null);
    }

    public vw(int i2, List<ke> list) {
        this.f23426a = i2;
        this.f23427b = list;
    }

    public vw(byte[] bArr) {
        this(0, aty.n());
    }

    private final ww c(xe xeVar) {
        return new ww(e(xeVar));
    }

    private final xi d(xe xeVar) {
        return new xi(e(xeVar));
    }

    private final List<ke> e(xe xeVar) {
        String str;
        int i2;
        List<byte[]> listSingletonList;
        if (f(32)) {
            return this.f23427b;
        }
        alx alxVar = new alx(xeVar.f23698d);
        List<ke> arrayList = this.f23427b;
        while (alxVar.a() > 0) {
            int iK = alxVar.k();
            int iC = alxVar.c() + alxVar.k();
            if (iK == 134) {
                arrayList = new ArrayList<>();
                int iK2 = alxVar.k() & 31;
                for (int i3 = 0; i3 < iK2; i3++) {
                    String strY = alxVar.y(3);
                    int iK3 = alxVar.k();
                    int i4 = iK3 & 128;
                    if (i4 != 0) {
                        i2 = iK3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bK = (byte) alxVar.k();
                    alxVar.J(1);
                    if (i4 != 0) {
                        int i5 = aku.f20014a;
                        listSingletonList = Collections.singletonList((bK & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    kd kdVar = new kd();
                    kdVar.ae(str);
                    kdVar.V(strY);
                    kdVar.F(i2);
                    kdVar.T(listSingletonList);
                    arrayList.add(kdVar.s());
                }
            }
            alxVar.I(iC);
        }
        return arrayList;
    }

    private final boolean f(int i2) {
        return (i2 & this.f23426a) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xf
    public final SparseArray<xh> a() {
        return new SparseArray<>();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xf
    public final xh b(int i2, xe xeVar) {
        if (i2 == 2) {
            return new wp(new wb(d(xeVar)));
        }
        if (i2 == 3 || i2 == 4) {
            return new wp(new wm(xeVar.f23696b));
        }
        if (i2 == 21) {
            return new wp(new wk());
        }
        if (i2 == 27) {
            if (f(4)) {
                return null;
            }
            return new wp(new wh(c(xeVar), f(1), f(8)));
        }
        if (i2 == 36) {
            return new wp(new wj(c(xeVar)));
        }
        if (i2 == 89) {
            return new wp(new vy(xeVar.f23697c));
        }
        if (i2 != 138) {
            if (i2 == 172) {
                return new wp(new vt(xeVar.f23696b));
            }
            if (i2 == 257) {
                return new wv(new wo("application/vnd.dvb.ait"));
            }
            if (i2 != 129) {
                if (i2 != 130) {
                    if (i2 == 134) {
                        if (f(16)) {
                            return null;
                        }
                        return new wv(new wo("application/x-scte35"));
                    }
                    if (i2 != 135) {
                        switch (i2) {
                            case 15:
                                if (!f(2)) {
                                    break;
                                }
                                break;
                            case 17:
                                if (!f(2)) {
                                    break;
                                }
                                break;
                        }
                        return null;
                    }
                } else if (!f(64)) {
                    return null;
                }
            }
            return new wp(new vq(xeVar.f23696b));
        }
        return new wp(new vx(xeVar.f23696b));
    }
}
