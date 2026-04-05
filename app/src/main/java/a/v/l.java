package a.v;

import a.v.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class l extends k implements Iterable<k> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a.f.j<k> f3588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3590m;

    public class a implements Iterator<k> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3591b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3592c = false;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3592c = true;
            a.f.j<k> jVar = l.this.f3588k;
            int i2 = this.f3591b + 1;
            this.f3591b = i2;
            return jVar.n(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3591b + 1 < l.this.f3588k.m();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3592c) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            l.this.f3588k.n(this.f3591b).L(null);
            l.this.f3588k.l(this.f3591b);
            this.f3591b--;
            this.f3592c = false;
        }
    }

    public l(s<? extends l> sVar) {
        super(sVar);
        this.f3588k = new a.f.j<>();
    }

    @Override // a.v.k
    public k.a D(j jVar) {
        k.a aVarD = super.D(jVar);
        Iterator<k> it = iterator();
        while (it.hasNext()) {
            k.a aVarD2 = it.next().D(jVar);
            if (aVarD2 != null && (aVarD == null || aVarD2.compareTo(aVarD) > 0)) {
                aVarD = aVarD2;
            }
        }
        return aVarD;
    }

    @Override // a.v.k
    public void F(Context context, AttributeSet attributeSet) {
        super.F(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, a.v.w.a.y);
        S(typedArrayObtainAttributes.getResourceId(a.v.w.a.z, 0));
        this.f3590m = k.t(context, this.f3589l);
        typedArrayObtainAttributes.recycle();
    }

    public final void N(k kVar) {
        int iV = kVar.v();
        if (iV == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (iV == v()) {
            throw new IllegalArgumentException("Destination " + kVar + " cannot have the same id as graph " + this);
        }
        k kVarF = this.f3588k.f(iV);
        if (kVarF == kVar) {
            return;
        }
        if (kVar.C() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (kVarF != null) {
            kVarF.L(null);
        }
        kVar.L(this);
        this.f3588k.k(kVar.v(), kVar);
    }

    public final k O(int i2) {
        return P(i2, true);
    }

    public final k P(int i2, boolean z) {
        k kVarF = this.f3588k.f(i2);
        if (kVarF != null) {
            return kVarF;
        }
        if (!z || C() == null) {
            return null;
        }
        return C().O(i2);
    }

    public String Q() {
        if (this.f3590m == null) {
            this.f3590m = Integer.toString(this.f3589l);
        }
        return this.f3590m;
    }

    public final int R() {
        return this.f3589l;
    }

    public final void S(int i2) {
        if (i2 != v()) {
            this.f3589l = i2;
            this.f3590m = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i2 + " cannot use the same id as the graph " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return new a();
    }

    @Override // a.v.k
    public String s() {
        return v() != 0 ? super.s() : "the root navigation";
    }

    @Override // a.v.k
    public String toString() {
        String hexString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        k kVarO = O(R());
        if (kVarO == null) {
            hexString = this.f3590m;
            if (hexString == null) {
                sb.append("0x");
                hexString = Integer.toHexString(this.f3589l);
            }
        } else {
            sb.append("{");
            sb.append(kVarO.toString());
            hexString = "}";
        }
        sb.append(hexString);
        return sb.toString();
    }
}
