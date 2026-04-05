package c.f.a.d.x;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k<S> extends p<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d<S> f15318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.d.x.a f15319e;

    public class a extends o<S> {
        public a() {
        }

        @Override // c.f.a.d.x.o
        public void a(S s) {
            Iterator<o<S>> it = k.this.f15341b.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    public static <T> k<T> o(d<T> dVar, int i2, c.f.a.d.x.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15317c = bundle.getInt("THEME_RES_ID_KEY");
        this.f15318d = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f15319e = (c.f.a.d.x.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f15318d.s(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f15317c)), viewGroup, bundle, this.f15319e, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f15317c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f15318d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15319e);
    }
}
