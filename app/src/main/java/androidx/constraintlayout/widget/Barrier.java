package androidx.constraintlayout.widget;

import a.g.b.k.a;
import a.g.b.k.e;
import a.g.c.b;
import a.g.c.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f4276l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // a.g.c.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f4276l = new a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.j1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.i1) {
                    this.f4276l.L0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.k1) {
                    this.f4276l.N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1505e = this.f4276l;
        m();
    }

    public int getMargin() {
        return this.f4276l.J0();
    }

    public int getType() {
        return this.f4274j;
    }

    @Override // a.g.c.b
    public void h(e eVar, boolean z) {
        o(eVar, this.f4274j, z);
    }

    public boolean n() {
        return this.f4276l.H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(a.g.b.k.e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f4275k = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L16
            int r7 = r5.f4274j
            if (r7 != r3) goto L13
        L10:
            r5.f4275k = r1
            goto L28
        L13:
            if (r7 != r2) goto L28
        L15:
            goto L1c
        L16:
            int r7 = r5.f4274j
            if (r8 == 0) goto L22
            if (r7 != r3) goto L1f
        L1c:
            r5.f4275k = r0
            goto L28
        L1f:
            if (r7 != r2) goto L28
            goto L10
        L22:
            if (r7 != r3) goto L25
            goto L10
        L25:
            if (r7 != r2) goto L28
            goto L15
        L28:
            boolean r7 = r6 instanceof a.g.b.k.a
            if (r7 == 0) goto L33
            a.g.b.k.a r6 = (a.g.b.k.a) r6
            int r7 = r5.f4275k
            r6.M0(r7)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.o(a.g.b.k.e, int, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f4276l.L0(z);
    }

    public void setDpMargin(int i2) {
        this.f4276l.N0((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.f4276l.N0(i2);
    }

    public void setType(int i2) {
        this.f4274j = i2;
    }
}
