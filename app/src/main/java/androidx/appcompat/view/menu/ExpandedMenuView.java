package androidx.appcompat.view.menu;

import a.b.p.j.g;
import a.b.p.j.i;
import a.b.p.j.n;
import a.b.q.u0;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4108b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f4109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4110d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        u0 u0VarV = u0.v(context, attributeSet, f4108b, i2, 0);
        if (u0VarV.s(0)) {
            setBackgroundDrawable(u0VarV.g(0));
        }
        if (u0VarV.s(1)) {
            setDivider(u0VarV.g(1));
        }
        u0VarV.w();
    }

    @Override // a.b.p.j.g.b
    public boolean a(i iVar) {
        return this.f4109c.L(iVar, 0);
    }

    @Override // a.b.p.j.n
    public void b(g gVar) {
        this.f4109c = gVar;
    }

    public int getWindowAnimations() {
        return this.f4110d;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        a((i) getAdapter().getItem(i2));
    }
}
