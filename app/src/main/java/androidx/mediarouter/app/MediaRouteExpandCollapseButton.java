package androidx.mediarouter.app;

import a.i.i.b;
import a.t.c;
import a.t.h;
import a.t.k.i;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationDrawable f4688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationDrawable f4689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f4693g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton;
            String str;
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton2.f4692f;
            mediaRouteExpandCollapseButton2.f4692f = z;
            if (z) {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f4688b);
                MediaRouteExpandCollapseButton.this.f4688b.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.f4691e;
            } else {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f4689c);
                MediaRouteExpandCollapseButton.this.f4689c.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.f4690d;
            }
            mediaRouteExpandCollapseButton.setContentDescription(str);
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.f4693g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AnimationDrawable animationDrawable = (AnimationDrawable) b.f(context, c.f3140b);
        this.f4688b = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) b.f(context, c.f3139a);
        this.f4689c = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i.e(context, i2), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(h.f3181i);
        this.f4690d = string;
        this.f4691e = context.getString(h.f3179g);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4693g = onClickListener;
    }
}
