package c.f.a.c.d.v;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12128e;

    public b(String str) {
        this(str, false);
    }

    public b(String str, boolean z) {
        c.f.a.c.f.q.o.f(str, "The log tag cannot be null or empty.");
        this.f12124a = str;
        this.f12125b = str.length() <= 23;
        this.f12126c = false;
        this.f12127d = false;
    }

    public void a(String str, Object... objArr) {
        if (j()) {
            Log.d(this.f12124a, h(str, objArr));
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        if (j()) {
            Log.d(this.f12124a, h(str, objArr), th);
        }
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f12124a, h(str, objArr));
    }

    public void d(Throwable th, String str, Object... objArr) {
        Log.e(this.f12124a, h(str, objArr), th);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f12124a, h(str, objArr));
    }

    public void f(String str, Object... objArr) {
    }

    public void g(String str, Object... objArr) {
        Log.w(this.f12124a, h(str, objArr));
    }

    public final String h(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f12128e)) {
            return str;
        }
        String strValueOf = String.valueOf(this.f12128e);
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public final void i(String str) {
        this.f12128e = TextUtils.isEmpty(str) ? null : String.format("[%s] ", str);
    }

    public final boolean j() {
        if (this.f12126c) {
            return true;
        }
        return this.f12125b && Log.isLoggable(this.f12124a, 3);
    }
}
