package c.f.a.c.k.b;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4 f14058e;

    public l4(o4 o4Var, String str, long j2) {
        this.f14058e = o4Var;
        c.f.a.c.f.q.o.e(str);
        this.f14054a = str;
        this.f14055b = j2;
    }

    public final long a() {
        if (!this.f14056c) {
            this.f14056c = true;
            this.f14057d = this.f14058e.p().getLong(this.f14054a, this.f14055b);
        }
        return this.f14057d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor editorEdit = this.f14058e.p().edit();
        editorEdit.putLong(this.f14054a, j2);
        editorEdit.apply();
        this.f14057d = j2;
    }
}
