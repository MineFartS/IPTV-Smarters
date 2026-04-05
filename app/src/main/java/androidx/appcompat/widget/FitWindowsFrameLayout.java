package androidx.appcompat.widget;

import a.b.q.d0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0.a f4192b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        d0.a aVar = this.f4192b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // a.b.q.d0
    public void setOnFitSystemWindowsListener(d0.a aVar) {
        this.f4192b = aVar;
    }
}
