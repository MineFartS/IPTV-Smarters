package a.y.e;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<e> f3885b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Comparator<c> f3886c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3889f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<RecyclerView> f3887d = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<c> f3890g = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3898d;
            if ((recyclerView == null) != (cVar2.f3898d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f3895a;
            if (z != cVar2.f3895a) {
                return z ? -1 : 1;
            }
            int i2 = cVar2.f3896b - cVar.f3896b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f3897c - cVar2.f3897c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f3893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3894d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f3894d * 2;
            int[] iArr = this.f3893c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3893c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f3893c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3893c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f3894d++;
        }

        public void b() {
            int[] iArr = this.f3893c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3894d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.f3894d = 0;
            int[] iArr = this.f3893c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.w;
            if (recyclerView.v == null || pVar == null || !pVar.x0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f4811n.p()) {
                    pVar.q(recyclerView.v.o(), this);
                }
            } else if (!recyclerView.q0()) {
                pVar.p(this.f3891a, this.f3892b, recyclerView.x0, this);
            }
            int i2 = this.f3894d;
            if (i2 > pVar.f4897m) {
                pVar.f4897m = i2;
                pVar.f4898n = z;
                recyclerView.f4809l.K();
            }
        }

        public boolean d(int i2) {
            if (this.f3893c != null) {
                int i3 = this.f3894d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f3893c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i2, int i3) {
            this.f3891a = i2;
            this.f3892b = i3;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f3898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3899e;

        public void a() {
            this.f3895a = false;
            this.f3896b = 0;
            this.f3897c = 0;
            this.f3898d = null;
            this.f3899e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i2) {
        int iJ = recyclerView.f4812o.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            RecyclerView.e0 e0VarJ0 = RecyclerView.j0(recyclerView.f4812o.i(i3));
            if (e0VarJ0.f4857d == i2 && !e0VarJ0.y()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f3887d.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f3887d.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f3887d.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.w0.c(recyclerView, false);
                i2 += recyclerView.w0.f3894d;
            }
        }
        this.f3890g.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f3887d.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.w0;
                int iAbs = Math.abs(bVar.f3891a) + Math.abs(bVar.f3892b);
                for (int i6 = 0; i6 < bVar.f3894d * 2; i6 += 2) {
                    if (i4 >= this.f3890g.size()) {
                        cVar = new c();
                        this.f3890g.add(cVar);
                    } else {
                        cVar = this.f3890g.get(i4);
                    }
                    int[] iArr = bVar.f3893c;
                    int i7 = iArr[i6 + 1];
                    cVar.f3895a = i7 <= iAbs;
                    cVar.f3896b = iAbs;
                    cVar.f3897c = i7;
                    cVar.f3898d = recyclerView2;
                    cVar.f3899e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f3890g, f3886c);
    }

    public final void c(c cVar, long j2) {
        RecyclerView.e0 e0VarI = i(cVar.f3898d, cVar.f3899e, cVar.f3895a ? Long.MAX_VALUE : j2);
        if (e0VarI == null || e0VarI.f4856c == null || !e0VarI.x() || e0VarI.y()) {
            return;
        }
        h(e0VarI.f4856c.get(), j2);
    }

    public final void d(long j2) {
        for (int i2 = 0; i2 < this.f3890g.size(); i2++) {
            c cVar = this.f3890g.get(i2);
            if (cVar.f3898d == null) {
                return;
            }
            c(cVar, j2);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f3888e == 0) {
            this.f3888e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.w0.e(i2, i3);
    }

    public void g(long j2) {
        b();
        d(j2);
    }

    public final void h(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.O && recyclerView.f4812o.j() != 0) {
            recyclerView.Z0();
        }
        b bVar = recyclerView.w0;
        bVar.c(recyclerView, true);
        if (bVar.f3894d != 0) {
            try {
                a.i.n.i.a("RV Nested Prefetch");
                recyclerView.x0.i(recyclerView.v);
                for (int i2 = 0; i2 < bVar.f3894d * 2; i2 += 2) {
                    i(recyclerView, bVar.f3893c[i2], j2);
                }
            } finally {
                a.i.n.i.b();
            }
        }
    }

    public final RecyclerView.e0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f4809l;
        try {
            recyclerView.L0();
            RecyclerView.e0 e0VarI = wVar.I(i2, false, j2);
            if (e0VarI != null) {
                if (!e0VarI.x() || e0VarI.y()) {
                    wVar.a(e0VarI, false);
                } else {
                    wVar.B(e0VarI.f4855b);
                }
            }
            return e0VarI;
        } finally {
            recyclerView.N0(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f3887d.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a.i.n.i.a("RV Prefetch");
            if (!this.f3887d.isEmpty()) {
                int size = this.f3887d.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f3887d.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3889f);
                }
            }
        } finally {
            this.f3888e = 0L;
            a.i.n.i.b();
        }
    }
}
