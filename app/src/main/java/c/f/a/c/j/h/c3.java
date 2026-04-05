package c.f.a.c.j.h;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f13236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, Handler handler) {
        super(null);
        this.f13236a = d3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f13236a.d();
    }
}
