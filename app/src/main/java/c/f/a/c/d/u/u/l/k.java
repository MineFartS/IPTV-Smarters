package c.f.a.c.d.u.u.l;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12084c;

    public k(b bVar, long j2) {
        this.f12084c = bVar;
        this.f12083b = j2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12084c.M(view, this.f12083b);
    }
}
