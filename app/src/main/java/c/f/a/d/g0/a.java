package c.f.a.d.g0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f14803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0166a f14804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14805c;

    /* JADX INFO: renamed from: c.f.a.d.g0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0166a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0166a interfaceC0166a, Typeface typeface) {
        this.f14803a = typeface;
        this.f14804b = interfaceC0166a;
    }

    @Override // c.f.a.d.g0.f
    public void a(int i2) {
        d(this.f14803a);
    }

    @Override // c.f.a.d.g0.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f14805c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f14805c) {
            return;
        }
        this.f14804b.a(typeface);
    }
}
