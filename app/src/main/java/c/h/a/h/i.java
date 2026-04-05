package c.h.a.h;

import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.view.adapter.SubCategoriesChildAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i implements c.g.a.a<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f16906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f16908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SubCategoriesChildAdapter f16909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<b> f16910e;

    public i(RecyclerView recyclerView, String str, ArrayList<c.h.a.i.f> arrayList, SubCategoriesChildAdapter subCategoriesChildAdapter, List<b> list) {
        this.f16906a = recyclerView;
        this.f16907b = str;
        this.f16908c = arrayList;
        this.f16909d = subCategoriesChildAdapter;
        this.f16910e = list;
    }

    @Override // c.g.a.a
    public List<b> a() {
        return this.f16910e;
    }

    public List<c.h.a.i.f> b() {
        return this.f16908c;
    }
}
