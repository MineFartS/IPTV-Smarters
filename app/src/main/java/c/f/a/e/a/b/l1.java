package c.f.a.e.a.b;

import com.amazonaws.event.ProgressEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f15519a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15527i;

    public l1() {
        d();
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int iE = e(30, bArr, i2, i3);
        if (iE == -1) {
            return -1;
        }
        if (this.f15521c == -1) {
            long jB = j1.b(this.f15519a, 0);
            this.f15521c = jB;
            if (jB == 67324752) {
                this.f15526h = false;
                this.f15522d = j1.b(this.f15519a, 18);
                this.f15525g = j1.c(this.f15519a, 8);
                this.f15523e = j1.c(this.f15519a, 26);
                int iC = this.f15523e + 30 + j1.c(this.f15519a, 28);
                this.f15524f = iC;
                int length = this.f15519a.length;
                if (length < iC) {
                    do {
                        length += length;
                    } while (length < iC);
                    this.f15519a = Arrays.copyOf(this.f15519a, length);
                }
            } else {
                this.f15526h = true;
            }
        }
        int iE2 = e(this.f15524f, bArr, i2 + iE, i3 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i4 = iE + iE2;
        if (!this.f15526h && this.f15527i == null) {
            this.f15527i = new String(this.f15519a, 30, this.f15523e);
        }
        return i4;
    }

    public final d2 b() {
        int i2 = this.f15520b;
        int i3 = this.f15524f;
        if (i2 < i3) {
            return d2.a(this.f15527i, this.f15522d, this.f15525g, true, Arrays.copyOf(this.f15519a, i2), this.f15526h);
        }
        d2 d2VarA = d2.a(this.f15527i, this.f15522d, this.f15525g, false, Arrays.copyOf(this.f15519a, i3), this.f15526h);
        d();
        return d2VarA;
    }

    public final int c() {
        return this.f15524f;
    }

    public final void d() {
        this.f15520b = 0;
        this.f15523e = -1;
        this.f15521c = -1L;
        this.f15526h = false;
        this.f15524f = 30;
        this.f15522d = -1L;
        this.f15525g = -1;
        this.f15527i = null;
    }

    public final int e(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f15520b;
        if (i5 >= i2) {
            return 0;
        }
        int iMin = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.f15519a, this.f15520b, iMin);
        int i6 = this.f15520b + iMin;
        this.f15520b = i6;
        if (i6 < i2) {
            return -1;
        }
        return iMin;
    }
}
