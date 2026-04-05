package c.f.a.c.f.o;

import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends UnsupportedOperationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.f.d f12362b;

    public m(@RecentlyNonNull c.f.a.c.f.d dVar) {
        this.f12362b = dVar;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public String getMessage() {
        String strValueOf = String.valueOf(this.f12362b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
