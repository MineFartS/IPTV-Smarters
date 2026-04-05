package a.b.q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f866g;

    public y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f863d = layoutParams;
        this.f864e = new Rect();
        this.f865f = new int[2];
        this.f866g = new int[2];
        this.f860a = context;
        View viewInflate = LayoutInflater.from(context).inflate(a.b.g.s, (ViewGroup) null);
        this.f861b = viewInflate;
        this.f862c = (TextView) viewInflate.findViewById(a.b.f.s);
        layoutParams.setTitle(y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.b.i.f115a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f860a.getResources().getDimensionPixelOffset(a.b.d.f53m);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f860a.getResources().getDimensionPixelOffset(a.b.d.f52l);
            height = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f860a.getResources().getDimensionPixelOffset(z ? a.b.d.f55o : a.b.d.f54n);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f864e);
        Rect rect = this.f864e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f860a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f864e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f866g);
        view.getLocationOnScreen(this.f865f);
        int[] iArr = this.f865f;
        int i5 = iArr[0];
        int[] iArr2 = this.f866g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f861b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f861b.getMeasuredHeight();
        int[] iArr3 = this.f865f;
        int i6 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 <= this.f864e.height() : i6 < 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f860a.getSystemService("window")).removeView(this.f861b);
        }
    }

    public boolean d() {
        return this.f861b.getParent() != null;
    }

    public void e(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f862c.setText(charSequence);
        a(view, i2, i3, z, this.f863d);
        ((WindowManager) this.f860a.getSystemService("window")).addView(this.f861b, this.f863d);
    }
}
