package c.d.a.l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f5458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f5459c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5457a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5460d = 0;

    public void a() {
        this.f5458b = null;
        this.f5459c = null;
    }

    public final boolean b() {
        return this.f5459c.f5445b != 0;
    }

    public c c() {
        if (this.f5458b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f5459c;
        }
        j();
        if (!b()) {
            h();
            c cVar = this.f5459c;
            if (cVar.f5446c < 0) {
                cVar.f5445b = 1;
            }
        }
        return this.f5459c;
    }

    public final int d() {
        try {
            return this.f5458b.get() & 255;
        } catch (Exception unused) {
            this.f5459c.f5445b = 1;
            return 0;
        }
    }

    public final void e() {
        this.f5459c.f5447d.f5433a = m();
        this.f5459c.f5447d.f5434b = m();
        this.f5459c.f5447d.f5435c = m();
        this.f5459c.f5447d.f5436d = m();
        int iD = d();
        boolean z = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f5459c.f5447d;
        bVar.f5437e = (iD & 64) != 0;
        if (z) {
            bVar.f5443k = g(iPow);
        } else {
            bVar.f5443k = null;
        }
        this.f5459c.f5447d.f5442j = this.f5458b.position();
        q();
        if (b()) {
            return;
        }
        c cVar = this.f5459c;
        cVar.f5446c++;
        cVar.f5448e.add(cVar.f5447d);
    }

    public final int f() {
        int iD = d();
        this.f5460d = iD;
        int i2 = 0;
        if (iD > 0) {
            int i3 = 0;
            while (true) {
                try {
                    i3 = this.f5460d;
                    if (i2 >= i3) {
                        break;
                    }
                    i3 -= i2;
                    this.f5458b.get(this.f5457a, i2, i3);
                    i2 += i3;
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f5460d, e2);
                    }
                    this.f5459c.f5445b = 1;
                }
            }
        }
        return i2;
    }

    public final int[] g(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f5458b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = bArr[i4] & 255;
                int i7 = i5 + 1;
                int i8 = bArr[i5] & 255;
                int i9 = i7 + 1;
                int i10 = i3 + 1;
                iArr[i3] = (i6 << 16) | DefaultRenderer.BACKGROUND_COLOR | (i8 << 8) | (bArr[i7] & 255);
                i4 = i9;
                i3 = i10;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f5459c.f5445b = 1;
        }
        return iArr;
    }

    public final void h() {
        boolean z = false;
        while (!z && !b()) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 != 1) {
                    if (iD2 == 249) {
                        this.f5459c.f5447d = new b();
                        i();
                    } else if (iD2 != 254 && iD2 == 255) {
                        f();
                        String str = BuildConfig.FLAVOR;
                        for (int i2 = 0; i2 < 11; i2++) {
                            str = str + ((char) this.f5457a[i2]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            l();
                        }
                    }
                }
                p();
            } else if (iD == 44) {
                c cVar = this.f5459c;
                if (cVar.f5447d == null) {
                    cVar.f5447d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f5459c.f5445b = 1;
            } else {
                z = true;
            }
        }
    }

    public final void i() {
        d();
        int iD = d();
        b bVar = this.f5459c.f5447d;
        int i2 = (iD & 28) >> 2;
        bVar.f5439g = i2;
        if (i2 == 0) {
            bVar.f5439g = 1;
        }
        bVar.f5438f = (iD & 1) != 0;
        int iM = m();
        if (iM < 3) {
            iM = 10;
        }
        b bVar2 = this.f5459c.f5447d;
        bVar2.f5441i = iM * 10;
        bVar2.f5440h = d();
        d();
    }

    public final void j() {
        String str = BuildConfig.FLAVOR;
        for (int i2 = 0; i2 < 6; i2++) {
            str = str + ((char) d());
        }
        if (!str.startsWith("GIF")) {
            this.f5459c.f5445b = 1;
            return;
        }
        k();
        if (!this.f5459c.f5451h || b()) {
            return;
        }
        c cVar = this.f5459c;
        cVar.f5444a = g(cVar.f5452i);
        c cVar2 = this.f5459c;
        cVar2.f5455l = cVar2.f5444a[cVar2.f5453j];
    }

    public final void k() {
        this.f5459c.f5449f = m();
        this.f5459c.f5450g = m();
        int iD = d();
        c cVar = this.f5459c;
        cVar.f5451h = (iD & 128) != 0;
        cVar.f5452i = 2 << (iD & 7);
        cVar.f5453j = d();
        this.f5459c.f5454k = d();
    }

    public final void l() {
        do {
            f();
            byte[] bArr = this.f5457a;
            if (bArr[0] == 1) {
                this.f5459c.f5456m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f5460d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int m() {
        return this.f5458b.getShort();
    }

    public final void n() {
        this.f5458b = null;
        Arrays.fill(this.f5457a, (byte) 0);
        this.f5459c = new c();
        this.f5460d = 0;
    }

    public d o(byte[] bArr) {
        n();
        if (bArr != null) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f5458b = byteBufferWrap;
            byteBufferWrap.rewind();
            this.f5458b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f5458b = null;
            this.f5459c.f5445b = 2;
        }
        return this;
    }

    public final void p() {
        int iD;
        do {
            iD = d();
            ByteBuffer byteBuffer = this.f5458b;
            byteBuffer.position(byteBuffer.position() + iD);
        } while (iD > 0);
    }

    public final void q() {
        d();
        p();
    }
}
