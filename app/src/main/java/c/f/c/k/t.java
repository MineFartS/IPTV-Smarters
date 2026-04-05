package c.f.c.k;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map.Entry f16117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.c.o.a f16118c;

    public t(Map.Entry entry, c.f.c.o.a aVar) {
        this.f16117b = entry;
        this.f16118c = aVar;
    }

    public static Runnable a(Map.Entry entry, c.f.c.o.a aVar) {
        return new t(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((c.f.c.o.b) this.f16117b.getKey()).a(this.f16118c);
    }
}
