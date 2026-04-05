package androidx.leanback.widget;

import a.n.b;
import a.n.d;
import a.n.e;
import a.n.h;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView;

/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {
    public final float t;
    public SearchOrbView.c u;
    public SearchOrbView.c v;
    public int w;
    public boolean x;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = 0;
        this.x = false;
        Resources resources = context.getResources();
        this.t = resources.getFraction(e.f2606f, 1, 1);
        this.v = new SearchOrbView.c(resources.getColor(b.f2575j), resources.getColor(b.f2577l), resources.getColor(b.f2576k));
        int i3 = b.f2578m;
        this.u = new SearchOrbView.c(resources.getColor(i3), resources.getColor(i3), 0);
        g();
    }

    public void f() {
        setOrbColors(this.u);
        setOrbIcon(getResources().getDrawable(d.f2597c));
        a(true);
        b(false);
        c(1.0f);
        this.w = 0;
        this.x = true;
    }

    public void g() {
        setOrbColors(this.v);
        setOrbIcon(getResources().getDrawable(d.f2598d));
        a(hasFocus());
        c(1.0f);
        this.x = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return h.f2643n;
    }

    public void setListeningOrbColors(SearchOrbView.c cVar) {
        this.u = cVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.c cVar) {
        this.v = cVar;
    }

    public void setSoundLevel(int i2) {
        if (this.x) {
            int i3 = this.w;
            if (i2 > i3) {
                this.w = i3 + ((i2 - i3) / 2);
            } else {
                this.w = (int) (i3 * 0.7f);
            }
            c((((this.t - getFocusedZoom()) * this.w) / 100.0f) + 1.0f);
        }
    }
}
