package c.f.a.d.x;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class m extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15328b = s.k().getMaximum(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f15329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d<?> f15330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection<Long> f15331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f15332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f15333g;

    public m(l lVar, d<?> dVar, a aVar) {
        this.f15329c = lVar;
        this.f15330d = dVar;
        this.f15333g = aVar;
        this.f15331e = dVar.B();
    }

    public int a(int i2) {
        return b() + (i2 - 1);
    }

    public int b() {
        return this.f15329c.p();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < this.f15329c.p() || i2 > i()) {
            return null;
        }
        return Long.valueOf(this.f15329c.q(j(i2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = c.f.a.d.h.f14838l
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L72
            c.f.a.d.x.l r8 = r5.f15329c
            int r2 = r8.f15325f
            if (r7 < r2) goto L2d
            goto L72
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            c.f.a.d.x.l r8 = r5.f15329c
            long r7 = r8.q(r7)
            c.f.a.d.x.l r3 = r5.f15329c
            int r3 = r3.f15323d
            c.f.a.d.x.l r4 = c.f.a.d.x.l.o()
            int r4 = r4.f15323d
            if (r3 != r4) goto L64
            java.lang.String r7 = c.f.a.d.x.e.a(r7)
            goto L68
        L64:
            java.lang.String r7 = c.f.a.d.x.e.d(r7)
        L68:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7a
        L72:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L81
            return r0
        L81:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.d.x.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.f15332f == null) {
            this.f15332f = new c(context);
        }
    }

    public boolean f(int i2) {
        return i2 % this.f15329c.f15324e == 0;
    }

    public boolean g(int i2) {
        return (i2 + 1) % this.f15329c.f15324e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15329c.f15325f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f15329c.f15324e;
    }

    public final boolean h(long j2) {
        Iterator<Long> it = this.f15330d.B().iterator();
        while (it.hasNext()) {
            if (s.a(j2) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.f15329c.p() + this.f15329c.f15325f) - 1;
    }

    public int j(int i2) {
        return (i2 - this.f15329c.p()) + 1;
    }

    public final void k(TextView textView, long j2) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f15333g.h().a(j2)) {
            textView.setEnabled(true);
            if (h(j2)) {
                bVar = this.f15332f.f15272b;
            } else {
                long timeInMillis = s.i().getTimeInMillis();
                c cVar = this.f15332f;
                bVar = timeInMillis == j2 ? cVar.f15273c : cVar.f15271a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f15332f.f15277g;
        }
        bVar.d(textView);
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (l.d(j2).equals(this.f15329c)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f15329c.r(j2)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f15331e.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f15330d;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.B().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f15331e = this.f15330d.B();
        }
    }

    public boolean n(int i2) {
        return i2 >= b() && i2 <= i();
    }
}
