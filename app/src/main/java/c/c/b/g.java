package c.c.b;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5213b;

    public g(String str, String str2) {
        this.f5212a = str;
        this.f5213b = str2;
    }

    public final String a() {
        return this.f5212a;
    }

    public final String b() {
        return this.f5213b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f5212a, gVar.f5212a) && TextUtils.equals(this.f5213b, gVar.f5213b);
    }

    public int hashCode() {
        return (this.f5212a.hashCode() * 31) + this.f5213b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f5212a + ",value=" + this.f5213b + "]";
    }
}
