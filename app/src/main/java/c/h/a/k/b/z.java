package c.h.a.k.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import minefarts.iptvsmarters.view.fragment.TVArchiveFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class z extends a.l.d.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f17757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f17758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map<Integer, String> f17759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a.l.d.n f17760m;

    public z(List<c.h.a.i.e> list, a.l.d.n nVar, Context context) {
        super(nVar);
        this.f17760m = nVar;
        this.f17759l = new HashMap();
        int size = list.size();
        this.f17756i = size;
        this.f17757j = new String[size];
        this.f17758k = new String[size];
        this.f17755h = context;
        for (int i2 = 0; i2 < this.f17756i; i2++) {
            String strC = list.get(i2).c();
            String strB = list.get(i2).b();
            this.f17757j[i2] = strC;
            this.f17758k[i2] = strB;
        }
    }

    @Override // a.e0.a.a
    public int c() {
        return this.f17756i;
    }

    @Override // a.e0.a.a
    public CharSequence e(int i2) {
        return this.f17757j[i2];
    }

    @Override // a.l.d.s, a.e0.a.a
    public Object g(ViewGroup viewGroup, int i2) {
        Object objG = super.g(viewGroup, i2);
        if (objG instanceof Fragment) {
            this.f17759l.put(Integer.valueOf(i2), ((Fragment) objG).getTag());
        }
        return objG;
    }

    @Override // a.l.d.s
    public Fragment p(int i2) {
        return TVArchiveFragment.E(this.f17758k[i2]);
    }
}
