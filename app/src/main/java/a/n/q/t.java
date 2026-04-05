package a.n.q;

import a.n.q.s;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class t extends s.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f2928a;

    public t(t0 t0Var) {
        this.f2928a = t0Var;
    }

    @Override // a.n.q.s.e
    public View a(View view) {
        return this.f2928a.a(view.getContext());
    }

    @Override // a.n.q.s.e
    public void b(View view, View view2) {
        ((s0) view).c(view2);
    }
}
