package c.f.a.c.k.b;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4 f13997e;

    public j4(o4 o4Var, String str, boolean z) {
        this.f13997e = o4Var;
        c.f.a.c.f.q.o.e(str);
        this.f13993a = str;
        this.f13994b = z;
    }

    public final boolean a() {
        if (!this.f13995c) {
            this.f13995c = true;
            this.f13996d = this.f13997e.p().getBoolean(this.f13993a, this.f13994b);
        }
        return this.f13996d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.f13997e.p().edit();
        editorEdit.putBoolean(this.f13993a, z);
        editorEdit.apply();
        this.f13996d = z;
    }
}
