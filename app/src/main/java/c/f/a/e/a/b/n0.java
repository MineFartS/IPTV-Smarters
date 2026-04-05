package c.f.a.e.a.b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f15548b = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f15549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f15550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f15553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d2 f15554h;

    public n0(File file, y1 y1Var) {
        this.f15549c = file;
        this.f15550d = y1Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        while (i3 > 0) {
            if (this.f15551e == 0 && this.f15552f == 0) {
                int iA = this.f15548b.a(bArr, i2, i3);
                if (iA == -1) {
                    return;
                }
                i2 += iA;
                i3 -= iA;
                d2 d2VarB = this.f15548b.b();
                this.f15554h = d2VarB;
                if (d2VarB.h()) {
                    this.f15551e = 0L;
                    this.f15550d.m(this.f15554h.i(), this.f15554h.i().length);
                    this.f15552f = this.f15554h.i().length;
                } else if (!this.f15554h.c() || this.f15554h.b()) {
                    byte[] bArrI = this.f15554h.i();
                    this.f15550d.m(bArrI, bArrI.length);
                    this.f15551e = this.f15554h.e();
                } else {
                    this.f15550d.g(this.f15554h.i());
                    File file = new File(this.f15549c, this.f15554h.d());
                    file.getParentFile().mkdirs();
                    this.f15551e = this.f15554h.e();
                    this.f15553g = new FileOutputStream(file);
                }
            }
            if (!this.f15554h.b()) {
                if (this.f15554h.h()) {
                    this.f15550d.i(this.f15552f, bArr, i2, i3);
                    this.f15552f += (long) i3;
                    iMin = i3;
                } else if (this.f15554h.c()) {
                    iMin = (int) Math.min(i3, this.f15551e);
                    this.f15553g.write(bArr, i2, iMin);
                    long j2 = this.f15551e - ((long) iMin);
                    this.f15551e = j2;
                    if (j2 == 0) {
                        this.f15553g.close();
                    }
                } else {
                    iMin = (int) Math.min(i3, this.f15551e);
                    int length = this.f15554h.i().length;
                    this.f15550d.i((((long) length) + this.f15554h.e()) - this.f15551e, bArr, i2, iMin);
                    this.f15551e -= (long) iMin;
                }
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }
}
