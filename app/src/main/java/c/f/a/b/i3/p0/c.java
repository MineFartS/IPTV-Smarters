package c.f.a.b.i3.p0;

import android.support.v4.media.session.PlaybackStateCompat;
import c.f.a.b.i3.n;
import c.f.a.b.i3.p0.b;
import c.f.a.b.j3.m0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements c.f.a.b.i3.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.i3.p0.b f8948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.b.i3.s f8951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f8953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f8954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m0 f8957j;

    public static final class a extends b.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public static final class b implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.f.a.b.i3.p0.b f8958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8959b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8960c = 20480;

        @Override // c.f.a.b.i3.n.a
        public c.f.a.b.i3.n a() {
            return new c((c.f.a.b.i3.p0.b) c.f.a.b.j3.g.e(this.f8958a), this.f8959b, this.f8960c);
        }

        public b b(c.f.a.b.i3.p0.b bVar) {
            this.f8958a = bVar;
            return this;
        }
    }

    public c(c.f.a.b.i3.p0.b bVar, long j2, int i2) {
        c.f.a.b.j3.g.h(j2 > 0 || j2 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j2 != -1 && j2 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            z.i("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f8948a = (c.f.a.b.i3.p0.b) c.f.a.b.j3.g.e(bVar);
        this.f8949b = j2 == -1 ? Long.MAX_VALUE : j2;
        this.f8950c = i2;
    }

    public final void a() {
        OutputStream outputStream = this.f8954g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            x0.o(this.f8954g);
            this.f8954g = null;
            File file = (File) x0.i(this.f8953f);
            this.f8953f = null;
            this.f8948a.h(file, this.f8955h);
        } catch (Throwable th) {
            x0.o(this.f8954g);
            this.f8954g = null;
            File file2 = (File) x0.i(this.f8953f);
            this.f8953f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(c.f.a.b.i3.s sVar) {
        long j2 = sVar.f9068h;
        this.f8953f = this.f8948a.a((String) x0.i(sVar.f9069i), sVar.f9067g + this.f8956i, j2 != -1 ? Math.min(j2 - this.f8956i, this.f8952e) : -1L);
        OutputStream fileOutputStream = new FileOutputStream(this.f8953f);
        if (this.f8950c > 0) {
            m0 m0Var = this.f8957j;
            if (m0Var == null) {
                this.f8957j = new m0(fileOutputStream, this.f8950c);
            } else {
                m0Var.d(fileOutputStream);
            }
            fileOutputStream = this.f8957j;
        }
        this.f8954g = fileOutputStream;
        this.f8955h = 0L;
    }

    @Override // c.f.a.b.i3.n
    public void close() throws a {
        if (this.f8951d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    @Override // c.f.a.b.i3.n
    public void f(byte[] bArr, int i2, int i3) throws a {
        c.f.a.b.i3.s sVar = this.f8951d;
        if (sVar == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f8955h == this.f8952e) {
                    a();
                    b(sVar);
                }
                int iMin = (int) Math.min(i3 - i4, this.f8952e - this.f8955h);
                ((OutputStream) x0.i(this.f8954g)).write(bArr, i2 + i4, iMin);
                i4 += iMin;
                long j2 = iMin;
                this.f8955h += j2;
                this.f8956i += j2;
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
    }

    @Override // c.f.a.b.i3.n
    public void g(c.f.a.b.i3.s sVar) throws a {
        c.f.a.b.j3.g.e(sVar.f9069i);
        if (sVar.f9068h == -1 && sVar.d(2)) {
            this.f8951d = null;
            return;
        }
        this.f8951d = sVar;
        this.f8952e = sVar.d(4) ? this.f8949b : Long.MAX_VALUE;
        this.f8956i = 0L;
        try {
            b(sVar);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }
}
