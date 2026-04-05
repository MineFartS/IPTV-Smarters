package c.h.a.h.m.e;

import a.i.r.x;
import a.y.e.f;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import c.h.a.h.m.e.b;

/* JADX INFO: loaded from: classes2.dex */
public class a extends f.AbstractC0092f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0224a f17017d;

    /* JADX INFO: renamed from: c.h.a.h.m.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0224a {
        void e(int i2);

        boolean h(int i2, int i3);
    }

    public a(InterfaceC0224a interfaceC0224a) {
        this.f17017d = interfaceC0224a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.y.e.f.AbstractC0092f
    public void A(RecyclerView.e0 e0Var, int i2) {
        if (i2 != 0 && (e0Var instanceof b.e)) {
            ((b.e) e0Var).c();
        }
        super.A(e0Var, i2);
    }

    @Override // a.y.e.f.AbstractC0092f
    public void B(RecyclerView.e0 e0Var, int i2) {
        this.f17017d.e(e0Var.n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.y.e.f.AbstractC0092f
    public void c(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        super.c(recyclerView, e0Var);
        if (e0Var instanceof b.e) {
            ((b.e) e0Var).b();
        }
    }

    @Override // a.y.e.f.AbstractC0092f
    public int k(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        return f.AbstractC0092f.t(3, 32);
    }

    @Override // a.y.e.f.AbstractC0092f
    public boolean q() {
        return true;
    }

    @Override // a.y.e.f.AbstractC0092f
    public boolean r() {
        return true;
    }

    @Override // a.y.e.f.AbstractC0092f
    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f2, float f3, int i2, boolean z) {
        if (i2 != 1) {
            super.u(canvas, recyclerView, e0Var, f2, f3, i2, z);
        } else if (e0Var instanceof b.g) {
            x.G0(((b.g) e0Var).B, f2);
        }
    }

    @Override // a.y.e.f.AbstractC0092f
    public boolean y(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        if (e0Var.q() != e0Var2.q()) {
            return false;
        }
        this.f17017d.h(e0Var.n(), e0Var2.n());
        return true;
    }
}
