package c.f.a.c.d.u.u.l;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12082c;

    public j(b bVar, long j2) {
        this.f12082c = bVar;
        this.f12081b = j2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12082c.Q(view, this.f12081b);
    }
}
