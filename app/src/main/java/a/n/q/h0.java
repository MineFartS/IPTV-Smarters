package a.n.q;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Class, Object> f2822a;

    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Class, Object> f2824b;

        public a(View view) {
            this.f2823a = view;
        }

        @Override // a.n.q.e
        public final Object a(Class<?> cls) {
            Map<Class, Object> map = this.f2824b;
            if (map == null) {
                return null;
            }
            return map.get(cls);
        }
    }

    public static void b(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; view.hasTransientState() && i2 < childCount; i2++) {
                b(viewGroup.getChildAt(i2));
            }
        }
    }

    @Override // a.n.q.e
    public final Object a(Class<?> cls) {
        Map<Class, Object> map = this.f2822a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public abstract void c(a aVar, Object obj);

    public void d(a aVar, Object obj, List<Object> list) {
        c(aVar, obj);
    }

    public abstract a e(ViewGroup viewGroup);

    public abstract void f(a aVar);

    public void g(a aVar) {
    }

    public void h(a aVar) {
        b(aVar.f2823a);
    }
}
