package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class aas implements abq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<abq> f19015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f19016b;

    public aas(Context context, rp rpVar) {
        ajq ajqVar = new ajq(context, null);
        SparseArray<abq> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (abq) Class.forName("com.google.ads.interactivemedia.v3.internal.adz").asSubclass(abq.class).getConstructor(ajg.class).newInstance(ajqVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (abq) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(abq.class).getConstructor(ajg.class).newInstance(ajqVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (abq) Class.forName("com.google.ads.interactivemedia.v3.internal.agb").asSubclass(abq.class).getConstructor(ajg.class).newInstance(ajqVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (abq) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(abq.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new acc(ajqVar, rpVar));
        this.f19015a = sparseArray;
        this.f19016b = new int[sparseArray.size()];
        for (int i2 = 0; i2 < this.f19015a.size(); i2++) {
            this.f19016b[i2] = this.f19015a.keyAt(i2);
        }
    }
}
