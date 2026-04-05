package c.e.a.a;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f5968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f5969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f5970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<View> f5971e = new SparseArray<>();

    public a(Activity activity) {
        this.f5967a = activity;
        this.f5970d = activity.getApplicationContext();
    }

    public a a(int i2) {
        View view = this.f5971e.get(i2);
        this.f5969c = view;
        if (view == null) {
            View view2 = this.f5968b;
            this.f5969c = view2 != null ? view2.findViewById(i2) : this.f5967a.findViewById(i2);
            this.f5971e.put(i2, this.f5969c);
        }
        return this;
    }

    public a b(CharSequence charSequence) {
        View view = this.f5969c;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(charSequence);
        }
        return this;
    }

    public <T extends View> T c() {
        return (T) this.f5969c;
    }

    public a d() {
        View view = this.f5969c;
        if (view != null) {
            view.setVisibility(0);
        }
        return this;
    }
}
