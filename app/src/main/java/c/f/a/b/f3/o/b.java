package c.f.a.b.f3.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c.f.a.b.f3.c;
import c.f.a.b.j3.h0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8164a = {0, 7, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8165b = {0, 119, -120, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f8166c = {0, DateTimeFieldType.HOUR_OF_DAY, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f8167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f8168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Canvas f8169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0132b f8170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f8171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f8172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f8173j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f8177d;

        public a(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8174a = i2;
            this.f8175b = iArr;
            this.f8176c = iArr2;
            this.f8177d = iArr3;
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.f3.o.b$b, reason: collision with other inner class name */
    public static final class C0132b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8183f;

        public C0132b(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f8178a = i2;
            this.f8179b = i3;
            this.f8180c = i4;
            this.f8181d = i5;
            this.f8182e = i6;
            this.f8183f = i7;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f8186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f8187d;

        public c(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.f8184a = i2;
            this.f8185b = z;
            this.f8186c = bArr;
            this.f8187d = bArr2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f8191d;

        public d(int i2, int i3, int i4, SparseArray<e> sparseArray) {
            this.f8188a = i2;
            this.f8189b = i3;
            this.f8190c = i4;
            this.f8191d = sparseArray;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8193b;

        public e(int i2, int i3) {
            this.f8192a = i2;
            this.f8193b = i3;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8201h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8202i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f8203j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f8204k;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.f8194a = i2;
            this.f8195b = z;
            this.f8196c = i3;
            this.f8197d = i4;
            this.f8198e = i5;
            this.f8199f = i6;
            this.f8200g = i7;
            this.f8201h = i8;
            this.f8202i = i9;
            this.f8203j = i10;
            this.f8204k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f8204k;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.f8204k.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8210f;

        public g(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f8205a = i2;
            this.f8206b = i3;
            this.f8207c = i4;
            this.f8208d = i5;
            this.f8209e = i6;
            this.f8210f = i7;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f8213c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f8214d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f8215e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f8216f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f8217g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0132b f8218h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f8219i;

        public h(int i2, int i3) {
            this.f8211a = i2;
            this.f8212b = i3;
        }

        public void a() {
            this.f8213c.clear();
            this.f8214d.clear();
            this.f8215e.clear();
            this.f8216f.clear();
            this.f8217g.clear();
            this.f8218h = null;
            this.f8219i = null;
        }
    }

    public b(int i2, int i3) {
        Paint paint = new Paint();
        this.f8167d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f8168e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8169f = new Canvas();
        this.f8170g = new C0132b(719, 575, 0, 719, 0, 575);
        this.f8171h = new a(0, c(), d(), e());
        this.f8172i = new h(i2, i3);
    }

    public static byte[] a(int i2, int i3, h0 h0Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) h0Var.h(i3);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, DefaultRenderer.BACKGROUND_COLOR, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[LOOP:0: B:3:0x0009->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(c.f.a.b.j3.h0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L59
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L20:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L59
        L28:
            boolean r4 = r13.g()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L56
            if (r4 == r5) goto L52
            if (r4 == r3) goto L4a
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L59
        L41:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L20
        L4a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L20
        L52:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L59
        L56:
            r4 = 0
            r11 = 1
            goto L3f
        L59:
            if (r12 == 0) goto L77
            if (r8 == 0) goto L77
            if (r15 == 0) goto L61
            r4 = r15[r4]
        L61:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L77:
            int r10 = r10 + r12
            if (r11 == 0) goto L7b
            return r10
        L7b:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.o.b.g(c.f.a.b.j3.h0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:3:0x0009->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(c.f.a.b.j3.h0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L13:
            r12 = 1
            goto L65
        L15:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L2b
            int r3 = r13.h(r7)
            if (r3 == 0) goto L28
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L65
        L28:
            r4 = 0
            r11 = 1
            goto L4c
        L2b:
            boolean r4 = r13.g()
            if (r4 != 0) goto L3e
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L37:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L65
        L3e:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L62
            if (r4 == r6) goto L5e
            if (r4 == r5) goto L57
            if (r4 == r7) goto L4e
            r11 = r2
            r4 = 0
        L4c:
            r12 = 0
            goto L65
        L4e:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L37
        L57:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L37
        L5e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L65
        L62:
            r11 = r2
            r4 = 0
            goto L13
        L65:
            if (r12 == 0) goto L81
            if (r8 == 0) goto L81
            if (r15 == 0) goto L6d
            r4 = r15[r4]
        L6d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L81:
            int r10 = r10 + r12
            if (r11 == 0) goto L85
            return r10
        L85:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.o.b.h(c.f.a.b.j3.h0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int i(h0 h0Var, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int iH;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            int iH2 = h0Var.h(8);
            if (iH2 != 0) {
                z = z2;
                iH = 1;
            } else if (h0Var.g()) {
                z = z2;
                iH = h0Var.h(7);
                iH2 = h0Var.h(8);
            } else {
                int iH3 = h0Var.h(7);
                if (iH3 != 0) {
                    z = z2;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    iH2 = 0;
                    z = true;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i4, i3, i4 + iH, i3 + 1, paint);
            }
            i4 += iH;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        h0 h0Var = new h0(bArr);
        int iG = i3;
        int i5 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (h0Var.b() != 0) {
            int iH = h0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrA == null ? f8165b : bArrA;
                        } else if (i2 != 2) {
                            bArr2 = null;
                            iG = g(h0Var, iArr, bArr2, iG, i5, paint, canvas);
                        } else {
                            bArr3 = bArrA3 == null ? f8164a : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(h0Var, iArr, bArr2, iG, i5, paint, canvas);
                        break;
                    case 17:
                        iG = h(h0Var, iArr, i2 == 3 ? bArrA2 == null ? f8166c : bArrA2 : null, iG, i5, paint, canvas);
                        break;
                    case 18:
                        iG = i(h0Var, iArr, null, iG, i5, paint, canvas);
                        continue;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, h0Var);
                                break;
                            case 33:
                                bArrA = a(4, 8, h0Var);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, h0Var);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                h0Var.c();
            } else {
                i5 += 2;
                iG = i3;
            }
        }
    }

    public static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.f8177d : i2 == 2 ? aVar.f8176c : aVar.f8175b;
        j(cVar.f8186c, iArr, i2, i3, i4, paint, canvas);
        j(cVar.f8187d, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    public static a l(h0 h0Var, int i2) {
        int iH;
        int i3;
        int iH2;
        int iH3;
        int iH4;
        int i4 = 8;
        int iH5 = h0Var.h(8);
        h0Var.r(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i6 > 0) {
            int iH6 = h0Var.h(i4);
            int iH7 = h0Var.h(i4);
            int i7 = i6 - 2;
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = h0Var.h(i4);
                iH4 = h0Var.h(i4);
                iH = h0Var.h(i4);
                iH2 = h0Var.h(i4);
                i3 = i7 - 4;
            } else {
                int iH8 = h0Var.h(6) << i5;
                int iH9 = h0Var.h(4) << 4;
                iH = h0Var.h(4) << 4;
                i3 = i7 - 2;
                iH2 = h0Var.h(i5) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH4 = 0;
                iH = 0;
                iH2 = 255;
            }
            double d2 = iH3;
            double d3 = iH4 - 128;
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d4 = iH - 128;
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), x0.r((int) (d2 + (1.402d * d3)), 0, 255), x0.r((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), x0.r((int) (d2 + (d4 * 1.772d)), 0, 255));
            i6 = i3;
            iH5 = iH5;
            i4 = 8;
            i5 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static C0132b m(h0 h0Var) {
        int i2;
        int iH;
        int i3;
        int i4;
        h0Var.r(4);
        boolean zG = h0Var.g();
        h0Var.r(3);
        int iH2 = h0Var.h(16);
        int iH3 = h0Var.h(16);
        if (zG) {
            int iH4 = h0Var.h(16);
            int iH5 = h0Var.h(16);
            int iH6 = h0Var.h(16);
            iH = h0Var.h(16);
            i2 = iH5;
            i4 = iH6;
            i3 = iH4;
        } else {
            i2 = iH2;
            iH = iH3;
            i3 = 0;
            i4 = 0;
        }
        return new C0132b(iH2, iH3, i3, i2, i4, iH);
    }

    public static c n(h0 h0Var) {
        byte[] bArr;
        int iH = h0Var.h(16);
        h0Var.r(4);
        int iH2 = h0Var.h(2);
        boolean zG = h0Var.g();
        h0Var.r(1);
        byte[] bArr2 = x0.f9301f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = h0Var.h(16);
                int iH4 = h0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    h0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    h0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        h0Var.r(h0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(h0 h0Var, int i2) {
        int iH = h0Var.h(8);
        int iH2 = h0Var.h(4);
        int iH3 = h0Var.h(2);
        h0Var.r(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iH4 = h0Var.h(8);
            h0Var.r(8);
            i3 -= 6;
            sparseArray.put(iH4, new e(h0Var.h(16), h0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(h0 h0Var, int i2) {
        int iH;
        int iH2;
        int iH3 = h0Var.h(8);
        h0Var.r(4);
        boolean zG = h0Var.g();
        h0Var.r(3);
        int i3 = 16;
        int iH4 = h0Var.h(16);
        int iH5 = h0Var.h(16);
        int iH6 = h0Var.h(3);
        int iH7 = h0Var.h(3);
        int i4 = 2;
        h0Var.r(2);
        int iH8 = h0Var.h(8);
        int iH9 = h0Var.h(8);
        int iH10 = h0Var.h(4);
        int iH11 = h0Var.h(2);
        h0Var.r(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int iH12 = h0Var.h(i3);
            int iH13 = h0Var.h(i4);
            int iH14 = h0Var.h(i4);
            int iH15 = h0Var.h(12);
            int i6 = iH11;
            h0Var.r(4);
            int iH16 = h0Var.h(12);
            i5 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i5 -= 2;
                iH = h0Var.h(8);
                iH2 = h0Var.h(8);
            } else {
                iH = 0;
                iH2 = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH, iH2));
            iH11 = i6;
            i4 = 2;
            i3 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    public static void q(h0 h0Var, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i2;
        Object obj;
        c cVar;
        int iH = h0Var.h(8);
        int iH2 = h0Var.h(16);
        int iH3 = h0Var.h(16);
        int iD = h0Var.d() + iH3;
        if (iH3 * 8 > h0Var.b()) {
            z.i("DvbParser", "Data field length exceeds limit");
            h0Var.r(h0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f8211a) {
                    d dVar = hVar.f8219i;
                    d dVarO = o(h0Var, iH3);
                    if (dVarO.f8190c != 0) {
                        hVar.f8219i = dVarO;
                        hVar.f8213c.clear();
                        hVar.f8214d.clear();
                        hVar.f8215e.clear();
                    } else if (dVar != null && dVar.f8189b != dVarO.f8189b) {
                        hVar.f8219i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f8219i;
                if (iH2 == hVar.f8211a && dVar2 != null) {
                    f fVarP = p(h0Var, iH3);
                    if (dVar2.f8190c == 0 && (fVar = hVar.f8213c.get(fVarP.f8194a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f8213c.put(fVarP.f8194a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f8211a) {
                    a aVarL = l(h0Var, iH3);
                    sparseArray = hVar.f8214d;
                    aVar = aVarL;
                } else if (iH2 == hVar.f8212b) {
                    a aVarL2 = l(h0Var, iH3);
                    sparseArray = hVar.f8216f;
                    aVar = aVarL2;
                }
                i2 = aVar.f8174a;
                obj = aVar;
                sparseArray.put(i2, obj);
                break;
            case 19:
                if (iH2 == hVar.f8211a) {
                    c cVarN = n(h0Var);
                    sparseArray = hVar.f8215e;
                    cVar = cVarN;
                } else if (iH2 == hVar.f8212b) {
                    c cVarN2 = n(h0Var);
                    sparseArray = hVar.f8217g;
                    cVar = cVarN2;
                }
                i2 = cVar.f8184a;
                obj = cVar;
                sparseArray.put(i2, obj);
                break;
            case 20:
                if (iH2 == hVar.f8211a) {
                    hVar.f8218h = m(h0Var);
                }
                break;
        }
        h0Var.s(iD - h0Var.d());
    }

    public List<c.f.a.b.f3.c> b(byte[] bArr, int i2) {
        int i3;
        SparseArray<g> sparseArray;
        h0 h0Var = new h0(bArr, i2);
        while (h0Var.b() >= 48 && h0Var.h(8) == 15) {
            q(h0Var, this.f8172i);
        }
        h hVar = this.f8172i;
        d dVar = hVar.f8219i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0132b c0132b = hVar.f8218h;
        if (c0132b == null) {
            c0132b = this.f8170g;
        }
        Bitmap bitmap = this.f8173j;
        if (bitmap == null || c0132b.f8178a + 1 != bitmap.getWidth() || c0132b.f8179b + 1 != this.f8173j.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0132b.f8178a + 1, c0132b.f8179b + 1, Bitmap.Config.ARGB_8888);
            this.f8173j = bitmapCreateBitmap;
            this.f8169f.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f8191d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f8169f.save();
            e eVarValueAt = sparseArray2.valueAt(i4);
            f fVar = this.f8172i.f8213c.get(sparseArray2.keyAt(i4));
            int i5 = eVarValueAt.f8192a + c0132b.f8180c;
            int i6 = eVarValueAt.f8193b + c0132b.f8182e;
            this.f8169f.clipRect(i5, i6, Math.min(fVar.f8196c + i5, c0132b.f8181d), Math.min(fVar.f8197d + i6, c0132b.f8183f));
            a aVar = this.f8172i.f8214d.get(fVar.f8200g);
            if (aVar == null && (aVar = this.f8172i.f8216f.get(fVar.f8200g)) == null) {
                aVar = this.f8171h;
            }
            SparseArray<g> sparseArray3 = fVar.f8204k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i7);
                g gVarValueAt = sparseArray3.valueAt(i7);
                c cVar = this.f8172i.f8215e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f8172i.f8217g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f8199f, gVarValueAt.f8207c + i5, i6 + gVarValueAt.f8208d, cVar2.f8185b ? null : this.f8167d, this.f8169f);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f8195b) {
                int i8 = fVar.f8199f;
                this.f8168e.setColor(i8 == 3 ? aVar.f8177d[fVar.f8201h] : i8 == 2 ? aVar.f8176c[fVar.f8202i] : aVar.f8175b[fVar.f8203j]);
                this.f8169f.drawRect(i5, i6, fVar.f8196c + i5, fVar.f8197d + i6, this.f8168e);
            }
            arrayList.add(new c.b().f(Bitmap.createBitmap(this.f8173j, i5, i6, fVar.f8196c, fVar.f8197d)).k(i5 / c0132b.f8178a).l(0).h(i6 / c0132b.f8179b, 0).i(0).n(fVar.f8196c / c0132b.f8178a).g(fVar.f8197d / c0132b.f8179b).a());
            this.f8169f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f8169f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f8172i.a();
    }
}
