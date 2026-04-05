package a.v.x;

import a.l.d.n;
import a.l.d.y;
import a.v.k;
import a.v.p;
import a.v.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@s.b("fragment")
public class a extends s<C0084a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f3663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayDeque<Integer> f3665d = new ArrayDeque<>();

    /* JADX INFO: renamed from: a.v.x.a$a, reason: collision with other inner class name */
    public static class C0084a extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f3666k;

        public C0084a(s<? extends C0084a> sVar) {
            super(sVar);
        }

        @Override // a.v.k
        public void F(Context context, AttributeSet attributeSet) {
            super.F(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f3677i);
            String string = typedArrayObtainAttributes.getString(c.f3678j);
            if (string != null) {
                O(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String N() {
            String str = this.f3666k;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final C0084a O(String str) {
            this.f3666k = str;
            return this;
        }

        @Override // a.v.k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f3666k;
            if (str == null) {
                str = Constants.NULL_VERSION_ID;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static final class b implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<View, String> f3667a;

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.f3667a);
        }
    }

    public a(Context context, n nVar, int i2) {
        this.f3662a = context;
        this.f3663b = nVar;
        this.f3664c = i2;
    }

    @Override // a.v.s
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f3665d.clear();
        for (int i2 : intArray) {
            this.f3665d.add(Integer.valueOf(i2));
        }
    }

    @Override // a.v.s
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f3665d.size()];
        Iterator<Integer> it = this.f3665d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // a.v.s
    public boolean e() {
        if (this.f3665d.isEmpty()) {
            return false;
        }
        if (this.f3663b.L0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f3663b.Y0(g(this.f3665d.size(), this.f3665d.peekLast().intValue()), 1);
        this.f3665d.removeLast();
        return true;
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0084a a() {
        return new C0084a(this);
    }

    public final String g(int i2, int i3) {
        return i2 + "-" + i3;
    }

    @Deprecated
    public Fragment h(Context context, n nVar, String str, Bundle bundle) {
        return nVar.r0().a(context.getClassLoader(), str);
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k b(C0084a c0084a, Bundle bundle, p pVar, s.a aVar) {
        if (this.f3663b.L0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strN = c0084a.N();
        boolean z = false;
        if (strN.charAt(0) == '.') {
            strN = this.f3662a.getPackageName() + strN;
        }
        Fragment fragmentH = h(this.f3662a, this.f3663b, strN, bundle);
        fragmentH.setArguments(bundle);
        y yVarM = this.f3663b.m();
        int iA = pVar != null ? pVar.a() : -1;
        int iB = pVar != null ? pVar.b() : -1;
        int iC = pVar != null ? pVar.c() : -1;
        int iD = pVar != null ? pVar.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            if (iD == -1) {
                iD = 0;
            }
            yVarM.u(iA, iB, iC, iD);
        }
        yVarM.r(this.f3664c, fragmentH);
        yVarM.w(fragmentH);
        int iV = c0084a.v();
        boolean zIsEmpty = this.f3665d.isEmpty();
        boolean z2 = pVar != null && !zIsEmpty && pVar.g() && this.f3665d.peekLast().intValue() == iV;
        if (zIsEmpty) {
            z = true;
        } else if (!z2) {
            yVarM.h(g(this.f3665d.size() + 1, iV));
            z = true;
        } else if (this.f3665d.size() > 1) {
            this.f3663b.Y0(g(this.f3665d.size(), this.f3665d.peekLast().intValue()), 1);
            yVarM.h(g(this.f3665d.size(), iV));
        }
        if (aVar instanceof b) {
            for (Map.Entry<View, String> entry : ((b) aVar).a().entrySet()) {
                yVarM.g(entry.getKey(), entry.getValue());
            }
        }
        yVarM.x(true);
        yVarM.j();
        if (!z) {
            return null;
        }
        this.f3665d.add(Integer.valueOf(iV));
        return c0084a;
    }
}
