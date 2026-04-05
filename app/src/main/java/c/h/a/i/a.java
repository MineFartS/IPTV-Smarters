package c.h.a.i;

import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeasonsDetailCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f17134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f17135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<GetEpisdoeDetailsCallback> f17136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17137d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<SeasonsDetailCallback> f17138e;

    public static a c() {
        if (f17134a == null) {
            f17134a = new a();
        }
        return f17134a;
    }

    public List<GetEpisdoeDetailsCallback> a() {
        return this.f17136c;
    }

    public List<GetEpisdoeDetailsCallback> b() {
        return this.f17135b;
    }

    public ArrayList<SeasonsDetailCallback> d() {
        return this.f17138e;
    }

    public void e(List<GetEpisdoeDetailsCallback> list) {
        this.f17136c = list;
    }

    public void f(List<GetEpisdoeDetailsCallback> list) {
        this.f17135b = list;
    }

    public void g(ArrayList<SeasonsDetailCallback> arrayList) {
        this.f17138e = arrayList;
    }
}
