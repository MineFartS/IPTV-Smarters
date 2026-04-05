package c.d.a.n.j;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f5666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f5667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URL f5670e;

    public d(String str) {
        this(str, e.f5672b);
    }

    public d(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f5668c = str;
        this.f5666a = null;
        this.f5667b = eVar;
    }

    public d(URL url) {
        this(url, e.f5672b);
    }

    public d(URL url, e eVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f5666a = url;
        this.f5668c = null;
        this.f5667b = eVar;
    }

    public String a() {
        String str = this.f5668c;
        return str != null ? str : this.f5666a.toString();
    }

    public Map<String, String> b() {
        return this.f5667b.getHeaders();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f5669d)) {
            String string = this.f5668c;
            if (TextUtils.isEmpty(string)) {
                string = this.f5666a.toString();
            }
            this.f5669d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f5669d;
    }

    public final URL d() {
        if (this.f5670e == null) {
            this.f5670e = new URL(c());
        }
        return this.f5670e;
    }

    public URL e() {
        return d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && this.f5667b.equals(dVar.f5667b);
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f5667b.hashCode();
    }

    public String toString() {
        return a() + '\n' + this.f5667b.toString();
    }
}
