package c.f.a.c.d.v;

import c.f.a.c.f.o.a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g<f0> f12167a = new a.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g<n0> f12168b = new a.g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.g<?> f12169c = new a.g<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.g<?> f12170d = new a.g<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.g<Object> f12171e = new a.g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.g<Object> f12172f = new a.g<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f12173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f12174h;

    static {
        Charset charsetForName;
        try {
            charsetForName = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f12173g = charsetForName;
        f12174h = a.k("com.google.cast.multizone");
    }
}
