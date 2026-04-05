package c.k.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    public static class a extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f18283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f18284b;

        public a(p pVar, byte[] bArr) {
            this.f18284b = bArr;
        }

        @Override // c.k.a.t
        public long a() {
            return this.f18284b.length;
        }

        @Override // c.k.a.t
        public p b() {
            return this.f18283a;
        }

        @Override // c.k.a.t
        public void d(l.d dVar) {
            dVar.i0(this.f18284b);
        }
    }

    public static t c(p pVar, byte[] bArr) {
        if (bArr != null) {
            return new a(pVar, bArr);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract p b();

    public abstract void d(l.d dVar);
}
