package a.i.n;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f1857a;

    public g(LocaleList localeList) {
        this.f1857a = localeList;
    }

    @Override // a.i.n.f
    public Object a() {
        return this.f1857a;
    }

    public boolean equals(Object obj) {
        return this.f1857a.equals(((f) obj).a());
    }

    @Override // a.i.n.f
    public Locale get(int i2) {
        return this.f1857a.get(i2);
    }

    public int hashCode() {
        return this.f1857a.hashCode();
    }

    public String toString() {
        return this.f1857a.toString();
    }
}
