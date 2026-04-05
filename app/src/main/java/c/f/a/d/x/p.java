package c.f.a.d.x;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p<S> extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<o<S>> f15341b = new LinkedHashSet<>();

    public boolean l(o<S> oVar) {
        return this.f15341b.add(oVar);
    }

    public void n() {
        this.f15341b.clear();
    }
}
