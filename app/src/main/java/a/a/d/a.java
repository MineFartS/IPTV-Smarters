package a.a.d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<b> f2a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f3b;

    public void a(b bVar) {
        if (this.f3b != null) {
            bVar.a(this.f3b);
        }
        this.f2a.add(bVar);
    }

    public void b() {
        this.f3b = null;
    }

    public void c(Context context) {
        this.f3b = context;
        Iterator<b> it = this.f2a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    public Context d() {
        return this.f3b;
    }

    public void e(b bVar) {
        this.f2a.remove(bVar);
    }
}
