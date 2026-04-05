package c.d.a.l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5418a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f5419b = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5420c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f5422e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public short[] f5424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f5425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f5426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f5427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f5428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f5430m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0100a f5432o;
    public Bitmap p;
    public boolean q;
    public int r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f5421d = new int[256];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5423f = new byte[256];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f5431n = new c();

    /* JADX INFO: renamed from: c.d.a.l.a$a, reason: collision with other inner class name */
    public interface InterfaceC0100a {
        Bitmap a(int i2, int i3, Bitmap.Config config);

        void b(Bitmap bitmap);
    }

    public a(InterfaceC0100a interfaceC0100a) {
        this.f5432o = interfaceC0100a;
    }

    @TargetApi(12)
    public static void m(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }

    public void a() {
        this.f5429l = (this.f5429l + 1) % this.f5431n.f5446c;
    }

    public void b() {
        this.f5431n = null;
        this.f5430m = null;
        this.f5427j = null;
        this.f5428k = null;
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            this.f5432o.b(bitmap);
        }
        this.p = null;
        this.f5422e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[PHI: r3
  0x012b: PHI (r3v11 int) = (r3v7 int), (r3v13 int) binds: [B:52:0x0113, B:54:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v29, types: [short] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(c.d.a.l.b r27) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.l.a.c(c.d.a.l.b):void");
    }

    public int d() {
        return this.f5429l;
    }

    public int e(int i2) {
        if (i2 >= 0) {
            c cVar = this.f5431n;
            if (i2 < cVar.f5446c) {
                return cVar.f5448e.get(i2).f5441i;
            }
        }
        return -1;
    }

    public int f() {
        return this.f5431n.f5446c;
    }

    public final Bitmap g() {
        InterfaceC0100a interfaceC0100a = this.f5432o;
        c cVar = this.f5431n;
        int i2 = cVar.f5449f;
        int i3 = cVar.f5450g;
        Bitmap.Config config = f5419b;
        Bitmap bitmapA = interfaceC0100a.a(i2, i3, config);
        if (bitmapA == null) {
            c cVar2 = this.f5431n;
            bitmapA = Bitmap.createBitmap(cVar2.f5449f, cVar2.f5450g, config);
        }
        m(bitmapA);
        return bitmapA;
    }

    public int h() {
        int i2;
        if (this.f5431n.f5446c <= 0 || (i2 = this.f5429l) < 0) {
            return -1;
        }
        return e(i2);
    }

    public synchronized Bitmap i() {
        if (this.f5431n.f5446c <= 0 || this.f5429l < 0) {
            String str = f5418a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "unable to decode frame, frameCount=" + this.f5431n.f5446c + " framePointer=" + this.f5429l);
            }
            this.r = 1;
        }
        int i2 = this.r;
        if (i2 != 1 && i2 != 2) {
            this.r = 0;
            b bVar = this.f5431n.f5448e.get(this.f5429l);
            int i3 = this.f5429l - 1;
            b bVar2 = i3 >= 0 ? this.f5431n.f5448e.get(i3) : null;
            int[] iArr = bVar.f5443k;
            if (iArr == null) {
                iArr = this.f5431n.f5444a;
            }
            this.f5420c = iArr;
            if (iArr == null) {
                String str2 = f5418a;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No Valid Color Table");
                }
                this.r = 1;
                return null;
            }
            if (bVar.f5438f) {
                System.arraycopy(iArr, 0, this.f5421d, 0, iArr.length);
                int[] iArr2 = this.f5421d;
                this.f5420c = iArr2;
                iArr2[bVar.f5440h] = 0;
            }
            return o(bVar, bVar2);
        }
        String str3 = f5418a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.r);
        }
        return null;
    }

    public int j() {
        int i2 = this.f5431n.f5456m;
        if (i2 == -1) {
            return 1;
        }
        if (i2 == 0) {
            return 0;
        }
        return i2 + 1;
    }

    public final int k() {
        try {
            return this.f5422e.get() & 255;
        } catch (Exception unused) {
            this.r = 1;
            return 0;
        }
    }

    public final int l() {
        int iK = k();
        int i2 = 0;
        if (iK > 0) {
            while (i2 < iK) {
                int i3 = iK - i2;
                try {
                    this.f5422e.get(this.f5423f, i2, i3);
                    i2 += i3;
                } catch (Exception e2) {
                    Log.w(f5418a, "Error Reading Block", e2);
                    this.r = 1;
                }
            }
        }
        return i2;
    }

    public void n(c cVar, byte[] bArr) {
        this.f5431n = cVar;
        this.f5430m = bArr;
        this.r = 0;
        this.f5429l = -1;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f5422e = byteBufferWrap;
        byteBufferWrap.rewind();
        this.f5422e.order(ByteOrder.LITTLE_ENDIAN);
        this.q = false;
        Iterator<b> it = cVar.f5448e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f5439g == 3) {
                this.q = true;
                break;
            }
        }
        int i2 = cVar.f5449f;
        int i3 = cVar.f5450g;
        this.f5427j = new byte[i2 * i3];
        this.f5428k = new int[i2 * i3];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap o(c.d.a.l.b r17, c.d.a.l.b r18) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.l.a.o(c.d.a.l.b, c.d.a.l.b):android.graphics.Bitmap");
    }
}
