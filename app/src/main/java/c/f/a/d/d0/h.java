package c.f.a.d.d0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14761c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.d.g0.d f14764f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f14759a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.d.g0.f f14760b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14762d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<b> f14763e = new WeakReference<>(null);

    public class a extends c.f.a.d.g0.f {
        public a() {
        }

        @Override // c.f.a.d.g0.f
        public void a(int i2) {
            h.this.f14762d = true;
            b bVar = (b) h.this.f14763e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c.f.a.d.g0.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            h.this.f14762d = true;
            b bVar = (b) h.this.f14763e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f14759a.measureText(charSequence, 0, charSequence.length());
    }

    public c.f.a.d.g0.d d() {
        return this.f14764f;
    }

    public TextPaint e() {
        return this.f14759a;
    }

    public float f(String str) {
        if (!this.f14762d) {
            return this.f14761c;
        }
        float fC = c(str);
        this.f14761c = fC;
        this.f14762d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f14763e = new WeakReference<>(bVar);
    }

    public void h(c.f.a.d.g0.d dVar, Context context) {
        if (this.f14764f != dVar) {
            this.f14764f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f14759a, this.f14760b);
                b bVar = this.f14763e.get();
                if (bVar != null) {
                    this.f14759a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f14759a, this.f14760b);
                this.f14762d = true;
            }
            b bVar2 = this.f14763e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f14762d = z;
    }

    public void j(Context context) {
        this.f14764f.j(context, this.f14759a, this.f14760b);
    }
}
