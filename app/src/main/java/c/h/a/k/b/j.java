package c.h.a.k.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class j extends c.h.a.k.b.c<c.h.a.g.c.c, c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f17517h;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f17518b;

        public a(c cVar) {
            this.f17518b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j.this.f17517h != null) {
                j.this.f17517h.a((c.h.a.g.c.c) j.this.f17421f.get(this.f17518b.n()));
            }
        }
    }

    public interface b {
        void a(c.h.a.g.c.c cVar);
    }

    public class c extends RecyclerView.e0 {
        public TextView u;

        public c(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_folder_title);
        }
    }

    public j(Context context, ArrayList<c.h.a.g.c.c> arrayList) {
        super(context, arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void F(c cVar, int i2) {
        cVar.u.setText(((c.h.a.g.c.c) this.f17421f.get(i2)).c());
        cVar.f4855b.setOnClickListener(new a(cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public c H(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(this.f17420e).inflate(R.layout.vw_layout_item_folder_list, viewGroup, false));
    }

    public void h0(b bVar) {
        this.f17517h = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17421f.size();
    }
}
