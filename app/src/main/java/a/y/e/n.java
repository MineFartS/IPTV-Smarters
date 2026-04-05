package a.y.e;

import a.i.r.x;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class n extends a.i.r.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f3964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f3965e;

    public static class a extends a.i.r.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n f3966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<View, a.i.r.a> f3967e = new WeakHashMap();

        public a(n nVar) {
            this.f3966d = nVar;
        }

        @Override // a.i.r.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a.i.r.a aVar = this.f3967e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a.i.r.a
        public a.i.r.g0.d b(View view) {
            a.i.r.a aVar = this.f3967e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // a.i.r.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a.i.r.a aVar = this.f3967e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            if (!this.f3966d.o() && this.f3966d.f3964d.getLayoutManager() != null) {
                this.f3966d.f3964d.getLayoutManager().R0(view, cVar);
                a.i.r.a aVar = this.f3967e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // a.i.r.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            a.i.r.a aVar = this.f3967e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // a.i.r.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a.i.r.a aVar = this.f3967e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // a.i.r.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (this.f3966d.o() || this.f3966d.f3964d.getLayoutManager() == null) {
                return super.j(view, i2, bundle);
            }
            a.i.r.a aVar = this.f3967e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i2, bundle)) {
                    return true;
                }
            } else if (super.j(view, i2, bundle)) {
                return true;
            }
            return this.f3966d.f3964d.getLayoutManager().l1(view, i2, bundle);
        }

        @Override // a.i.r.a
        public void l(View view, int i2) {
            a.i.r.a aVar = this.f3967e.get(view);
            if (aVar != null) {
                aVar.l(view, i2);
            } else {
                super.l(view, i2);
            }
        }

        @Override // a.i.r.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            a.i.r.a aVar = this.f3967e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public a.i.r.a n(View view) {
            return this.f3967e.remove(view);
        }

        public void o(View view) {
            a.i.r.a aVarL = x.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f3967e.put(view, aVarL);
        }
    }

    public n(RecyclerView recyclerView) {
        this.f3964d = recyclerView;
        a.i.r.a aVarN = n();
        this.f3965e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // a.i.r.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N0(accessibilityEvent);
        }
    }

    @Override // a.i.r.a
    public void g(View view, a.i.r.g0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f3964d.getLayoutManager() == null) {
            return;
        }
        this.f3964d.getLayoutManager().P0(cVar);
    }

    @Override // a.i.r.a
    public boolean j(View view, int i2, Bundle bundle) {
        if (super.j(view, i2, bundle)) {
            return true;
        }
        if (o() || this.f3964d.getLayoutManager() == null) {
            return false;
        }
        return this.f3964d.getLayoutManager().j1(i2, bundle);
    }

    public a.i.r.a n() {
        return this.f3965e;
    }

    public boolean o() {
        return this.f3964d.q0();
    }
}
