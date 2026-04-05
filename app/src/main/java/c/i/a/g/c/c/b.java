package c.i.a.g.c.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.i.a.c;
import c.i.a.d;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f18129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<c.i.a.g.c.a> f18130f;

    public class a extends RecyclerView.e0 {
        public final View u;
        public final TextView v;

        public a(View view) {
            super(view);
            this.u = view;
            this.v = (TextView) view.findViewById(c.f18056m);
        }
    }

    public b(Context context, List<c.i.a.g.c.a> list) {
        this.f18129e = context;
        this.f18130f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void F(a aVar, int i2) {
        aVar.u.setOnClickListener(this.f18130f.get(i2).b());
        aVar.v.setText(this.f18130f.get(i2).c());
        aVar.v.setCompoundDrawablesWithIntrinsicBounds(a.i.i.b.f(this.f18129e, this.f18130f.get(i2).a()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a H(ViewGroup viewGroup, int i2) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(d.f18060b, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f18130f.size();
    }
}
