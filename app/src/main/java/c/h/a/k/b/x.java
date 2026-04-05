package c.h.a.k.b;

import android.content.Context;
import androidx.fragment.app.Fragment;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.fragment.SubTVArchiveFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class x extends a.l.d.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<XMLTVProgrammePojo> f17722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f17728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f17729o;
    public final int p;
    public List<String> q;
    public Map<Integer, String> r;
    public a.l.d.n s;

    public x(List<String> list, ArrayList<XMLTVProgrammePojo> arrayList, String str, String str2, String str3, String str4, String str5, String str6, a.l.d.n nVar, Context context) {
        super(nVar);
        this.s = nVar;
        this.r = new HashMap();
        this.p = list.size();
        this.q = list;
        this.f17722h = arrayList;
        this.f17723i = str;
        this.f17724j = str2;
        this.f17725k = str3;
        this.f17726l = str4;
        this.f17727m = str5;
        this.f17728n = str6;
        this.f17729o = context;
    }

    @Override // a.e0.a.a
    public int c() {
        return this.p;
    }

    @Override // a.e0.a.a
    public CharSequence e(int i2) {
        return this.q.get(i2);
    }

    @Override // a.l.d.s
    public Fragment p(int i2) {
        return SubTVArchiveFragment.n(this.q.get(i2), this.f17722h, this.f17723i, this.f17724j, this.f17725k, this.f17726l, this.f17727m, this.f17728n);
    }
}
