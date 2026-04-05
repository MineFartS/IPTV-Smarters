package c.f.a.d.a0;

import android.content.Context;
import android.graphics.Color;
import c.f.a.d.g0.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14623d;

    public a(Context context) {
        this.f14620a = b.b(context, c.f.a.d.b.p, false);
        this.f14621b = c.f.a.d.w.a.a(context, c.f.a.d.b.f14638o, 0);
        this.f14622c = c.f.a.d.w.a.a(context, c.f.a.d.b.f14636m, 0);
        this.f14623d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f2) {
        if (this.f14623d <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i2, float f2) {
        float fA = a(f2);
        return a.i.j.a.m(c.f.a.d.w.a.f(a.i.j.a.m(i2, 255), this.f14621b, fA), Color.alpha(i2));
    }

    public int c(int i2, float f2) {
        return (this.f14620a && e(i2)) ? b(i2, f2) : i2;
    }

    public boolean d() {
        return this.f14620a;
    }

    public final boolean e(int i2) {
        return a.i.j.a.m(i2, 255) == this.f14622c;
    }
}
