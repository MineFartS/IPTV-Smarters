package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class pc implements os {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pg f22684a;

    public /* synthetic */ pc(pg pgVar) {
        this.f22684a = pgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.os
    public final void a(long j2) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j2);
        Log.w("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.os
    public final void b(long j2) {
        if (this.f22684a.f22703n != null) {
            ((pj) this.f22684a.f22703n).f22710a.f22712c.r(j2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.os
    public final void c(long j2, long j3, long j4, long j5) {
        long jH = this.f22684a.H();
        long jI = this.f22684a.I();
        StringBuilder sb = new StringBuilder(182);
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(j5);
        sb.append(", ");
        sb.append(jH);
        sb.append(", ");
        sb.append(jI);
        Log.w("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.os
    public final void d(long j2, long j3, long j4, long j5) {
        long jH = this.f22684a.H();
        long jI = this.f22684a.I();
        StringBuilder sb = new StringBuilder(180);
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(j5);
        sb.append(", ");
        sb.append(jH);
        sb.append(", ");
        sb.append(jI);
        Log.w("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.os
    public final void e(int i2, long j2) {
        if (this.f22684a.f22703n != null) {
            ((pj) this.f22684a.f22703n).f22710a.f22712c.t(i2, j2, SystemClock.elapsedRealtime() - this.f22684a.V);
        }
    }
}
