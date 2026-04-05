package a.y.e;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0089b f3813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3814b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f3815c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f3816a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f3817b;

        public void a(int i2) {
            if (i2 < 64) {
                this.f3816a &= (1 << i2) ^ (-1);
                return;
            }
            a aVar = this.f3817b;
            if (aVar != null) {
                aVar.a(i2 - 64);
            }
        }

        public int b(int i2) {
            a aVar = this.f3817b;
            return aVar == null ? i2 >= 64 ? Long.bitCount(this.f3816a) : Long.bitCount(this.f3816a & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.f3816a & ((1 << i2) - 1)) : aVar.b(i2 - 64) + Long.bitCount(this.f3816a);
        }

        public final void c() {
            if (this.f3817b == null) {
                this.f3817b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.f3816a & (1 << i2)) != 0;
            }
            c();
            return this.f3817b.d(i2 - 64);
        }

        public void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.f3817b.e(i2 - 64, z);
                return;
            }
            long j2 = this.f3816a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f3816a = ((j2 & (j3 ^ (-1))) << 1) | (j2 & j3);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.f3817b != null) {
                c();
                this.f3817b.e(0, z2);
            }
        }

        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f3817b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f3816a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (j2 ^ (-1));
            this.f3816a = j4;
            long j5 = j2 - 1;
            this.f3816a = (j4 & j5) | Long.rotateRight((j5 ^ (-1)) & j4, 1);
            a aVar = this.f3817b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3817b.f(0);
            }
            return z;
        }

        public void g() {
            this.f3816a = 0L;
            a aVar = this.f3817b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i2) {
            if (i2 < 64) {
                this.f3816a |= 1 << i2;
            } else {
                c();
                this.f3817b.h(i2 - 64);
            }
        }

        public String toString() {
            if (this.f3817b == null) {
                return Long.toBinaryString(this.f3816a);
            }
            return this.f3817b.toString() + "xx" + Long.toBinaryString(this.f3816a);
        }
    }

    /* JADX INFO: renamed from: a.y.e.b$b, reason: collision with other inner class name */
    public interface InterfaceC0089b {
        View a(int i2);

        void addView(View view, int i2);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.e0 f(View view);

        void g(int i2);

        void h(View view);

        void i(int i2);

        void j(View view, int i2, ViewGroup.LayoutParams layoutParams);
    }

    public b(InterfaceC0089b interfaceC0089b) {
        this.f3813a = interfaceC0089b;
    }

    public void a(View view, int i2, boolean z) {
        int iC = i2 < 0 ? this.f3813a.c() : h(i2);
        this.f3814b.e(iC, z);
        if (z) {
            l(view);
        }
        this.f3813a.addView(view, iC);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iC = i2 < 0 ? this.f3813a.c() : h(i2);
        this.f3814b.e(iC, z);
        if (z) {
            l(view);
        }
        this.f3813a.j(view, iC, layoutParams);
    }

    public void d(int i2) {
        int iH = h(i2);
        this.f3814b.f(iH);
        this.f3813a.g(iH);
    }

    public View e(int i2) {
        int size = this.f3815c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f3815c.get(i3);
            RecyclerView.e0 e0VarF = this.f3813a.f(view);
            if (e0VarF.r() == i2 && !e0VarF.y() && !e0VarF.A()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i2) {
        return this.f3813a.a(h(i2));
    }

    public int g() {
        return this.f3813a.c() - this.f3815c.size();
    }

    public final int h(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iC = this.f3813a.c();
        int i3 = i2;
        while (i3 < iC) {
            int iB = i2 - (i3 - this.f3814b.b(i3));
            if (iB == 0) {
                while (this.f3814b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public View i(int i2) {
        return this.f3813a.a(i2);
    }

    public int j() {
        return this.f3813a.c();
    }

    public void k(View view) {
        int iE = this.f3813a.e(view);
        if (iE >= 0) {
            this.f3814b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f3815c.add(view);
        this.f3813a.b(view);
    }

    public int m(View view) {
        int iE = this.f3813a.e(view);
        if (iE == -1 || this.f3814b.d(iE)) {
            return -1;
        }
        return iE - this.f3814b.b(iE);
    }

    public boolean n(View view) {
        return this.f3815c.contains(view);
    }

    public void o() {
        this.f3814b.g();
        for (int size = this.f3815c.size() - 1; size >= 0; size--) {
            this.f3813a.h(this.f3815c.get(size));
            this.f3815c.remove(size);
        }
        this.f3813a.d();
    }

    public void p(View view) {
        int iE = this.f3813a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f3814b.f(iE)) {
            t(view);
        }
        this.f3813a.i(iE);
    }

    public void q(int i2) {
        int iH = h(i2);
        View viewA = this.f3813a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f3814b.f(iH)) {
            t(viewA);
        }
        this.f3813a.i(iH);
    }

    public boolean r(View view) {
        int iE = this.f3813a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f3814b.d(iE)) {
            return false;
        }
        this.f3814b.f(iE);
        t(view);
        this.f3813a.i(iE);
        return true;
    }

    public void s(View view) {
        int iE = this.f3813a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3814b.d(iE)) {
            this.f3814b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f3815c.remove(view)) {
            return false;
        }
        this.f3813a.h(view);
        return true;
    }

    public String toString() {
        return this.f3814b.toString() + ", hidden list:" + this.f3815c.size();
    }
}
