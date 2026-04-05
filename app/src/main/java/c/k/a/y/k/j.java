package c.k.a.y.k;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import l.t;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.l f18520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.e f18522c;

    public class a extends l.i {
        public a(t tVar) {
            super(tVar);
        }

        @Override // l.i, l.t
        public long k(l.c cVar, long j2) {
            if (j.this.f18521b == 0) {
                return -1L;
            }
            long jK = super.k(cVar, Math.min(j2, j.this.f18521b));
            if (jK == -1) {
                return -1L;
            }
            j.b(j.this, jK);
            return jK;
        }
    }

    public class b extends Inflater {
        public b() {
        }

        @Override // java.util.zip.Inflater
        public int inflate(byte[] bArr, int i2, int i3) throws DataFormatException {
            int iInflate = super.inflate(bArr, i2, i3);
            if (iInflate != 0 || !needsDictionary()) {
                return iInflate;
            }
            setDictionary(n.f18533a);
            return super.inflate(bArr, i2, i3);
        }
    }

    public j(l.e eVar) {
        l.l lVar = new l.l(new a(eVar), new b());
        this.f18520a = lVar;
        this.f18522c = l.m.c(lVar);
    }

    public static /* synthetic */ int b(j jVar, long j2) {
        int i2 = (int) (((long) jVar.f18521b) - j2);
        jVar.f18521b = i2;
        return i2;
    }

    public void c() {
        this.f18522c.close();
    }

    public final void d() throws IOException {
        if (this.f18521b > 0) {
            this.f18520a.d();
            if (this.f18521b == 0) {
                return;
            }
            throw new IOException("compressedLimit > 0: " + this.f18521b);
        }
    }

    public final l.f e() {
        return this.f18522c.g(this.f18522c.C());
    }

    public List<d> f(int i2) throws IOException {
        this.f18521b += i2;
        int iC = this.f18522c.C();
        if (iC < 0) {
            throw new IOException("numberOfPairs < 0: " + iC);
        }
        if (iC > 1024) {
            throw new IOException("numberOfPairs > 1024: " + iC);
        }
        ArrayList arrayList = new ArrayList(iC);
        for (int i3 = 0; i3 < iC; i3++) {
            l.f fVarC = e().C();
            l.f fVarE = e();
            if (fVarC.size() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new d(fVarC, fVarE));
        }
        d();
        return arrayList;
    }
}
