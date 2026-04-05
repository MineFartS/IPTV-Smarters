package c.i.a.g.c;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f18125c;

    public int a() {
        return this.f18124b;
    }

    public View.OnClickListener b() {
        return this.f18125c;
    }

    public String c() {
        return this.f18123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18124b == aVar.f18124b && this.f18123a.equals(aVar.f18123a);
    }

    public int hashCode() {
        return (this.f18123a.hashCode() * 31) + this.f18124b;
    }
}
