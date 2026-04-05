package c.f.a.d.x;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.d.x.h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class t extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<?> f15346e;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15347b;

        public a(int i2) {
            this.f15347b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f15346e.P(t.this.f15346e.C().f(l.c(this.f15347b, t.this.f15346e.F().f15322c)));
            t.this.f15346e.Q(h.k.DAY);
        }
    }

    public static class b extends RecyclerView.e0 {
        public final TextView u;

        public b(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public t(h<?> hVar) {
        this.f15346e = hVar;
    }

    public final View.OnClickListener Z(int i2) {
        return new a(i2);
    }

    public int c0(int i2) {
        return i2 - this.f15346e.C().m().f15323d;
    }

    public int e0(int i2) {
        return this.f15346e.C().m().f15323d + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void F(b bVar, int i2) {
        int iE0 = e0(i2);
        String string = bVar.u.getContext().getString(c.f.a.d.j.f14884o);
        bVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iE0)));
        bVar.u.setContentDescription(String.format(string, Integer.valueOf(iE0)));
        c cVarE = this.f15346e.E();
        Calendar calendarI = s.i();
        c.f.a.d.x.b bVar2 = calendarI.get(1) == iE0 ? cVarE.f15276f : cVarE.f15274d;
        Iterator<Long> it = this.f15346e.G().B().iterator();
        while (it.hasNext()) {
            calendarI.setTimeInMillis(it.next().longValue());
            if (calendarI.get(1) == iE0) {
                bVar2 = cVarE.f15275e;
            }
        }
        bVar2.d(bVar.u);
        bVar.u.setOnClickListener(Z(iE0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b H(ViewGroup viewGroup, int i2) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.f.a.d.h.q, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f15346e.C().n();
    }
}
