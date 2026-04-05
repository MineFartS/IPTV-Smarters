package c.d.a.m;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5462b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5464d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OutputStream f5468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f5469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f5470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f5471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f5473m;
    public boolean u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f5463c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5465e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5466f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5467g = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f5474n = new boolean[256];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5475o = 7;
    public int p = -1;
    public boolean q = false;
    public boolean r = true;
    public boolean s = false;
    public int t = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.f5467g) {
            return false;
        }
        try {
            if (!this.s) {
                g(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f5469i = bitmap;
            e();
            b();
            if (this.r) {
                k();
                m();
                if (this.f5465e >= 0) {
                    l();
                }
            }
            i();
            j();
            if (!this.r) {
                m();
            }
            n();
            this.r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b() {
        byte[] bArr = this.f5470j;
        int length = bArr.length;
        int i2 = length / 3;
        this.f5471k = new byte[i2];
        c cVar = new c(bArr, length, this.t);
        this.f5473m = cVar.h();
        int iIntValue = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.f5473m;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            int i4 = i3 + 2;
            bArr2[i3] = bArr2[i4];
            bArr2[i4] = b2;
            this.f5474n[i3 / 3] = false;
            i3 += 3;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            byte[] bArr3 = this.f5470j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int iG = cVar.g(bArr3[i6] & 255, bArr3[i7] & 255, bArr3[i8] & 255);
            this.f5474n[iG] = true;
            this.f5471k[i5] = (byte) iG;
            i5++;
            i6 = i8 + 1;
        }
        this.f5470j = null;
        this.f5472l = 8;
        this.f5475o = 7;
        Integer num = this.f5463c;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (!this.u) {
            return;
        }
        this.f5464d = c(iIntValue);
    }

    public final int c(int i2) {
        if (this.f5473m == null) {
            return -1;
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        int i3 = 16777216;
        int length = this.f5473m.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte[] bArr = this.f5473m;
            int i6 = i4 + 1;
            int i7 = iRed - (bArr[i4] & 255);
            int i8 = i6 + 1;
            int i9 = iGreen - (bArr[i6] & 255);
            int i10 = iBlue - (bArr[i8] & 255);
            int i11 = (i7 * i7) + (i9 * i9) + (i10 * i10);
            int i12 = i8 / 3;
            if (this.f5474n[i12] && i11 < i3) {
                i3 = i11;
                i5 = i12;
            }
            i4 = i8 + 1;
        }
        return i5;
    }

    public boolean d() {
        boolean z;
        if (!this.f5467g) {
            return false;
        }
        this.f5467g = false;
        try {
            this.f5468h.write(59);
            this.f5468h.flush();
            if (this.q) {
                this.f5468h.close();
            }
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.f5464d = 0;
        this.f5468h = null;
        this.f5469i = null;
        this.f5470j = null;
        this.f5471k = null;
        this.f5473m = null;
        this.q = false;
        this.r = true;
        return z;
    }

    public final void e() {
        int width = this.f5469i.getWidth();
        int height = this.f5469i.getHeight();
        int i2 = this.f5461a;
        if (width != i2 || height != this.f5462b) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, this.f5462b, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            this.f5469i = bitmapCreateBitmap;
        }
        int i3 = width * height;
        int[] iArr = new int[i3];
        this.f5469i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f5470j = new byte[i3 * 3];
        this.u = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = iArr[i4];
            if (i7 == 0) {
                i5++;
            }
            byte[] bArr = this.f5470j;
            int i8 = i6 + 1;
            bArr[i6] = (byte) (i7 & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) ((i7 >> 8) & 255);
            bArr[i9] = (byte) ((i7 >> 16) & 255);
            i4++;
            i6 = i9 + 1;
        }
        double d2 = i5 * 100;
        double d3 = i3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        this.u = d4 > 4.0d;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            Log.d("AnimatedGifEncoder", "got pixels for frame with " + d4 + "% transparent pixels");
        }
    }

    public void f(int i2) {
        this.f5466f = Math.round(i2 / 10.0f);
    }

    public void g(int i2, int i3) {
        if (!this.f5467g || this.r) {
            this.f5461a = i2;
            this.f5462b = i3;
            if (i2 < 1) {
                this.f5461a = 320;
            }
            if (i3 < 1) {
                this.f5462b = 240;
            }
            this.s = true;
        }
    }

    public boolean h(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.q = false;
        this.f5468h = outputStream;
        try {
            p("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.f5467g = z;
        return z;
    }

    public final void i() throws IOException {
        int i2;
        int i3;
        this.f5468h.write(33);
        this.f5468h.write(249);
        this.f5468h.write(4);
        if (this.f5463c != null || this.u) {
            i2 = 1;
            i3 = 2;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i4 = this.p;
        if (i4 >= 0) {
            i3 = i4 & 7;
        }
        this.f5468h.write(i2 | (i3 << 2) | 0 | 0);
        o(this.f5466f);
        this.f5468h.write(this.f5464d);
        this.f5468h.write(0);
    }

    public final void j() throws IOException {
        this.f5468h.write(44);
        o(0);
        o(0);
        o(this.f5461a);
        o(this.f5462b);
        if (this.r) {
            this.f5468h.write(0);
        } else {
            this.f5468h.write(this.f5475o | 128);
        }
    }

    public final void k() throws IOException {
        o(this.f5461a);
        o(this.f5462b);
        this.f5468h.write(this.f5475o | 240);
        this.f5468h.write(0);
        this.f5468h.write(0);
    }

    public final void l() throws IOException {
        this.f5468h.write(33);
        this.f5468h.write(255);
        this.f5468h.write(11);
        p("NETSCAPE2.0");
        this.f5468h.write(3);
        this.f5468h.write(1);
        o(this.f5465e);
        this.f5468h.write(0);
    }

    public final void m() throws IOException {
        OutputStream outputStream = this.f5468h;
        byte[] bArr = this.f5473m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f5473m.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f5468h.write(0);
        }
    }

    public final void n() throws IOException {
        new b(this.f5461a, this.f5462b, this.f5471k, this.f5472l).f(this.f5468h);
    }

    public final void o(int i2) throws IOException {
        this.f5468h.write(i2 & 255);
        this.f5468h.write((i2 >> 8) & 255);
    }

    public final void p(String str) throws IOException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            this.f5468h.write((byte) str.charAt(i2));
        }
    }
}
