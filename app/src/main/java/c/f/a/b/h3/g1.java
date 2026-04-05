package c.f.a.b.h3;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f8667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f8668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<c.f.a.b.f3.c> f8669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f8670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8673h;

    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8675a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f8675a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8675a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8675a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g1(Context context) {
        this(context, null);
    }

    public g1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8669d = Collections.emptyList();
        this.f8670e = h0.f8678a;
        this.f8671f = 0.0533f;
        this.f8672g = 0;
        this.f8673h = 0.08f;
        g0 g0Var = new g0(context, attributeSet);
        this.f8667b = g0Var;
        a aVar = new a(context, attributeSet);
        this.f8668c = aVar;
        aVar.setBackgroundColor(0);
        addView(g0Var);
        addView(aVar);
    }

    public static int b(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i2 = b.f8675a[alignment.ordinal()];
        return i2 != 1 ? i2 != 2 ? "center" : "end" : "start";
    }

    public static String d(h0 h0Var) {
        int i2 = h0Var.f8682e;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unset" : c.f.a.b.j3.x0.D("-0.05em -0.05em 0.15em %s", l0.b(h0Var.f8683f)) : c.f.a.b.j3.x0.D("0.06em 0.08em 0.15em %s", l0.b(h0Var.f8683f)) : c.f.a.b.j3.x0.D("0.1em 0.12em 0.15em %s", l0.b(h0Var.f8683f)) : c.f.a.b.j3.x0.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", l0.b(h0Var.f8683f));
    }

    public static String f(int i2) {
        return i2 != 1 ? i2 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static String h(c.f.a.b.f3.c cVar) {
        float f2 = cVar.s;
        if (f2 == 0.0f) {
            return BuildConfig.FLAVOR;
        }
        int i2 = cVar.r;
        return c.f.a.b.j3.x0.D("%s(%.2fdeg)", (i2 == 2 || i2 == 1) ? "skewY" : "skewX", Float.valueOf(f2));
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<c.f.a.b.f3.c> list, h0 h0Var, float f2, int i2, float f3) {
        this.f8670e = h0Var;
        this.f8671f = f2;
        this.f8672g = i2;
        this.f8673h = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            c.f.a.b.f3.c cVar = list.get(i3);
            if (cVar.f8068f != null) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        if (!this.f8669d.isEmpty() || !arrayList2.isEmpty()) {
            this.f8669d = arrayList2;
            i();
        }
        this.f8667b.a(arrayList, h0Var, f2, i2, f3);
        invalidate();
    }

    public final String e(int i2, float f2) {
        float f3 = d1.f(i2, f2, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f3 == -3.4028235E38f ? "unset" : c.f.a.b.j3.x0.D("%.2fpx", Float.valueOf(f3 / getContext().getResources().getDisplayMetrics().density));
    }

    public void g() {
        this.f8668c.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.g1.i():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!z || this.f8669d.isEmpty()) {
            return;
        }
        i();
    }
}
