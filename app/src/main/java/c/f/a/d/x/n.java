package c.f.a.d.x;

import a.i.r.x;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.d.x.h;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* JADX INFO: loaded from: classes2.dex */
public class n extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f15334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.d.x.a f15335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d<?> f15336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h.l f15337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15338i;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f15339b;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f15339b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f15339b.getAdapter().n(i2)) {
                n.this.f15337h.a(this.f15339b.getAdapter().getItem(i2).longValue());
            }
        }
    }

    public static class b extends RecyclerView.e0 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(c.f.a.d.f.s);
            this.u = textView;
            x.q0(textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(c.f.a.d.f.f14796o);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public n(Context context, d<?> dVar, c.f.a.d.x.a aVar, h.l lVar) {
        l lVarM = aVar.m();
        l lVarJ = aVar.j();
        l lVarL = aVar.l();
        if (lVarM.compareTo(lVarL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarL.compareTo(lVarJ) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int iH = m.f15328b * h.H(context);
        int iH2 = i.l0(context) ? h.H(context) : 0;
        this.f15334e = context;
        this.f15338i = iH + iH2;
        this.f15335f = aVar;
        this.f15336g = dVar;
        this.f15337h = lVar;
        S(true);
    }

    public l Z(int i2) {
        return this.f15335f.m().w(i2);
    }

    public CharSequence c0(int i2) {
        return Z(i2).t(this.f15334e);
    }

    public int e0(l lVar) {
        return this.f15335f.m().y(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void F(b bVar, int i2) {
        l lVarW = this.f15335f.m().w(i2);
        bVar.u.setText(lVarW.t(bVar.f4855b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(c.f.a.d.f.f14796o);
        if (materialCalendarGridView.getAdapter() == null || !lVarW.equals(materialCalendarGridView.getAdapter().f15329c)) {
            m mVar = new m(lVarW, this.f15336g, this.f15335f);
            materialCalendarGridView.setNumColumns(lVarW.f15324e);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b H(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c.f.a.d.h.f14841o, viewGroup, false);
        if (!i.l0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f15338i));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f15335f.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long q(int i2) {
        return this.f15335f.m().w(i2).u();
    }
}
