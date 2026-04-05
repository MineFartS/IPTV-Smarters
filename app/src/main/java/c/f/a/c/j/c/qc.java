package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class qc implements zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc f13046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f13048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13049d;

    public qc(bc bcVar, String str, Object[] objArr) {
        this.f13046a = bcVar;
        this.f13047b = str;
        this.f13048c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f13049d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f13049d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // c.f.a.c.j.c.zb
    public final boolean a() {
        return (this.f13049d & 2) == 2;
    }

    @Override // c.f.a.c.j.c.zb
    public final bc b() {
        return this.f13046a;
    }

    @Override // c.f.a.c.j.c.zb
    public final int c() {
        return (this.f13049d & 1) == 1 ? oa.e.f13004i : oa.e.f13005j;
    }

    public final String d() {
        return this.f13047b;
    }

    public final Object[] e() {
        return this.f13048c;
    }
}
