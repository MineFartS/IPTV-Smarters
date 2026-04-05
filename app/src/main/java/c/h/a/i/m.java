package c.h.a.i;

import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f17206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<e> f17207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<SeriesDBModel> f17208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f17209d;

    public static m b() {
        if (f17206a == null) {
            f17206a = new m();
        }
        return f17206a;
    }

    public List<GetEpisdoeDetailsCallback> a() {
        return this.f17209d;
    }

    public ArrayList<e> c() {
        return this.f17207b;
    }

    public ArrayList<SeriesDBModel> d() {
        return this.f17208c;
    }

    public void e(List<GetEpisdoeDetailsCallback> list) {
        this.f17209d = list;
    }

    public void f(ArrayList<e> arrayList) {
        this.f17207b = arrayList;
    }

    public void g(ArrayList<SeriesDBModel> arrayList) {
        this.f17208c = arrayList;
    }
}
