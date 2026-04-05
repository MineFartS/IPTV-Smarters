package c.f.a.c.k.b;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4 f14140d;

    public n4(o4 o4Var, String str, String str2) {
        this.f14140d = o4Var;
        c.f.a.c.f.q.o.e(str);
        this.f14137a = str;
    }

    public final String a() {
        if (!this.f14138b) {
            this.f14138b = true;
            this.f14139c = this.f14140d.p().getString(this.f14137a, null);
        }
        return this.f14139c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f14140d.p().edit();
        editorEdit.putString(this.f14137a, str);
        editorEdit.apply();
        this.f14139c = str;
    }
}
