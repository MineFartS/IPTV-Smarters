package a.n.q;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2751a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2752b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.f.g<String, SparseArray<Parcelable>> f2753c;

    public static String e(int i2) {
        return Integer.toString(i2);
    }

    public void a() {
        a.f.g<String, SparseArray<Parcelable>> gVar;
        int i2 = this.f2751a;
        if (i2 == 2) {
            if (this.f2752b <= 0) {
                throw new IllegalArgumentException();
            }
            a.f.g<String, SparseArray<Parcelable>> gVar2 = this.f2753c;
            if (gVar2 != null && gVar2.e() == this.f2752b) {
                return;
            } else {
                gVar = new a.f.g<>(this.f2752b);
            }
        } else if (i2 == 3 || i2 == 1) {
            a.f.g<String, SparseArray<Parcelable>> gVar3 = this.f2753c;
            if (gVar3 != null && gVar3.e() == Integer.MAX_VALUE) {
                return;
            } else {
                gVar = new a.f.g<>(Integer.MAX_VALUE);
            }
        } else {
            gVar = null;
        }
        this.f2753c = gVar;
    }

    public void b() {
        a.f.g<String, SparseArray<Parcelable>> gVar = this.f2753c;
        if (gVar != null) {
            gVar.c();
        }
    }

    public final int c() {
        return this.f2752b;
    }

    public final int d() {
        return this.f2751a;
    }

    public final void f(Bundle bundle) {
        a.f.g<String, SparseArray<Parcelable>> gVar = this.f2753c;
        if (gVar == null || bundle == null) {
            return;
        }
        gVar.c();
        for (String str : bundle.keySet()) {
            this.f2753c.f(str, bundle.getSparseParcelableArray(str));
        }
    }

    public final void g(View view, int i2) {
        if (this.f2753c != null) {
            SparseArray<Parcelable> sparseArrayG = this.f2753c.g(e(i2));
            if (sparseArrayG != null) {
                view.restoreHierarchyState(sparseArrayG);
            }
        }
    }

    public void h(int i2) {
        a.f.g<String, SparseArray<Parcelable>> gVar = this.f2753c;
        if (gVar == null || gVar.i() == 0) {
            return;
        }
        this.f2753c.g(e(i2));
    }

    public final Bundle i() {
        a.f.g<String, SparseArray<Parcelable>> gVar = this.f2753c;
        if (gVar == null || gVar.i() == 0) {
            return null;
        }
        Map<String, SparseArray<Parcelable>> mapK = this.f2753c.k();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SparseArray<Parcelable>> entry : mapK.entrySet()) {
            bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public final void j(View view, int i2) {
        int i3 = this.f2751a;
        if (i3 == 1) {
            h(i2);
        } else if (i3 == 2 || i3 == 3) {
            l(view, i2);
        }
    }

    public final Bundle k(Bundle bundle, View view, int i2) {
        if (this.f2751a != 0) {
            String strE = e(i2);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(strE, sparseArray);
        }
        return bundle;
    }

    public final void l(View view, int i2) {
        if (this.f2753c != null) {
            String strE = e(i2);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f2753c.f(strE, sparseArray);
        }
    }

    public final void m(int i2) {
        this.f2752b = i2;
        a();
    }

    public final void n(int i2) {
        this.f2751a = i2;
        a();
    }
}
