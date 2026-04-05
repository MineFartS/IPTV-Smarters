package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f13216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f13218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13219d;

    public b8(q7 q7Var, String str, Object[] objArr) {
        this.f13216a = q7Var;
        this.f13217b = str;
        this.f13218c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f13219d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f13219d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    public final String a() {
        return this.f13217b;
    }

    public final Object[] b() {
        return this.f13218c;
    }

    @Override // c.f.a.c.j.h.n7
    public final q7 k() {
        return this.f13216a;
    }

    @Override // c.f.a.c.j.h.n7
    public final int l() {
        return (this.f13219d & 1) == 1 ? 1 : 2;
    }

    @Override // c.f.a.c.j.h.n7
    public final boolean zza() {
        return (this.f13219d & 2) == 2;
    }
}
