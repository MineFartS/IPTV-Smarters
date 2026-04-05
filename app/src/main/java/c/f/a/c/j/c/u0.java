package c.f.a.c.j.c;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RelativeLayout f13087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f13088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CastSeekBar f13089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.c.d.u.u.l.c f13090f;

    public u0(RelativeLayout relativeLayout, CastSeekBar castSeekBar, c.f.a.c.d.u.u.l.c cVar) {
        this.f13087c = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(c.f.a.c.d.u.l.V);
        this.f13088d = textView;
        this.f13089e = castSeekBar;
        this.f13090f = cVar;
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, c.f.a.c.d.u.p.f11901a, c.f.a.c.d.u.i.f11838a, c.f.a.c.d.u.o.f11899a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.f.a.c.d.u.p.v, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        j();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        j();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        super.f();
        j();
    }

    @Override // c.f.a.c.j.c.p0
    public final void h(long j2) {
        j();
    }

    @Override // c.f.a.c.j.c.p0
    public final void i(boolean z) {
        super.i(z);
        j();
    }

    public final void j() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p() || g()) {
            this.f13087c.setVisibility(8);
            return;
        }
        this.f13087c.setVisibility(0);
        TextView textView = this.f13088d;
        c.f.a.c.d.u.u.l.c cVar = this.f13090f;
        textView.setText(cVar.q(cVar.s(this.f13089e.getProgress())));
        int measuredWidth = (this.f13089e.getMeasuredWidth() - this.f13089e.getPaddingLeft()) - this.f13089e.getPaddingRight();
        this.f13088d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.f13088d.getMeasuredWidth();
        double progress = this.f13089e.getProgress();
        Double.isNaN(progress);
        double maxProgress = this.f13089e.getMaxProgress();
        Double.isNaN(maxProgress);
        double d2 = (progress * 1.0d) / maxProgress;
        double d3 = measuredWidth;
        Double.isNaN(d3);
        int iMin = Math.min(Math.max(0, ((int) (d2 * d3)) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13088d.getLayoutParams();
        layoutParams.leftMargin = iMin;
        this.f13088d.setLayoutParams(layoutParams);
    }
}
