package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.z2.k;
import c.f.a.b.z2.m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11058a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f11059b = new i0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11060c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11062e;

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        this.f11061d = 0;
        do {
            int i5 = this.f11061d;
            int i6 = i2 + i5;
            f fVar = this.f11058a;
            if (i6 >= fVar.f11069g) {
                break;
            }
            int[] iArr = fVar.f11072j;
            this.f11061d = i5 + 1;
            i3 = iArr[i5 + i2];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    public f b() {
        return this.f11058a;
    }

    public i0 c() {
        return this.f11059b;
    }

    public boolean d(k kVar) {
        int i2;
        c.f.a.b.j3.g.g(kVar != null);
        if (this.f11062e) {
            this.f11062e = false;
            this.f11059b.L(0);
        }
        while (!this.f11062e) {
            if (this.f11060c < 0) {
                if (!this.f11058a.c(kVar) || !this.f11058a.a(kVar, true)) {
                    return false;
                }
                f fVar = this.f11058a;
                int iA = fVar.f11070h;
                if ((fVar.f11064b & 1) == 1 && this.f11059b.f() == 0) {
                    iA += a(0);
                    i2 = this.f11061d + 0;
                } else {
                    i2 = 0;
                }
                if (!m.e(kVar, iA)) {
                    return false;
                }
                this.f11060c = i2;
            }
            int iA2 = a(this.f11060c);
            int i3 = this.f11060c + this.f11061d;
            if (iA2 > 0) {
                i0 i0Var = this.f11059b;
                i0Var.c(i0Var.f() + iA2);
                if (!m.d(kVar, this.f11059b.d(), this.f11059b.f(), iA2)) {
                    return false;
                }
                i0 i0Var2 = this.f11059b;
                i0Var2.O(i0Var2.f() + iA2);
                this.f11062e = this.f11058a.f11072j[i3 + (-1)] != 255;
            }
            if (i3 == this.f11058a.f11069g) {
                i3 = -1;
            }
            this.f11060c = i3;
        }
        return true;
    }

    public void e() {
        this.f11058a.b();
        this.f11059b.L(0);
        this.f11060c = -1;
        this.f11062e = false;
    }

    public void f() {
        if (this.f11059b.d().length == 65025) {
            return;
        }
        i0 i0Var = this.f11059b;
        i0Var.N(Arrays.copyOf(i0Var.d(), Math.max(65025, this.f11059b.f())), this.f11059b.f());
    }
}
