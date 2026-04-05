package c.f.a.e.a.b;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements c.f.a.e.a.e.c0<?> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15559c = 0;

    public n2(c.f.a.e.a.e.c0<h2> c0Var, c.f.a.e.a.e.c0<Context> c0Var2) {
        this.f15557a = c0Var;
        this.f15558b = c0Var2;
    }

    public n2(c.f.a.e.a.e.c0<Context> c0Var, c.f.a.e.a.e.c0<v> c0Var2, byte[] bArr) {
        this.f15558b = c0Var;
        this.f15557a = c0Var2;
    }

    public n2(c.f.a.e.a.e.c0<Context> c0Var, c.f.a.e.a.e.c0<o0> c0Var2, char[] cArr) {
        this.f15557a = c0Var;
        this.f15558b = c0Var2;
    }

    public n2(c.f.a.e.a.e.c0<v> c0Var, c.f.a.e.a.e.c0<s2> c0Var2, int[] iArr) {
        this.f15558b = c0Var;
        this.f15557a = c0Var2;
    }

    public n2(c.f.a.e.a.e.c0<Context> c0Var, c.f.a.e.a.e.c0<u1> c0Var2, short[] sArr) {
        this.f15557a = c0Var;
        this.f15558b = c0Var2;
    }

    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ Object a() {
        int i2 = this.f15559c;
        if (i2 == 0) {
            Object objA = this.f15557a.a();
            Context contextA = ((o2) this.f15558b).a();
            h2 h2Var = (h2) objA;
            c.f.a.e.a.e.n.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            c.f.a.e.a.e.n.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.a(contextA);
            c.f.a.e.a.e.n.d(h2Var);
            return h2Var;
        }
        if (i2 == 1) {
            return new b0(((o2) this.f15558b).a(), (v) this.f15557a.a());
        }
        if (i2 == 2) {
            return new o(((o2) this.f15557a).a(), (o0) this.f15558b.a());
        }
        if (i2 == 3) {
            return new v(((o2) this.f15557a).a(), (u1) this.f15558b.a());
        }
        return new w1((v) this.f15558b.a(), c.f.a.e.a.e.b0.c(this.f15557a));
    }
}
