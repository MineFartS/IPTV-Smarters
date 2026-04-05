package a.v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Class<?>> f3574b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f3576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f3579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<h> f3580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.f.j<c> f3581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap<String, d> f3582j;

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f3583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f3584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f3585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f3586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f3587f;

        public a(k kVar, Bundle bundle, boolean z, boolean z2, int i2) {
            this.f3583b = kVar;
            this.f3584c = bundle;
            this.f3585d = z;
            this.f3586e = z2;
            this.f3587f = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z = this.f3585d;
            if (z && !aVar.f3585d) {
                return 1;
            }
            if (!z && aVar.f3585d) {
                return -1;
            }
            Bundle bundle = this.f3584c;
            if (bundle != null && aVar.f3584c == null) {
                return 1;
            }
            if (bundle == null && aVar.f3584c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f3584c.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f3586e;
            if (z2 && !aVar.f3586e) {
                return 1;
            }
            if (z2 || !aVar.f3586e) {
                return this.f3587f - aVar.f3587f;
            }
            return -1;
        }

        public k d() {
            return this.f3583b;
        }

        public Bundle g() {
            return this.f3584c;
        }
    }

    public k(s<? extends k> sVar) {
        this(t.c(sVar.getClass()));
    }

    public k(String str) {
        this.f3575c = str;
    }

    public static String t(Context context, int i2) {
        if (i2 <= 16777215) {
            return Integer.toString(i2);
        }
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i2);
        }
    }

    public final String B() {
        return this.f3575c;
    }

    public final l C() {
        return this.f3576d;
    }

    public a D(j jVar) {
        ArrayList<h> arrayList = this.f3580h;
        if (arrayList == null) {
            return null;
        }
        a aVar = null;
        for (h hVar : arrayList) {
            Uri uriC = jVar.c();
            Bundle bundleC = uriC != null ? hVar.c(uriC, i()) : null;
            String strA = jVar.a();
            boolean z = strA != null && strA.equals(hVar.b());
            String strB = jVar.b();
            int iD = strB != null ? hVar.d(strB) : -1;
            if (bundleC != null || z || iD > -1) {
                a aVar2 = new a(this, bundleC, hVar.e(), z, iD);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void F(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, a.v.w.a.A);
        J(typedArrayObtainAttributes.getResourceId(a.v.w.a.C, 0));
        this.f3578f = t(context, this.f3577e);
        K(typedArrayObtainAttributes.getText(a.v.w.a.B));
        typedArrayObtainAttributes.recycle();
    }

    public final void I(int i2, c cVar) {
        if (M()) {
            if (i2 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f3581i == null) {
                this.f3581i = new a.f.j<>();
            }
            this.f3581i.k(i2, cVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void J(int i2) {
        this.f3577e = i2;
        this.f3578f = null;
    }

    public final void K(CharSequence charSequence) {
        this.f3579g = charSequence;
    }

    public final void L(l lVar) {
        this.f3576d = lVar;
    }

    public boolean M() {
        return true;
    }

    public final void a(String str, d dVar) {
        if (this.f3582j == null) {
            this.f3582j = new HashMap<>();
        }
        this.f3582j.put(str, dVar);
    }

    public final void b(h hVar) {
        if (this.f3580h == null) {
            this.f3580h = new ArrayList<>();
        }
        this.f3580h.add(hVar);
    }

    public Bundle d(Bundle bundle) {
        HashMap<String, d> map;
        if (bundle == null && ((map = this.f3582j) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, d> map2 = this.f3582j;
        if (map2 != null) {
            for (Map.Entry<String, d> entry : map2.entrySet()) {
                entry.getValue().c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, d> map3 = this.f3582j;
            if (map3 != null) {
                for (Map.Entry<String, d> entry2 : map3.entrySet()) {
                    if (!entry2.getValue().d(entry2.getKey(), bundle)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().a().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] f() {
        ArrayDeque arrayDeque = new ArrayDeque();
        k kVar = this;
        while (true) {
            l lVarC = kVar.C();
            if (lVarC == null || lVarC.R() != kVar.v()) {
                arrayDeque.addFirst(kVar);
            }
            if (lVarC == null) {
                break;
            }
            kVar = lVarC;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i2 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((k) it.next()).v();
            i2++;
        }
        return iArr;
    }

    public final c g(int i2) {
        a.f.j<c> jVar = this.f3581i;
        c cVarF = jVar == null ? null : jVar.f(i2);
        if (cVarF != null) {
            return cVarF;
        }
        if (C() != null) {
            return C().g(i2);
        }
        return null;
    }

    public final Map<String, d> i() {
        HashMap<String, d> map = this.f3582j;
        return map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    public String s() {
        if (this.f3578f == null) {
            this.f3578f = Integer.toString(this.f3577e);
        }
        return this.f3578f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String hexString = this.f3578f;
        if (hexString == null) {
            sb.append("0x");
            hexString = Integer.toHexString(this.f3577e);
        }
        sb.append(hexString);
        sb.append(")");
        if (this.f3579g != null) {
            sb.append(" label=");
            sb.append(this.f3579g);
        }
        return sb.toString();
    }

    public final int v() {
        return this.f3577e;
    }

    public final CharSequence x() {
        return this.f3579g;
    }
}
