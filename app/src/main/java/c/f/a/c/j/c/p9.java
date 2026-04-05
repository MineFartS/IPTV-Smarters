package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class p9 extends w9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13024h;

    public p9(byte[] bArr, int i2, int i3) {
        super(bArr);
        m9.v(i2, i2 + i3, bArr.length);
        this.f13023g = i2;
        this.f13024h = i3;
    }

    @Override // c.f.a.c.j.c.w9
    public final int I() {
        return this.f13023g;
    }

    @Override // c.f.a.c.j.c.w9, c.f.a.c.j.c.m9
    public final byte e(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.f13125f[this.f13023g + i2];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // c.f.a.c.j.c.w9, c.f.a.c.j.c.m9
    public final byte g(int i2) {
        return this.f13125f[this.f13023g + i2];
    }

    @Override // c.f.a.c.j.c.w9, c.f.a.c.j.c.m9
    public final int size() {
        return this.f13024h;
    }
}
