package androidx.leanback.widget;

import a.i.s.i;
import a.n.q.l;
import a.n.q.o;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class GuidedActionEditText extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f4472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f4473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f4474e;

    public static final class a extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4473d = getBackground();
        a aVar = new a();
        this.f4474e = aVar;
        setBackground(aVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        l lVar = this.f4472c;
        if (lVar != null) {
            lVar.a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        setBackground(z ? this.f4473d : this.f4474e);
        if (z) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        o oVar = this.f4471b;
        boolean zA = oVar != null ? oVar.a(this, i2, keyEvent) : false;
        return !zA ? super.onKeyPreIme(i2, keyEvent) : zA;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }

    public void setImeKeyListener(o oVar) {
        this.f4471b = oVar;
    }

    public void setOnAutofillListener(l lVar) {
        this.f4472c = lVar;
    }
}
