package c.h.a.g.c;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<T> f16781d = new ArrayList();

    public void a(T t) {
        this.f16781d.add(t);
    }

    public List<T> b() {
        return this.f16781d;
    }

    public String c() {
        return this.f16779b;
    }

    public String d() {
        return this.f16780c;
    }

    public void e(String str) {
        this.f16778a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f16780c.equals(((c) obj).f16780c);
        }
        return false;
    }

    public void f(String str) {
        this.f16779b = str;
    }

    public void g(String str) {
        this.f16780c = str;
    }

    public int hashCode() {
        return this.f16780c.hashCode();
    }
}
