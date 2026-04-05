package c.d.a.n.i;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class k implements c.d.a.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.c f5591b;

    public k(String str, c.d.a.n.c cVar) {
        this.f5590a = str;
        this.f5591b = cVar;
    }

    @Override // c.d.a.n.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f5590a.getBytes("UTF-8"));
        this.f5591b.a(messageDigest);
    }

    @Override // c.d.a.n.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5590a.equals(kVar.f5590a) && this.f5591b.equals(kVar.f5591b);
    }

    @Override // c.d.a.n.c
    public int hashCode() {
        return (this.f5590a.hashCode() * 31) + this.f5591b.hashCode();
    }
}
