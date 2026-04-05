package c.f.a.c.f.q;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.f.a.c.f.o.n.i f12572c;

    public d0(Intent intent, c.f.a.c.f.o.n.i iVar, int i2) {
        this.f12571b = intent;
        this.f12572c = iVar;
    }

    @Override // c.f.a.c.f.q.e0
    public final void a() {
        Intent intent = this.f12571b;
        if (intent != null) {
            this.f12572c.startActivityForResult(intent, 2);
        }
    }
}
