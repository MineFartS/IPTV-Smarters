package c.f.a.c.j.c;

import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13131a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.f<j8> f13132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13134d;

    public x0(SharedPreferences sharedPreferences, c.f.a.a.f<j8> fVar, long j2) {
        this.f13132b = fVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.f13133c = string;
        this.f13134d = j2 == 0 ? q1.f13035a : q1.f13036b;
    }

    public static x0 a(SharedPreferences sharedPreferences, c.f.a.a.f<j8> fVar, long j2) {
        return new x0(sharedPreferences, fVar, j2);
    }

    public final void b(j8 j8Var, v4 v4Var) {
        j8 j8Var2 = (j8) ((oa) j8.w(j8Var).q(this.f13133c).v());
        int i2 = s2.f13069a[this.f13134d - 1];
        this.f13132b.a(i2 != 1 ? i2 != 2 ? null : c.f.a.a.c.d(v4Var.zzgj(), j8Var2) : c.f.a.a.c.e(v4Var.zzgj(), j8Var2));
    }
}
