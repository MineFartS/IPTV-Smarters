package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class abu implements akf, aav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ abz f19089a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f19091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final akp f19092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final abr f19093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rm f19094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final akv f19095g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f19097i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19099k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private sf f19102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19103o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rz f19096h = new rz();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19098j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19101m = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19090b = aax.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ajl f19100l = j(0);

    public abu(abz abzVar, Uri uri, ajh ajhVar, abr abrVar, rm rmVar, akv akvVar) {
        this.f19089a = abzVar;
        this.f19091c = uri;
        this.f19092d = new akp(ajhVar);
        this.f19093e = abrVar;
        this.f19094f = rmVar;
        this.f19095g = akvVar;
    }

    public static /* synthetic */ void g(abu abuVar, long j2, long j3) {
        abuVar.f19096h.f22929a = j2;
        abuVar.f19099k = j3;
        abuVar.f19098j = true;
        abuVar.f19103o = false;
    }

    private final ajl j(long j2) {
        ajk ajkVar = new ajk();
        ajkVar.f(this.f19091c);
        ajkVar.e(j2);
        ajkVar.b(6);
        ajkVar.c(abz.f19112b);
        return ajkVar.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final void a(alx alxVar) {
        long jMax = !this.f19103o ? this.f19099k : Math.max(this.f19089a.K(), this.f19099k);
        int iA = alxVar.a();
        sf sfVar = this.f19102n;
        ajr.b(sfVar);
        sfVar.c(alxVar, iA);
        sfVar.d(jMax, 1, iA, 0, null);
        this.f19103o = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
        this.f19097i = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() throws Throwable {
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i3;
        int i4;
        int i5;
        while (!this.f19097i) {
            int i6 = 0;
            try {
                long j2 = this.f19096h.f22929a;
                ajl ajlVarJ = j(j2);
                this.f19100l = ajlVarJ;
                long jA = this.f19092d.a(ajlVarJ);
                this.f19101m = jA;
                if (jA != -1) {
                    this.f19101m = jA + j2;
                }
                abz abzVar = this.f19089a;
                Map<String, List<String>> mapD = this.f19092d.d();
                List<String> list = mapD.get("icy-br");
                if (list != null) {
                    String str4 = list.get(0);
                    try {
                        i5 = Integer.parseInt(str4) * 1000;
                        if (i5 > 0) {
                            z = true;
                        } else {
                            try {
                                String strValueOf = String.valueOf(str4);
                                Log.w("IcyHeaders", strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                                z = false;
                                i5 = -1;
                            } catch (NumberFormatException unused) {
                                String strValueOf2 = String.valueOf(str4);
                                Log.w("IcyHeaders", strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                                i2 = i5;
                                z = false;
                            }
                        }
                        i2 = i5;
                    } catch (NumberFormatException unused2) {
                        i5 = -1;
                    }
                } else {
                    z = false;
                    i2 = -1;
                }
                List<String> list2 = mapD.get("icy-genre");
                if (list2 != null) {
                    str = list2.get(0);
                    z = true;
                } else {
                    str = null;
                }
                List<String> list3 = mapD.get("icy-name");
                if (list3 != null) {
                    str2 = list3.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                List<String> list4 = mapD.get("icy-url");
                if (list4 != null) {
                    str3 = list4.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                List<String> list5 = mapD.get("icy-pub");
                if (list5 != null) {
                    zEquals = list5.get(0).equals("1");
                    z = true;
                } else {
                    zEquals = false;
                }
                List<String> list6 = mapD.get("icy-metaint");
                if (list6 != null) {
                    String str5 = list6.get(0);
                    try {
                        i4 = Integer.parseInt(str5);
                        if (i4 > 0) {
                            z = true;
                        } else {
                            try {
                                String strValueOf3 = String.valueOf(str5);
                                Log.w("IcyHeaders", strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                                i4 = -1;
                            } catch (NumberFormatException unused3) {
                                String strValueOf4 = String.valueOf(str5);
                                Log.w("IcyHeaders", strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i4 = -1;
                    }
                    i3 = i4;
                } else {
                    i3 = -1;
                }
                abzVar.r = z ? new zc(i2, str, str2, str3, zEquals, i3) : null;
                aje aawVar = this.f19092d;
                if (this.f19089a.r != null && this.f19089a.r.f23839f != -1) {
                    aawVar = new aaw(this.f19092d, this.f19089a.r.f23839f, this);
                    sf sfVarS = this.f19089a.s();
                    this.f19102n = sfVarS;
                    sfVarS.b(abz.f19113c);
                }
                this.f19093e.d(aawVar, this.f19091c, this.f19092d.d(), j2, this.f19101m, this.f19094f);
                if (this.f19089a.r != null) {
                    this.f19093e.c();
                }
                if (this.f19098j) {
                    this.f19093e.f(j2, this.f19099k);
                    this.f19098j = false;
                }
                long j3 = j2;
                int iA = 0;
                while (true) {
                    if (iA != 0) {
                        break;
                    }
                    try {
                        if (this.f19097i) {
                            iA = 0;
                            break;
                        }
                        try {
                            this.f19095g.a();
                            iA = this.f19093e.a(this.f19096h);
                            long jB = this.f19093e.b();
                            if (jB > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j3) {
                                this.f19095g.e();
                                this.f19089a.p.post(this.f19089a.f19125o);
                                j3 = jB;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        th = th;
                        i6 = iA;
                        if (i6 != 1 && this.f19093e.b() != -1) {
                            this.f19096h.f22929a = this.f19093e.b();
                        }
                        amn.K(this.f19092d);
                        throw th;
                    }
                }
                if (iA != 1) {
                    if (this.f19093e.b() != -1) {
                        this.f19096h.f22929a = this.f19093e.b();
                    }
                    i6 = iA;
                }
                amn.K(this.f19092d);
                if (i6 != 0) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
