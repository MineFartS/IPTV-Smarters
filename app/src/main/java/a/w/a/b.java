package a.w.a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3717a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a.w.a.c> f3719c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseBooleanArray f3721e = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<a.w.a.c, d> f3720d = new a.f.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f3722f = a();

    public static class a implements c {
        @Override // a.w.a.b.c
        public boolean a(int i2, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX INFO: renamed from: a.w.a.b$b, reason: collision with other inner class name */
    public static final class C0087b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f3723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f3724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a.w.a.c> f3725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<c> f3729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Rect f3730h;

        public C0087b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f3725c = arrayList;
            this.f3726d = 16;
            this.f3727e = 12544;
            this.f3728f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f3729g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f3717a);
            this.f3724b = bitmap;
            this.f3723a = null;
            arrayList.add(a.w.a.c.f3740a);
            arrayList.add(a.w.a.c.f3741b);
            arrayList.add(a.w.a.c.f3742c);
            arrayList.add(a.w.a.c.f3743d);
            arrayList.add(a.w.a.c.f3744e);
            arrayList.add(a.w.a.c.f3745f);
        }

        public b a() {
            List<d> listD;
            c[] cVarArr;
            Bitmap bitmap = this.f3724b;
            if (bitmap != null) {
                Bitmap bitmapD = d(bitmap);
                Rect rect = this.f3730h;
                if (bitmapD != this.f3724b && rect != null) {
                    double width = bitmapD.getWidth();
                    double width2 = this.f3724b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d2 = width / width2;
                    double d3 = rect.left;
                    Double.isNaN(d3);
                    rect.left = (int) Math.floor(d3 * d2);
                    double d4 = rect.top;
                    Double.isNaN(d4);
                    rect.top = (int) Math.floor(d4 * d2);
                    double d5 = rect.right;
                    Double.isNaN(d5);
                    rect.right = Math.min((int) Math.ceil(d5 * d2), bitmapD.getWidth());
                    double d6 = rect.bottom;
                    Double.isNaN(d6);
                    rect.bottom = Math.min((int) Math.ceil(d6 * d2), bitmapD.getHeight());
                }
                int[] iArrB = b(bitmapD);
                int i2 = this.f3726d;
                if (this.f3729g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.f3729g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                a.w.a.a aVar = new a.w.a.a(iArrB, i2, cVarArr);
                if (bitmapD != this.f3724b) {
                    bitmapD.recycle();
                }
                listD = aVar.d();
            } else {
                listD = this.f3723a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(listD, this.f3725c);
            bVar.b();
            return bVar;
        }

        public final int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f3730h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f3730h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i2 = 0; i2 < iHeight; i2++) {
                Rect rect2 = this.f3730h;
                System.arraycopy(iArr, ((rect2.top + i2) * width) + rect2.left, iArr2, i2 * iWidth, iWidth);
            }
            return iArr2;
        }

        public C0087b c(int i2) {
            this.f3726d = i2;
            return this;
        }

        public final Bitmap d(Bitmap bitmap) {
            int iMax;
            int i2;
            double dSqrt = -1.0d;
            if (this.f3727e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.f3727e;
                if (width > i3) {
                    double d2 = i3;
                    double d3 = width;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    dSqrt = Math.sqrt(d2 / d3);
                }
            } else if (this.f3728f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i2 = this.f3728f)) {
                double d4 = i2;
                double d5 = iMax;
                Double.isNaN(d4);
                Double.isNaN(d5);
                dSqrt = d4 / d5;
            }
            if (dSqrt <= 0.0d) {
                return bitmap;
            }
            double width2 = bitmap.getWidth();
            Double.isNaN(width2);
            int iCeil = (int) Math.ceil(width2 * dSqrt);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, iCeil, (int) Math.ceil(height * dSqrt), false);
        }
    }

    public interface c {
        boolean a(int i2, float[] fArr);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3738h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f3739i;

        public d(int i2, int i3) {
            this.f3731a = Color.red(i2);
            this.f3732b = Color.green(i2);
            this.f3733c = Color.blue(i2);
            this.f3734d = i2;
            this.f3735e = i3;
        }

        public final void a() {
            int iM;
            if (this.f3736f) {
                return;
            }
            int iE = a.i.j.a.e(-1, this.f3734d, 4.5f);
            int iE2 = a.i.j.a.e(-1, this.f3734d, 3.0f);
            if (iE == -1 || iE2 == -1) {
                int iE3 = a.i.j.a.e(DefaultRenderer.BACKGROUND_COLOR, this.f3734d, 4.5f);
                int iE4 = a.i.j.a.e(DefaultRenderer.BACKGROUND_COLOR, this.f3734d, 3.0f);
                if (iE3 == -1 || iE4 == -1) {
                    this.f3738h = iE != -1 ? a.i.j.a.m(-1, iE) : a.i.j.a.m(DefaultRenderer.BACKGROUND_COLOR, iE3);
                    this.f3737g = iE2 != -1 ? a.i.j.a.m(-1, iE2) : a.i.j.a.m(DefaultRenderer.BACKGROUND_COLOR, iE4);
                    this.f3736f = true;
                    return;
                }
                this.f3738h = a.i.j.a.m(DefaultRenderer.BACKGROUND_COLOR, iE3);
                iM = a.i.j.a.m(DefaultRenderer.BACKGROUND_COLOR, iE4);
            } else {
                this.f3738h = a.i.j.a.m(-1, iE);
                iM = a.i.j.a.m(-1, iE2);
            }
            this.f3737g = iM;
            this.f3736f = true;
        }

        public int b() {
            a();
            return this.f3738h;
        }

        public float[] c() {
            if (this.f3739i == null) {
                this.f3739i = new float[3];
            }
            a.i.j.a.a(this.f3731a, this.f3732b, this.f3733c, this.f3739i);
            return this.f3739i;
        }

        public int d() {
            return this.f3735e;
        }

        public int e() {
            return this.f3734d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3735e == dVar.f3735e && this.f3734d == dVar.f3734d;
        }

        public int f() {
            a();
            return this.f3737g;
        }

        public int hashCode() {
            return (this.f3734d * 31) + this.f3735e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f3735e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    public b(List<d> list, List<a.w.a.c> list2) {
        this.f3718b = list;
        this.f3719c = list2;
    }

    public final d a() {
        int size = this.f3718b.size();
        int iD = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.f3718b.get(i2);
            if (dVar2.d() > iD) {
                iD = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public void b() {
        int size = this.f3719c.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.w.a.c cVar = this.f3719c.get(i2);
            cVar.k();
            this.f3720d.put(cVar, d(cVar));
        }
        this.f3721e.clear();
    }

    public final float c(d dVar, a.w.a.c cVar) {
        float[] fArrC = dVar.c();
        d dVar2 = this.f3722f;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(fArrC[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(fArrC[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (dVar.d() / (dVar2 != null ? dVar2.d() : 1)) : 0.0f);
    }

    public final d d(a.w.a.c cVar) {
        d dVarE = e(cVar);
        if (dVarE != null && cVar.j()) {
            this.f3721e.append(dVarE.e(), true);
        }
        return dVarE;
    }

    public final d e(a.w.a.c cVar) {
        int size = this.f3718b.size();
        float f2 = 0.0f;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.f3718b.get(i2);
            if (g(dVar2, cVar)) {
                float fC = c(dVar2, cVar);
                if (dVar == null || fC > f2) {
                    dVar = dVar2;
                    f2 = fC;
                }
            }
        }
        return dVar;
    }

    public List<d> f() {
        return Collections.unmodifiableList(this.f3718b);
    }

    public final boolean g(d dVar, a.w.a.c cVar) {
        float[] fArrC = dVar.c();
        return fArrC[1] >= cVar.e() && fArrC[1] <= cVar.c() && fArrC[2] >= cVar.d() && fArrC[2] <= cVar.b() && !this.f3721e.get(dVar.e());
    }
}
