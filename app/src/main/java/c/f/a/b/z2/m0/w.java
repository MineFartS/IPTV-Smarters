package c.f.a.b.z2.m0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f11430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11431e;

    public w(int i2, int i3) {
        this.f11427a = i2;
        byte[] bArr = new byte[i3 + 3];
        this.f11430d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i2, int i3) {
        if (this.f11428b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f11430d;
            int length = bArr2.length;
            int i5 = this.f11431e;
            if (length < i5 + i4) {
                this.f11430d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.f11430d, this.f11431e, i4);
            this.f11431e += i4;
        }
    }

    public boolean b(int i2) {
        if (!this.f11428b) {
            return false;
        }
        this.f11431e -= i2;
        this.f11428b = false;
        this.f11429c = true;
        return true;
    }

    public boolean c() {
        return this.f11429c;
    }

    public void d() {
        this.f11428b = false;
        this.f11429c = false;
    }

    public void e(int i2) {
        c.f.a.b.j3.g.g(!this.f11428b);
        boolean z = i2 == this.f11427a;
        this.f11428b = z;
        if (z) {
            this.f11431e = 3;
            this.f11429c = false;
        }
    }
}
