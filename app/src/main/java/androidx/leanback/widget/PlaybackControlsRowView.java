package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackControlsRowView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f4516b;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        a aVar = this.f4516b;
        return aVar != null && aVar.a(keyEvent);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || !viewFindFocus.requestFocus(i2, rect)) {
            return super.onRequestFocusInDescendants(i2, rect);
        }
        return true;
    }
}
