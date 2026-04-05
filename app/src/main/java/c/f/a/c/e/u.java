package c.f.a.c.e;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.o.j<T> f12286b = new c.f.a.c.o.j<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f12288d;

    public u(int i2, int i3, Bundle bundle) {
        this.f12285a = i2;
        this.f12287c = i3;
        this.f12288d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void b(t tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(tVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f12286b.b(tVar);
    }

    public final void c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f12286b.c(t);
    }

    public abstract boolean d();

    public String toString() {
        int i2 = this.f12287c;
        int i3 = this.f12285a;
        boolean zD = d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(zD);
        sb.append("}");
        return sb.toString();
    }
}
