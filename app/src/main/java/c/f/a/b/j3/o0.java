package c.f.a.b.j3;

import c.f.a.b.j3.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<b> f9236a = new Comparator() { // from class: c.f.a.b.j3.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o0.e((o0.b) obj, (o0.b) obj2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<b> f9237b = new Comparator() { // from class: c.f.a.b.j3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((o0.b) obj).f9247c, ((o0.b) obj2).f9247c);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9238c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9244i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b[] f9240e = new b[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f9239d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9241f = -1;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f9247c;

        public b() {
        }
    }

    public o0(int i2) {
        this.f9238c = i2;
    }

    public static /* synthetic */ int e(b bVar, b bVar2) {
        return bVar.f9245a - bVar2.f9245a;
    }

    public void a(int i2, float f2) {
        b bVar;
        int i3;
        b bVar2;
        int i4;
        b();
        int i5 = this.f9244i;
        if (i5 > 0) {
            b[] bVarArr = this.f9240e;
            int i6 = i5 - 1;
            this.f9244i = i6;
            bVar = bVarArr[i6];
        } else {
            bVar = new b();
        }
        int i7 = this.f9242g;
        this.f9242g = i7 + 1;
        bVar.f9245a = i7;
        bVar.f9246b = i2;
        bVar.f9247c = f2;
        this.f9239d.add(bVar);
        int i8 = this.f9243h + i2;
        while (true) {
            this.f9243h = i8;
            while (true) {
                int i9 = this.f9243h;
                int i10 = this.f9238c;
                if (i9 <= i10) {
                    return;
                }
                i3 = i9 - i10;
                bVar2 = this.f9239d.get(0);
                i4 = bVar2.f9246b;
                if (i4 <= i3) {
                    this.f9243h -= i4;
                    this.f9239d.remove(0);
                    int i11 = this.f9244i;
                    if (i11 < 5) {
                        b[] bVarArr2 = this.f9240e;
                        this.f9244i = i11 + 1;
                        bVarArr2[i11] = bVar2;
                    }
                }
            }
            bVar2.f9246b = i4 - i3;
            i8 = this.f9243h - i3;
        }
    }

    public final void b() {
        if (this.f9241f != 1) {
            Collections.sort(this.f9239d, f9236a);
            this.f9241f = 1;
        }
    }

    public final void c() {
        if (this.f9241f != 0) {
            Collections.sort(this.f9239d, f9237b);
            this.f9241f = 0;
        }
    }

    public float d(float f2) {
        c();
        float f3 = f2 * this.f9243h;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9239d.size(); i3++) {
            b bVar = this.f9239d.get(i3);
            i2 += bVar.f9246b;
            if (i2 >= f3) {
                return bVar.f9247c;
            }
        }
        if (this.f9239d.isEmpty()) {
            return Float.NaN;
        }
        return this.f9239d.get(r5.size() - 1).f9247c;
    }

    public void g() {
        this.f9239d.clear();
        this.f9241f = -1;
        this.f9242g = 0;
        this.f9243h = 0;
    }
}
