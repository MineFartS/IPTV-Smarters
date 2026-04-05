package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f4461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f4462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnKeyListener f4463d;

    public interface a {
        boolean a(int i2, Rect rect);

        void b(View view, View view2);
    }

    public interface b {
        View a(View view, int i2);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f4463d;
        return (onKeyListener == null || zDispatchKeyEvent) ? zDispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewA;
        b bVar = this.f4461b;
        return (bVar == null || (viewA = bVar.a(view, i2)) == null) ? super.focusSearch(view, i2) : viewA;
    }

    public a getOnChildFocusListener() {
        return this.f4462c;
    }

    public b getOnFocusSearchListener() {
        return this.f4461b;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        a aVar = this.f4462c;
        if (aVar == null || !aVar.a(i2, rect)) {
            return super.onRequestFocusInDescendants(i2, rect);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        a aVar = this.f4462c;
        if (aVar != null) {
            aVar.b(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(a aVar) {
        this.f4462c = aVar;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f4463d = onKeyListener;
    }

    public void setOnFocusSearchListener(b bVar) {
        this.f4461b = bVar;
    }
}
