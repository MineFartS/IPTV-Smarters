package c.f.a.b.z2.m0;

import android.net.Uri;
import android.util.SparseArray;
import c.f.a.b.j3.u0;
import c.f.a.b.z2.x;
import com.amazonaws.event.ProgressEvent;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f11116a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.m0.d
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return b0.b();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f11117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<a> f11118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f11120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f11125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.b.z2.l f11126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11127l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f11128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u0 f11129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.j3.h0 f11130c = new c.f.a.b.j3.h0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f11135h;

        public a(o oVar, u0 u0Var) {
            this.f11128a = oVar;
            this.f11129b = u0Var;
        }

        public void a(c.f.a.b.j3.i0 i0Var) {
            i0Var.j(this.f11130c.f9198a, 0, 3);
            this.f11130c.p(0);
            b();
            i0Var.j(this.f11130c.f9198a, 0, this.f11134g);
            this.f11130c.p(0);
            c();
            this.f11128a.f(this.f11135h, 4);
            this.f11128a.b(i0Var);
            this.f11128a.d();
        }

        public final void b() {
            this.f11130c.r(8);
            this.f11131d = this.f11130c.g();
            this.f11132e = this.f11130c.g();
            this.f11130c.r(6);
            this.f11134g = this.f11130c.h(8);
        }

        public final void c() {
            this.f11135h = 0L;
            if (this.f11131d) {
                this.f11130c.r(4);
                long jH = ((long) this.f11130c.h(3)) << 30;
                this.f11130c.r(1);
                long jH2 = jH | ((long) (this.f11130c.h(15) << 15));
                this.f11130c.r(1);
                long jH3 = jH2 | ((long) this.f11130c.h(15));
                this.f11130c.r(1);
                if (!this.f11133f && this.f11132e) {
                    this.f11130c.r(4);
                    long jH4 = ((long) this.f11130c.h(3)) << 30;
                    this.f11130c.r(1);
                    long jH5 = jH4 | ((long) (this.f11130c.h(15) << 15));
                    this.f11130c.r(1);
                    long jH6 = jH5 | ((long) this.f11130c.h(15));
                    this.f11130c.r(1);
                    this.f11129b.b(jH6);
                    this.f11133f = true;
                }
                this.f11135h = this.f11129b.b(jH3);
            }
        }

        public void d() {
            this.f11133f = false;
            this.f11128a.c();
        }
    }

    public b0() {
        this(new u0(0L));
    }

    public b0(u0 u0Var) {
        this.f11117b = u0Var;
        this.f11119d = new c.f.a.b.j3.i0(ProgressEvent.PART_FAILED_EVENT_CODE);
        this.f11118c = new SparseArray<>();
        this.f11120e = new a0();
    }

    public static /* synthetic */ c.f.a.b.z2.j[] b() {
        return new c.f.a.b.z2.j[]{new b0()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        boolean z = this.f11117b.e() == -9223372036854775807L;
        if (!z) {
            long jC = this.f11117b.c();
            z = (jC == -9223372036854775807L || jC == 0 || jC == j3) ? false : true;
        }
        if (z) {
            this.f11117b.g(j3);
        }
        z zVar = this.f11125j;
        if (zVar != null) {
            zVar.h(j3);
        }
        for (int i2 = 0; i2 < this.f11118c.size(); i2++) {
            this.f11118c.valueAt(i2).d();
        }
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f11126k = lVar;
    }

    @RequiresNonNull({"output"})
    public final void d(long j2) {
        c.f.a.b.z2.l lVar;
        c.f.a.b.z2.x bVar;
        if (this.f11127l) {
            return;
        }
        this.f11127l = true;
        if (this.f11120e.c() != -9223372036854775807L) {
            z zVar = new z(this.f11120e.d(), this.f11120e.c(), j2);
            this.f11125j = zVar;
            lVar = this.f11126k;
            bVar = zVar.b();
        } else {
            lVar = this.f11126k;
            bVar = new x.b(this.f11120e.c());
        }
        lVar.i(bVar);
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        byte[] bArr = new byte[14];
        kVar.u(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        kVar.m(bArr[13] & 7);
        kVar.u(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    @Override // c.f.a.b.z2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(c.f.a.b.z2.k r11, c.f.a.b.z2.w r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.b0.g(c.f.a.b.z2.k, c.f.a.b.z2.w):int");
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
