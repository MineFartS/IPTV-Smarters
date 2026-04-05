package k.g0.g;

import k.d0;
import k.s;
import k.v;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f30647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.e f30648d;

    public h(s sVar, l.e eVar) {
        this.f30647c = sVar;
        this.f30648d = eVar;
    }

    @Override // k.d0
    public long l() {
        return e.a(this.f30647c);
    }

    @Override // k.d0
    public v m() {
        String strA = this.f30647c.a("Content-Type");
        if (strA != null) {
            return v.c(strA);
        }
        return null;
    }

    @Override // k.d0
    public l.e p() {
        return this.f30648d;
    }
}
