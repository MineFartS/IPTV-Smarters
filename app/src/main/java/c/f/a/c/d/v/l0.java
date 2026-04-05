package c.f.a.c.d.v;

import c.f.a.c.d.e;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f12164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12166d;

    public l0(h0 h0Var, f0 f0Var, String str, String str2) {
        this.f12164b = f0Var;
        this.f12165c = str;
        this.f12166d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.InterfaceC0151e interfaceC0151e;
        synchronized (this.f12164b.f12141g) {
            interfaceC0151e = (e.InterfaceC0151e) this.f12164b.f12141g.get(this.f12165c);
        }
        if (interfaceC0151e != null) {
            interfaceC0151e.a(this.f12164b.f12139e, this.f12165c, this.f12166d);
        } else {
            f0.f12135a.a("Discarded message for unknown namespace '%s'", this.f12165c);
        }
    }
}
