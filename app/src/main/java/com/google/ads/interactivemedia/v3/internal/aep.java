package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class aep implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aen f19399a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private aer f19403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ajm f19408j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TreeMap<Long, Long> f19402d = new TreeMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f19401c = amn.w(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yw f19400b = new yw();

    public aep(aer aerVar, aen aenVar, ajm ajmVar) {
        this.f19403e = aerVar;
        this.f19399a = aenVar;
        this.f19408j = ajmVar;
    }

    private final void i() {
        if (this.f19405g) {
            this.f19406h = true;
            this.f19405g = false;
            ((ady) this.f19399a).f19334a.I();
        }
    }

    public final aeo c() {
        return new aeo(this, this.f19408j);
    }

    public final void d() {
        this.f19407i = true;
        this.f19401c.removeCallbacksAndMessages(null);
    }

    public final void e(aer aerVar) {
        this.f19406h = false;
        this.f19404f = -9223372036854775807L;
        this.f19403e = aerVar;
        Iterator<Map.Entry<Long, Long>> it = this.f19402d.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f19403e.f19422h) {
                it.remove();
            }
        }
    }

    public final boolean f(long j2) {
        aer aerVar = this.f19403e;
        boolean z = false;
        if (!aerVar.f19418d) {
            return false;
        }
        if (this.f19406h) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingEntry = this.f19402d.ceilingEntry(Long.valueOf(aerVar.f19422h));
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().longValue() < j2) {
            long jLongValue = entryCeilingEntry.getKey().longValue();
            this.f19404f = jLongValue;
            ((ady) this.f19399a).f19334a.H(jLongValue);
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public final boolean g(boolean z) {
        if (!this.f19403e.f19418d) {
            return false;
        }
        if (this.f19406h) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public final void h() {
        this.f19405g = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f19407i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        aem aemVar = (aem) message.obj;
        long j2 = aemVar.f19392a;
        long j3 = aemVar.f19393b;
        TreeMap<Long, Long> treeMap = this.f19402d;
        Long lValueOf = Long.valueOf(j3);
        Long l2 = treeMap.get(lValueOf);
        if (l2 == null || l2.longValue() > j2) {
            this.f19402d.put(lValueOf, Long.valueOf(j2));
        }
        return true;
    }
}
