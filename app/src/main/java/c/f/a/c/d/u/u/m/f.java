package c.f.a.c.d.u.u.m;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12106b;

    public f(a aVar) {
        this.f12106b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f12106b.J.isClickable()) {
            this.f12106b.y0().V();
        }
    }
}
