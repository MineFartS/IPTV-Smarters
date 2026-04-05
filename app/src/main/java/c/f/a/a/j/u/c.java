package c.f.a.a.j.u;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6213d;

    public c(Context context, c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f6210a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f6211b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f6212c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f6213d = str;
    }

    @Override // c.f.a.a.j.u.h
    public Context b() {
        return this.f6210a;
    }

    @Override // c.f.a.a.j.u.h
    public String c() {
        return this.f6213d;
    }

    @Override // c.f.a.a.j.u.h
    public c.f.a.a.j.a0.a d() {
        return this.f6212c;
    }

    @Override // c.f.a.a.j.u.h
    public c.f.a.a.j.a0.a e() {
        return this.f6211b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6210a.equals(hVar.b()) && this.f6211b.equals(hVar.e()) && this.f6212c.equals(hVar.d()) && this.f6213d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f6210a.hashCode() ^ 1000003) * 1000003) ^ this.f6211b.hashCode()) * 1000003) ^ this.f6212c.hashCode()) * 1000003) ^ this.f6213d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f6210a + ", wallClock=" + this.f6211b + ", monotonicClock=" + this.f6212c + ", backendName=" + this.f6213d + "}";
    }
}
