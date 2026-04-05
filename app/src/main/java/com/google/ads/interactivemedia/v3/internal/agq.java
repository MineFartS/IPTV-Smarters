package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class agq implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19620a = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19621b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aml f19623d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private rm f19625f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19627h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alx f19624e = new alx();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f19626g = new byte[1024];

    public agq(String str, aml amlVar) {
        this.f19622c = str;
        this.f19623d = amlVar;
    }

    private final sf e(long j2) {
        sf sfVarAZ = this.f19625f.aZ(0, 3);
        kd kdVar = new kd();
        kdVar.ae("text/vtt");
        kdVar.V(this.f19622c);
        kdVar.ai(j2);
        sfVarAZ.b(kdVar.s());
        this.f19625f.ba();
        return sfVarAZ;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) throws lb {
        int i2;
        ajr.b(this.f19625f);
        int iC = (int) rkVar.c();
        int i3 = this.f19627h;
        byte[] bArr = this.f19626g;
        int length = bArr.length;
        if (i3 == length) {
            if (iC != -1) {
                i2 = iC;
            } else {
                iC = length;
                i2 = -1;
            }
            this.f19626g = Arrays.copyOf(bArr, (iC * 3) / 2);
            iC = i2;
        }
        byte[] bArr2 = this.f19626g;
        int i4 = this.f19627h;
        int iB = rkVar.b(bArr2, i4, bArr2.length - i4);
        if (iB != -1) {
            int i5 = this.f19627h + iB;
            this.f19627h = i5;
            if (iC == -1 || i5 != iC) {
                return 0;
            }
        }
        alx alxVar = new alx(this.f19626g);
        ahs.c(alxVar);
        long jF = 0;
        long jA = 0;
        for (String strV = alxVar.v(); !TextUtils.isEmpty(strV); strV = alxVar.v()) {
            if (strV.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f19620a.matcher(strV);
                if (!matcher.find()) {
                    throw new lb(strV.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strV) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = f19621b.matcher(strV);
                if (!matcher2.find()) {
                    throw new lb(strV.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strV) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String strGroup = matcher.group(1);
                ajr.b(strGroup);
                jA = ahs.a(strGroup);
                String strGroup2 = matcher2.group(1);
                ajr.b(strGroup2);
                jF = aml.f(Long.parseLong(strGroup2));
            }
        }
        Matcher matcherB = ahs.b(alxVar);
        if (matcherB == null) {
            e(0L);
        } else {
            String strGroup3 = matcherB.group(1);
            ajr.b(strGroup3);
            long jA2 = ahs.a(strGroup3);
            long jB = this.f19623d.b(aml.g((jF + jA2) - jA) % IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);
            sf sfVarE = e(jB - jA2);
            this.f19624e.G(this.f19626g, this.f19627h);
            sfVarE.c(this.f19624e, this.f19627h);
            sfVarE.d(jB, 1, this.f19627h, 0, null);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f19625f = rmVar;
        rmVar.bb(new sb(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        rkVar.l(this.f19626g, 0, 6, false);
        this.f19624e.G(this.f19626g, 6);
        if (ahs.d(this.f19624e)) {
            return true;
        }
        rkVar.l(this.f19626g, 6, 3, false);
        this.f19624e.G(this.f19626g, 9);
        return ahs.d(this.f19624e);
    }
}
