package a.y.e;

import a.y.e.k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.i.q.f<b> f3801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f3802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f3803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0088a f3804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f3805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f3807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3808h;

    /* JADX INFO: renamed from: a.y.e.a$a, reason: collision with other inner class name */
    public interface InterfaceC0088a {
        void a(int i2, int i3);

        void b(b bVar);

        void c(int i2, int i3, Object obj);

        void d(b bVar);

        RecyclerView.e0 e(int i2);

        void f(int i2, int i3);

        void g(int i2, int i3);

        void h(int i2, int i3);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f3811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3812d;

        public b(int i2, int i3, int i4, Object obj) {
            this.f3809a = i2;
            this.f3810b = i3;
            this.f3812d = i4;
            this.f3811c = obj;
        }

        public String a() {
            int i2 = this.f3809a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f3809a;
            if (i2 != bVar.f3809a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f3812d - this.f3810b) == 1 && this.f3812d == bVar.f3810b && this.f3810b == bVar.f3812d) {
                return true;
            }
            if (this.f3812d != bVar.f3812d || this.f3810b != bVar.f3810b) {
                return false;
            }
            Object obj2 = this.f3811c;
            Object obj3 = bVar.f3811c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3809a * 31) + this.f3810b) * 31) + this.f3812d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3810b + "c:" + this.f3812d + ",p:" + this.f3811c + "]";
        }
    }

    public a(InterfaceC0088a interfaceC0088a) {
        this(interfaceC0088a, false);
    }

    public a(InterfaceC0088a interfaceC0088a, boolean z) {
        this.f3801a = new a.i.q.g(30);
        this.f3802b = new ArrayList<>();
        this.f3803c = new ArrayList<>();
        this.f3808h = 0;
        this.f3804d = interfaceC0088a;
        this.f3806f = z;
        this.f3807g = new k(this);
    }

    @Override // a.y.e.k.a
    public void a(b bVar) {
        if (this.f3806f) {
            return;
        }
        bVar.f3811c = null;
        this.f3801a.a(bVar);
    }

    @Override // a.y.e.k.a
    public b b(int i2, int i3, int i4, Object obj) {
        b bVarB = this.f3801a.b();
        if (bVarB == null) {
            return new b(i2, i3, i4, obj);
        }
        bVarB.f3809a = i2;
        bVarB.f3810b = i3;
        bVarB.f3812d = i4;
        bVarB.f3811c = obj;
        return bVarB;
    }

    public final void c(b bVar) {
        u(bVar);
    }

    public final void d(b bVar) {
        u(bVar);
    }

    public int e(int i2) {
        int size = this.f3802b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f3802b.get(i3);
            int i4 = bVar.f3809a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f3810b;
                    if (i5 <= i2) {
                        int i6 = bVar.f3812d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f3810b;
                    if (i7 == i2) {
                        i2 = bVar.f3812d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f3812d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f3810b <= i2) {
                i2 += bVar.f3812d;
            }
        }
        return i2;
    }

    public final void f(b bVar) {
        boolean z;
        byte b2;
        int i2 = bVar.f3810b;
        int i3 = bVar.f3812d + i2;
        byte b3 = -1;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f3804d.e(i4) != null || h(i4)) {
                if (b3 == 0) {
                    k(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    u(b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            b3 = b2;
        }
        if (i5 != bVar.f3812d) {
            a(bVar);
            bVar = b(2, i2, i5, null);
        }
        if (b3 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    public final void g(b bVar) {
        int i2 = bVar.f3810b;
        int i3 = bVar.f3812d + i2;
        int i4 = i2;
        byte b2 = -1;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f3804d.e(i2) != null || h(i2)) {
                if (b2 == 0) {
                    k(b(4, i4, i5, bVar.f3811c));
                    i4 = i2;
                    i5 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    u(b(4, i4, i5, bVar.f3811c));
                    i4 = i2;
                    i5 = 0;
                }
                b2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f3812d) {
            Object obj = bVar.f3811c;
            a(bVar);
            bVar = b(4, i4, i5, obj);
        }
        if (b2 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    public final boolean h(int i2) {
        int size = this.f3803c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f3803c.get(i3);
            int i4 = bVar.f3809a;
            if (i4 == 8) {
                if (n(bVar.f3812d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f3810b;
                int i6 = bVar.f3812d + i5;
                while (i5 < i6) {
                    if (n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f3803c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3804d.d(this.f3803c.get(i2));
        }
        w(this.f3803c);
        this.f3808h = 0;
    }

    public void j() {
        i();
        int size = this.f3802b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3802b.get(i2);
            int i3 = bVar.f3809a;
            if (i3 == 1) {
                this.f3804d.d(bVar);
                this.f3804d.g(bVar.f3810b, bVar.f3812d);
            } else if (i3 == 2) {
                this.f3804d.d(bVar);
                this.f3804d.h(bVar.f3810b, bVar.f3812d);
            } else if (i3 == 4) {
                this.f3804d.d(bVar);
                this.f3804d.c(bVar.f3810b, bVar.f3812d, bVar.f3811c);
            } else if (i3 == 8) {
                this.f3804d.d(bVar);
                this.f3804d.a(bVar.f3810b, bVar.f3812d);
            }
            Runnable runnable = this.f3805e;
            if (runnable != null) {
                runnable.run();
            }
        }
        w(this.f3802b);
        this.f3808h = 0;
    }

    public final void k(b bVar) {
        int i2;
        int i3 = bVar.f3809a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iY = y(bVar.f3810b, i3);
        int i4 = bVar.f3810b;
        int i5 = bVar.f3809a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f3812d; i7++) {
            int iY2 = y(bVar.f3810b + (i2 * i7), bVar.f3809a);
            int i8 = bVar.f3809a;
            if (i8 == 2 ? iY2 == iY : i8 == 4 && iY2 == iY + 1) {
                i6++;
            } else {
                b bVarB = b(i8, iY, i6, bVar.f3811c);
                l(bVarB, i4);
                a(bVarB);
                if (bVar.f3809a == 4) {
                    i4 += i6;
                }
                iY = iY2;
                i6 = 1;
            }
        }
        Object obj = bVar.f3811c;
        a(bVar);
        if (i6 > 0) {
            b bVarB2 = b(bVar.f3809a, iY, i6, obj);
            l(bVarB2, i4);
            a(bVarB2);
        }
    }

    public void l(b bVar, int i2) {
        this.f3804d.b(bVar);
        int i3 = bVar.f3809a;
        if (i3 == 2) {
            this.f3804d.h(i2, bVar.f3812d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3804d.c(i2, bVar.f3812d, bVar.f3811c);
        }
    }

    public int m(int i2) {
        return n(i2, 0);
    }

    public int n(int i2, int i3) {
        int size = this.f3803c.size();
        while (i3 < size) {
            b bVar = this.f3803c.get(i3);
            int i4 = bVar.f3809a;
            if (i4 == 8) {
                int i5 = bVar.f3810b;
                if (i5 == i2) {
                    i2 = bVar.f3812d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f3812d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f3810b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f3812d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f3812d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean o(int i2) {
        return (i2 & this.f3808h) != 0;
    }

    public boolean p() {
        return this.f3802b.size() > 0;
    }

    public boolean q() {
        return (this.f3803c.isEmpty() || this.f3802b.isEmpty()) ? false : true;
    }

    public boolean r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f3802b.add(b(4, i2, i3, obj));
        this.f3808h |= 4;
        return this.f3802b.size() == 1;
    }

    public boolean s(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f3802b.add(b(8, i2, i3, null));
        this.f3808h |= 8;
        return this.f3802b.size() == 1;
    }

    public boolean t(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f3802b.add(b(2, i2, i3, null));
        this.f3808h |= 2;
        return this.f3802b.size() == 1;
    }

    public final void u(b bVar) {
        this.f3803c.add(bVar);
        int i2 = bVar.f3809a;
        if (i2 == 1) {
            this.f3804d.g(bVar.f3810b, bVar.f3812d);
            return;
        }
        if (i2 == 2) {
            this.f3804d.f(bVar.f3810b, bVar.f3812d);
            return;
        }
        if (i2 == 4) {
            this.f3804d.c(bVar.f3810b, bVar.f3812d, bVar.f3811c);
        } else {
            if (i2 == 8) {
                this.f3804d.a(bVar.f3810b, bVar.f3812d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void v() {
        this.f3807g.b(this.f3802b);
        int size = this.f3802b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3802b.get(i2);
            int i3 = bVar.f3809a;
            if (i3 == 1) {
                c(bVar);
            } else if (i3 == 2) {
                f(bVar);
            } else if (i3 == 4) {
                g(bVar);
            } else if (i3 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3805e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3802b.clear();
    }

    public void w(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(list.get(i2));
        }
        list.clear();
    }

    public void x() {
        w(this.f3802b);
        w(this.f3803c);
        this.f3808h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList<a.y.e.a$b> r0 = r8.f3803c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList<a.y.e.a$b> r3 = r8.f3803c
            java.lang.Object r3 = r3.get(r0)
            a.y.e.a$b r3 = (a.y.e.a.b) r3
            int r4 = r3.f3809a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f3810b
            int r4 = r3.f3812d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f3812d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f3810b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f3810b = r2
            int r4 = r4 + 1
        L52:
            r3.f3812d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f3810b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f3810b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f3812d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f3812d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f3810b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList<a.y.e.a$b> r10 = r8.f3803c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList<a.y.e.a$b> r0 = r8.f3803c
            java.lang.Object r0 = r0.get(r10)
            a.y.e.a$b r0 = (a.y.e.a.b) r0
            int r1 = r0.f3809a
            if (r1 != r2) goto L9b
            int r1 = r0.f3812d
            int r3 = r0.f3810b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f3812d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList<a.y.e.a$b> r1 = r8.f3803c
            r1.remove(r10)
            r8.a(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.e.a.y(int, int):int");
    }
}
