package c.h.a.k.b;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T, VH extends RecyclerView.e0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f17420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<T> f17421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p<T> f17422g;

    public c(Context context, ArrayList<T> arrayList) {
        this.f17420e = context;
        this.f17421f = arrayList;
    }

    public void W(List<T> list) {
        this.f17421f.clear();
        this.f17421f.addAll(list);
        w();
    }

    public void Z(p pVar) {
        this.f17422g = pVar;
    }
}
