package a.i.o;

import a.i.q.i;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f1895b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.f1894a = i2;
            this.f1895b = bVarArr;
        }

        public static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] b() {
            return this.f1895b;
        }

        public int c() {
            return this.f1894a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f1896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f1899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1900e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            this.f1896a = (Uri) i.e(uri);
            this.f1897b = i2;
            this.f1898c = i3;
            this.f1899d = z;
            this.f1900e = i4;
        }

        public static b a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        public int b() {
            return this.f1900e;
        }

        public int c() {
            return this.f1897b;
        }

        public Uri d() {
            return this.f1896a;
        }

        public int e() {
            return this.f1898c;
        }

        public boolean f() {
            return this.f1899d;
        }
    }

    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i2, boolean z, int i3, Handler handler, c cVar) {
        a.i.o.a aVar = new a.i.o.a(cVar, handler);
        return z ? e.e(context, dVar, aVar, i2, i3) : e.d(context, dVar, i2, null, aVar);
    }
}
