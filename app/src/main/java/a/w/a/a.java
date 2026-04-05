package a.w.a;

import a.w.a.b;
import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<b> f3700a = new C0086a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b.d> f3703d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b.c[] f3705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3706g = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimingLogger f3704e = null;

    /* JADX INFO: renamed from: a.w.a.a$a, reason: collision with other inner class name */
    public static class C0086a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3713g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3714h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3715i;

        public b(int i2, int i3) {
            this.f3707a = i2;
            this.f3708b = i3;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.f3701b;
            int[] iArr2 = aVar.f3702c;
            a.e(iArr, iF, this.f3707a, this.f3708b);
            Arrays.sort(iArr, this.f3707a, this.f3708b + 1);
            a.e(iArr, iF, this.f3707a, this.f3708b);
            int i2 = this.f3709c / 2;
            int i3 = this.f3707a;
            int i4 = 0;
            while (true) {
                int i5 = this.f3708b;
                if (i3 > i5) {
                    return this.f3707a;
                }
                i4 += iArr2[iArr[i3]];
                if (i4 >= i2) {
                    return Math.min(i5 - 1, i3);
                }
                i3++;
            }
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f3701b;
            int[] iArr2 = aVar.f3702c;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.f3707a; i9 <= this.f3708b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int iK = a.k(i10);
                int iJ = a.j(i10);
                int i11 = a.i(i10);
                if (iK > i5) {
                    i5 = iK;
                }
                if (iK < i2) {
                    i2 = iK;
                }
                if (iJ > i6) {
                    i6 = iJ;
                }
                if (iJ < i3) {
                    i3 = iJ;
                }
                if (i11 > i7) {
                    i7 = i11;
                }
                if (i11 < i4) {
                    i4 = i11;
                }
            }
            this.f3710d = i2;
            this.f3711e = i5;
            this.f3712f = i3;
            this.f3713g = i6;
            this.f3714h = i4;
            this.f3715i = i7;
            this.f3709c = i8;
        }

        public final b.d d() {
            a aVar = a.this;
            int[] iArr = aVar.f3701b;
            int[] iArr2 = aVar.f3702c;
            int iK = 0;
            int i2 = 0;
            int iJ = 0;
            int i3 = 0;
            for (int i4 = this.f3707a; i4 <= this.f3708b; i4++) {
                int i5 = iArr[i4];
                int i6 = iArr2[i5];
                i2 += i6;
                iK += a.k(i5) * i6;
                iJ += a.j(i5) * i6;
                i3 += i6 * a.i(i5);
            }
            float f2 = i2;
            return new b.d(a.b(Math.round(iK / f2), Math.round(iJ / f2), Math.round(i3 / f2)), i2);
        }

        public final int e() {
            return (this.f3708b + 1) - this.f3707a;
        }

        public final int f() {
            int i2 = this.f3711e - this.f3710d;
            int i3 = this.f3713g - this.f3712f;
            int i4 = this.f3715i - this.f3714h;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.f3711e - this.f3710d) + 1) * ((this.f3713g - this.f3712f) + 1) * ((this.f3715i - this.f3714h) + 1);
        }

        public final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = a.this.new b(iB + 1, this.f3708b);
            this.f3708b = iB;
            c();
            return bVar;
        }
    }

    public a(int[] iArr, int i2, b.c[] cVarArr) {
        this.f3705f = cVarArr;
        int[] iArr2 = new int[32768];
        this.f3702c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int iG = g(iArr[i3]);
            iArr[i3] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0 && l(i5)) {
                iArr2[i5] = 0;
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f3701b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > i2) {
            this.f3703d = h(i2);
            return;
        }
        this.f3703d = new ArrayList();
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = iArr3[i8];
            this.f3703d.add(new b.d(a(i9), iArr2[i9]));
        }
    }

    public static int a(int i2) {
        return b(k(i2), j(i2), i(i2));
    }

    public static int b(int i2, int i3, int i4) {
        return Color.rgb(f(i2, 5, 8), f(i3, 5, 8), f(i4, 5, 8));
    }

    public static void e(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = i(i5) | (j(i5) << 10) | (k(i5) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = k(i6) | (i(i6) << 10) | (j(i6) << 5);
            i3++;
        }
    }

    public static int f(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    public static int g(int i2) {
        return f(Color.blue(i2), 8, 5) | (f(Color.red(i2), 8, 5) << 10) | (f(Color.green(i2), 8, 5) << 5);
    }

    public static int i(int i2) {
        return i2 & 31;
    }

    public static int j(int i2) {
        return (i2 >> 5) & 31;
    }

    public static int k(int i2) {
        return (i2 >> 10) & 31;
    }

    public final List<b.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            b.d dVarD = it.next().d();
            if (!n(dVarD)) {
                arrayList.add(dVarD);
            }
        }
        return arrayList;
    }

    public List<b.d> d() {
        return this.f3703d;
    }

    public final List<b.d> h(int i2) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i2, f3700a);
        priorityQueue.offer(new b(0, this.f3701b.length - 1));
        o(priorityQueue, i2);
        return c(priorityQueue);
    }

    public final boolean l(int i2) {
        int iA = a(i2);
        a.i.j.a.f(iA, this.f3706g);
        return m(iA, this.f3706g);
    }

    public final boolean m(int i2, float[] fArr) {
        b.c[] cVarArr = this.f3705f;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (!this.f3705f[i3].a(i2, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(b.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i2) {
        b bVarPoll;
        while (priorityQueue.size() < i2 && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.a()) {
            priorityQueue.offer(bVarPoll.h());
            priorityQueue.offer(bVarPoll);
        }
    }
}
