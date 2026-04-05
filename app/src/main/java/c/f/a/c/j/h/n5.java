package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 extends o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13458d;

    public /* synthetic */ n5(byte[] bArr, int i2, int i3, boolean z, m5 m5Var) {
        super(null);
        this.f13458d = Integer.MAX_VALUE;
        this.f13455a = bArr;
        this.f13456b = 0;
    }

    public final int c(int i2) {
        int i3 = this.f13458d;
        this.f13458d = 0;
        int i4 = this.f13456b + this.f13457c;
        this.f13456b = i4;
        if (i4 > 0) {
            this.f13457c = i4;
            this.f13456b = 0;
        } else {
            this.f13457c = 0;
        }
        return i3;
    }
}
