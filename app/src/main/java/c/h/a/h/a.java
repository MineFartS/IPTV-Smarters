package c.h.a.h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.SubCategoriesChildAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.g.a.b<i, b, j, c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f16786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f16787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<i> f16788k;

    public a(Context context, List<i> list, ArrayList<c.h.a.i.f> arrayList, RecyclerView recyclerView) {
        super(context, list);
        this.f16786i = context;
        this.f16787j = arrayList;
        this.f16788k = list;
    }

    @Override // c.g.a.b
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void e0(c cVar, int i2, int i3, b bVar) {
        this.f16787j = (ArrayList) this.f16788k.get(i2).b();
        cVar.u.setLayoutManager(new LinearLayoutManager(this.f16786i, 0, false));
        cVar.u.setAdapter(new SubCategoriesChildAdapter(this.f16787j, this.f16786i));
    }

    @Override // c.g.a.b
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void g0(j jVar, int i2, i iVar) {
        jVar.u.setText(iVar.f16907b);
    }

    @Override // c.g.a.b
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public c h0(ViewGroup viewGroup, int i2) {
        return new c(LayoutInflater.from(this.f16786i).inflate(R.layout.layout_section_child, viewGroup, false));
    }

    @Override // c.g.a.b
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public j i0(ViewGroup viewGroup, int i2) {
        return new j(LayoutInflater.from(this.f16786i).inflate(R.layout.layout_section_header, viewGroup, false));
    }
}
