package c.f.a.c.f.o;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.f.a<c.f.a.c.f.o.n.b<?>, c.f.a.c.f.b> f12356b;

    public c(@RecentlyNonNull a.f.a<c.f.a.c.f.o.n.b<?>, c.f.a.c.f.b> aVar) {
        this.f12356b = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (c.f.a.c.f.o.n.b<?> bVar : this.f12356b.keySet()) {
            c.f.a.c.f.b bVar2 = (c.f.a.c.f.b) c.f.a.c.f.q.o.i(this.f12356b.get(bVar));
            z &= !bVar2.M();
            String strB = bVar.b();
            String strValueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 2 + strValueOf.length());
            sb.append(strB);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
