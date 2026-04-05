package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GJ {
    public final long A00;
    public final Format A01;
    public final GS A02;
    public final String A03;
    public final String A04;
    public final ArrayList<DrmInitData.SchemeData> A05;
    public final ArrayList<GK> A06;

    public GJ(Format format, String str, GS gs, String str2, ArrayList<DrmInitData.SchemeData> drmSchemeDatas, ArrayList<GK> arrayList, long j2) {
        this.A01 = format;
        this.A03 = str;
        this.A02 = gs;
        this.A04 = str2;
        this.A05 = drmSchemeDatas;
        this.A06 = arrayList;
        this.A00 = j2;
    }
}
