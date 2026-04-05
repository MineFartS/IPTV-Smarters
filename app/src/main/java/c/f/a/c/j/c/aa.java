package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class aa extends y9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12768j;

    public aa(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f12768j = Integer.MAX_VALUE;
        this.f12762d = bArr;
        this.f12764f = i3 + i2;
        this.f12766h = i2;
        this.f12767i = i2;
        this.f12763e = z;
    }

    @Override // c.f.a.c.j.c.y9
    public final int b(int i2) throws ab {
        if (i2 < 0) {
            throw new ab("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iC = i2 + c();
        int i3 = this.f12768j;
        if (iC > i3) {
            throw new ab("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f12768j = iC;
        int i4 = this.f12764f + this.f12765g;
        this.f12764f = i4;
        int i5 = i4 - this.f12767i;
        if (i5 > iC) {
            int i6 = i5 - iC;
            this.f12765g = i6;
            this.f12764f = i4 - i6;
        } else {
            this.f12765g = 0;
        }
        return i3;
    }

    @Override // c.f.a.c.j.c.y9
    public final int c() {
        return this.f12766h - this.f12767i;
    }
}
