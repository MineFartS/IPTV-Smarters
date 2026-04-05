package c.f.a.b.h3;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import c.f.a.b.f3.c;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c1> f8661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<c.f.a.b.f3.c> f8662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f8665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8666g;

    public g0(Context context) {
        this(context, null);
    }

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8661b = new ArrayList();
        this.f8662c = Collections.emptyList();
        this.f8663d = 0;
        this.f8664e = 0.0533f;
        this.f8665f = h0.f8678a;
        this.f8666g = 0.08f;
    }

    public static c.f.a.b.f3.c b(c.f.a.b.f3.c cVar) {
        c.b bVarP = cVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (cVar.f8070h == 0) {
            bVarP.h(1.0f - cVar.f8069g, 0);
        } else {
            bVarP.h((-cVar.f8069g) - 1.0f, 1);
        }
        int i2 = cVar.f8071i;
        if (i2 == 0) {
            bVarP.i(2);
        } else if (i2 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<c.f.a.b.f3.c> list, h0 h0Var, float f2, int i2, float f3) {
        this.f8662c = list;
        this.f8665f = h0Var;
        this.f8664e = f2;
        this.f8663d = i2;
        this.f8666g = f3;
        while (this.f8661b.size() < list.size()) {
            this.f8661b.add(new c1(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<c.f.a.b.f3.c> list = this.f8662c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float f2 = d1.f(this.f8663d, this.f8664e, height, i2);
        if (f2 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            c.f.a.b.f3.c cVarB = list.get(i3);
            if (cVarB.r != Integer.MIN_VALUE) {
                cVarB = b(cVarB);
            }
            c.f.a.b.f3.c cVar = cVarB;
            int i4 = paddingBottom;
            this.f8661b.get(i3).b(cVar, this.f8665f, f2, d1.f(cVar.p, cVar.q, height, i2), this.f8666g, canvas, paddingLeft, paddingTop, width, i4);
            i3++;
            size = size;
            i2 = i2;
            paddingBottom = i4;
            width = width;
        }
    }
}
