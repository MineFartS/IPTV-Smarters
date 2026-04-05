package c.i.a.f.h;

import android.view.View;
import android.view.ViewGroup;
import c.i.a.f.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18097a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<e> f18098b = new HashSet();

    public boolean a(e eVar) {
        return this.f18098b.add(eVar);
    }

    public void b(View view) {
        if (this.f18097a) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
        this.f18097a = true;
        Iterator<e> it = this.f18098b.iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    public void c(View view) {
        if (this.f18097a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
            this.f18097a = false;
            Iterator<e> it = this.f18098b.iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public void d(View view) {
        if (this.f18097a) {
            c(view);
        } else {
            b(view);
        }
    }
}
