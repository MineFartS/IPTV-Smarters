package androidx.leanback.widget;

import a.n.k;
import a.n.q.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class SearchEditText extends a1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f4561i = SearchEditText.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f4562j;

    public interface a {
        void a();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.f2653a);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // a.n.q.a1
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // a.n.q.a1
    public /* bridge */ /* synthetic */ void g(String str, String str2) {
        super.g(str, str2);
    }

    @Override // a.n.q.a1, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i2, keyEvent);
        }
        a aVar = this.f4562j;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return false;
    }

    @Override // a.n.q.a1, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // a.n.q.a1
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(a aVar) {
        this.f4562j = aVar;
    }
}
