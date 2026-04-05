package a.n.q;

import a.n.q.h0;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.RowHeaderView;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f2864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2866e;

    public static class a extends h0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public RowHeaderView f2870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f2871g;

        public a(View view) {
            super(view);
            this.f2870f = (RowHeaderView) view.findViewById(a.n.f.B);
            this.f2871g = (TextView) view.findViewById(a.n.f.C);
            b();
        }

        public void b() {
            RowHeaderView rowHeaderView = this.f2870f;
            if (rowHeaderView != null) {
                this.f2868d = rowHeaderView.getCurrentTextColor();
            }
            this.f2869e = this.f2823a.getResources().getFraction(a.n.e.f2601a, 1, 1);
        }
    }

    public o0() {
        this(a.n.h.f2637h);
    }

    public o0(int i2) {
        this(i2, true);
    }

    public o0(int i2, boolean z) {
        this.f2864c = new Paint(1);
        this.f2863b = i2;
        this.f2866e = z;
    }

    public static float i(TextView textView, Paint paint) {
        if (paint.getTextSize() != textView.getTextSize()) {
            paint.setTextSize(textView.getTextSize());
        }
        if (paint.getTypeface() != textView.getTypeface()) {
            paint.setTypeface(textView.getTypeface());
        }
        return paint.descent();
    }

    @Override // a.n.q.h0
    public void c(h0.a aVar, Object obj) {
        a aVar2 = (a) aVar;
        if ((obj == null ? null : ((m0) obj).a()) != null) {
            if (aVar2.f2870f != null || aVar2.f2871g != null) {
                throw null;
            }
            View view = aVar.f2823a;
            throw null;
        }
        RowHeaderView rowHeaderView = aVar2.f2870f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f2871g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        aVar.f2823a.setContentDescription(null);
        if (this.f2865d) {
            aVar.f2823a.setVisibility(8);
        }
    }

    @Override // a.n.q.h0
    public h0.a e(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f2863b, viewGroup, false));
        if (this.f2866e) {
            m(aVar, 0.0f);
        }
        return aVar;
    }

    @Override // a.n.q.h0
    public void f(h0.a aVar) {
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f2870f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f2871g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f2866e) {
            m(aVar2, 0.0f);
        }
    }

    public int j(a aVar) {
        int paddingBottom = aVar.f2823a.getPaddingBottom();
        View view = aVar.f2823a;
        return view instanceof TextView ? paddingBottom + ((int) i((TextView) view, this.f2864c)) : paddingBottom;
    }

    public void k(a aVar) {
        if (this.f2866e) {
            View view = aVar.f2823a;
            float f2 = aVar.f2869e;
            view.setAlpha(f2 + (aVar.f2867c * (1.0f - f2)));
        }
    }

    public void l(boolean z) {
        this.f2865d = z;
    }

    public final void m(a aVar, float f2) {
        aVar.f2867c = f2;
        k(aVar);
    }
}
