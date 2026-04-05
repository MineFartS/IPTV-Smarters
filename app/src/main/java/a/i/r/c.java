package a.i.r;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipData f1981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f1984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f1985e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f1986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f1989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f1990e;

        public a(ClipData clipData, int i2) {
            this.f1986a = clipData;
            this.f1987b = i2;
        }

        public c a() {
            return new c(this);
        }

        public a b(Bundle bundle) {
            this.f1990e = bundle;
            return this;
        }

        public a c(int i2) {
            this.f1988c = i2;
            return this;
        }

        public a d(Uri uri) {
            this.f1989d = uri;
            return this;
        }
    }

    public c(a aVar) {
        this.f1981a = (ClipData) a.i.q.i.e(aVar.f1986a);
        this.f1982b = a.i.q.i.b(aVar.f1987b, 0, 3, "source");
        this.f1983c = a.i.q.i.d(aVar.f1988c, 1);
        this.f1984d = aVar.f1989d;
        this.f1985e = aVar.f1990e;
    }

    public static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    public static String e(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public ClipData b() {
        return this.f1981a;
    }

    public int c() {
        return this.f1983c;
    }

    public int d() {
        return this.f1982b;
    }

    public String toString() {
        return "ContentInfoCompat{clip=" + this.f1981a + ", source=" + e(this.f1982b) + ", flags=" + a(this.f1983c) + ", linkUri=" + this.f1984d + ", extras=" + this.f1985e + "}";
    }
}
