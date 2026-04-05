package androidx.preference;

import a.i.i.e.g;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public b F;
    public List<Preference> G;
    public e H;
    public final View.OnClickListener I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.x.b f4747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.x.a f4748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f4749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f4750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f4753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Intent f4757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f4758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4759o;
    public boolean p;
    public boolean q;
    public String r;
    public Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.I(view);
        }
    }

    public interface b {
        void a(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    public interface e<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, a.x.c.f3756g, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x00c7 A[PHI: r7
  0x00c7: PHI (r7v41 int) = (r7v29 int), (r7v30 int) binds: [B:3:0x00c5, B:6:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public boolean A() {
        return this.p;
    }

    public void B() {
        b bVar = this.F;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void C(boolean z) {
        List<Preference> list = this.G;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).E(this, z);
        }
    }

    public void D() {
    }

    public void E(Preference preference, boolean z) {
        if (this.t == z) {
            this.t = !z;
            C(N());
            B();
        }
    }

    public Object F(TypedArray typedArray, int i2) {
        return null;
    }

    public void G(Preference preference, boolean z) {
        if (this.u == z) {
            this.u = !z;
            C(N());
            B();
        }
    }

    public void H() {
        if (y() && A()) {
            D();
            d dVar = this.f4750f;
            if (dVar == null || !dVar.a(this)) {
                if (t() != null) {
                    throw null;
                }
                if (this.f4757m != null) {
                    d().startActivity(this.f4757m);
                }
            }
        }
    }

    public void I(View view) {
        H();
    }

    public boolean J(boolean z) {
        if (!O()) {
            return false;
        }
        if (z == p(!z)) {
            return true;
        }
        s().getClass();
        throw null;
    }

    public boolean K(int i2) {
        if (!O()) {
            return false;
        }
        if (i2 == q(i2 ^ (-1))) {
            return true;
        }
        s().getClass();
        throw null;
    }

    public boolean L(String str) {
        if (!O()) {
            return false;
        }
        if (TextUtils.equals(str, r(null))) {
            return true;
        }
        s().getClass();
        throw null;
    }

    public final void M(e eVar) {
        this.H = eVar;
        B();
    }

    public boolean N() {
        return !y();
    }

    public boolean O() {
        return this.f4747c != null && z() && x();
    }

    public boolean a(Object obj) {
        c cVar = this.f4749e;
        return cVar == null || cVar.a(this, obj);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i2 = this.f4751g;
        int i3 = preference.f4751g;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f4753i;
        CharSequence charSequence2 = preference.f4753i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4753i.toString());
    }

    public Context d() {
        return this.f4746b;
    }

    public StringBuilder g() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceW = w();
        if (!TextUtils.isEmpty(charSequenceW)) {
            sb.append(charSequenceW);
            sb.append(' ');
        }
        CharSequence charSequenceU = u();
        if (!TextUtils.isEmpty(charSequenceU)) {
            sb.append(charSequenceU);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String i() {
        return this.f4758n;
    }

    public Intent o() {
        return this.f4757m;
    }

    public boolean p(boolean z) {
        if (!O()) {
            return z;
        }
        s().getClass();
        throw null;
    }

    public int q(int i2) {
        if (!O()) {
            return i2;
        }
        s().getClass();
        throw null;
    }

    public String r(String str) {
        if (!O()) {
            return str;
        }
        s().getClass();
        throw null;
    }

    public a.x.a s() {
        a.x.a aVar = this.f4748d;
        if (aVar != null) {
            return aVar;
        }
        if (this.f4747c == null) {
            return null;
        }
        throw null;
    }

    public a.x.b t() {
        return this.f4747c;
    }

    public String toString() {
        return g().toString();
    }

    public CharSequence u() {
        return v() != null ? v().a(this) : this.f4754j;
    }

    public final e v() {
        return this.H;
    }

    public CharSequence w() {
        return this.f4753i;
    }

    public boolean x() {
        return !TextUtils.isEmpty(this.f4756l);
    }

    public boolean y() {
        return this.f4759o && this.t && this.u;
    }

    public boolean z() {
        return this.q;
    }
}
