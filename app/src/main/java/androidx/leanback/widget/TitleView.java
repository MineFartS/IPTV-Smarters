package androidx.leanback.widget;

import a.n.f;
import a.n.h;
import a.n.q.b1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;

/* JADX INFO: loaded from: classes.dex */
public class TitleView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f4605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SearchOrbView f4606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f4609g;

    public class a extends b1 {
        public a() {
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.n.a.f2563a);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4607e = 6;
        this.f4608f = false;
        this.f4609g = new a();
        View viewInflate = LayoutInflater.from(context).inflate(h.f2644o, this);
        this.f4604b = (ImageView) viewInflate.findViewById(f.E);
        this.f4605c = (TextView) viewInflate.findViewById(f.G);
        this.f4606d = (SearchOrbView) viewInflate.findViewById(f.F);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a() {
        if (this.f4604b.getDrawable() != null) {
            this.f4604b.setVisibility(0);
            this.f4605c.setVisibility(8);
        } else {
            this.f4604b.setVisibility(8);
            this.f4605c.setVisibility(0);
        }
    }

    public final void b() {
        int i2 = 4;
        if (this.f4608f && (this.f4607e & 4) == 4) {
            i2 = 0;
        }
        this.f4606d.setVisibility(i2);
    }

    public Drawable getBadgeDrawable() {
        return this.f4604b.getDrawable();
    }

    public SearchOrbView.c getSearchAffordanceColors() {
        return this.f4606d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.f4606d;
    }

    public CharSequence getTitle() {
        return this.f4605c.getText();
    }

    public b1 getTitleViewAdapter() {
        return this.f4609g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f4604b.setImageDrawable(drawable);
        a();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.f4608f = onClickListener != null;
        this.f4606d.setOnOrbClickedListener(onClickListener);
        b();
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        this.f4606d.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4605c.setText(charSequence);
        a();
    }
}
