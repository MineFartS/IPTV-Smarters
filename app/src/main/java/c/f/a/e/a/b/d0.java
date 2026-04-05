package c.f.a.e.a.b;

import com.amazonaws.event.ProgressEvent;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f15385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f15386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15389f;

    public d0(InputStream inputStream) {
        super(inputStream);
        this.f15385b = new l1();
        this.f15386c = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        this.f15388e = false;
        this.f15389f = false;
    }

    public final d2 d() {
        byte[] bArr;
        if (this.f15387d > 0) {
            do {
                bArr = this.f15386c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f15388e || this.f15389f) {
            return new d2(null, -1L, -1, false, false, null);
        }
        if (!n(30)) {
            this.f15388e = true;
            return this.f15385b.b();
        }
        d2 d2VarB = this.f15385b.b();
        if (d2VarB.h()) {
            this.f15389f = true;
            return d2VarB;
        }
        if (d2VarB.e() == 4294967295L) {
            throw new k0("Files bigger than 4GiB are not supported.");
        }
        int iC = this.f15385b.c() - 30;
        long j2 = iC;
        int length = this.f15386c.length;
        if (j2 > length) {
            do {
                length += length;
            } while (length < j2);
            this.f15386c = Arrays.copyOf(this.f15386c, length);
        }
        if (!n(iC)) {
            this.f15388e = true;
            return this.f15385b.b();
        }
        d2 d2VarB2 = this.f15385b.b();
        this.f15387d = d2VarB2.e();
        return d2VarB2;
    }

    public final boolean i() {
        return this.f15388e;
    }

    public final boolean l() {
        return this.f15389f;
    }

    public final long m() {
        return this.f15387d;
    }

    public final boolean n(int i2) {
        int iO = o(this.f15386c, 0, i2);
        if (iO != i2) {
            int i3 = i2 - iO;
            if (o(this.f15386c, iO, i3) != i3) {
                this.f15385b.a(this.f15386c, 0, iO);
                return false;
            }
        }
        this.f15385b.a(this.f15386c, 0, i2);
        return true;
    }

    public final int o(byte[] bArr, int i2, int i3) {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f15387d;
        if (j2 <= 0 || this.f15388e) {
            return -1;
        }
        int iO = o(bArr, i2, (int) Math.min(j2, i3));
        this.f15387d -= (long) iO;
        if (iO != 0) {
            return iO;
        }
        this.f15388e = true;
        return 0;
    }
}
