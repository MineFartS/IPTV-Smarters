package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e5 extends j5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13301g;

    public e5(byte[] bArr, int i2, int i3) {
        super(bArr);
        l5.D(0, i3, bArr.length);
        this.f13301g = i3;
    }

    @Override // c.f.a.c.j.h.j5
    public final int F() {
        return 0;
    }

    @Override // c.f.a.c.j.h.j5, c.f.a.c.j.h.l5
    public final byte a(int i2) {
        int i3 = this.f13301g;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f13381f[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // c.f.a.c.j.h.j5, c.f.a.c.j.h.l5
    public final byte b(int i2) {
        return this.f13381f[i2];
    }

    @Override // c.f.a.c.j.h.j5, c.f.a.c.j.h.l5
    public final int d() {
        return this.f13301g;
    }
}
