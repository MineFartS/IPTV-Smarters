package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13147c;

    public y9() {
        this.f13145a = 100;
        this.f13146b = Integer.MAX_VALUE;
        this.f13147c = false;
    }

    public static y9 a(byte[] bArr, int i2, int i3, boolean z) {
        aa aaVar = new aa(bArr, i3);
        try {
            aaVar.b(i3);
            return aaVar;
        } catch (ab e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int b(int i2);

    public abstract int c();
}
