package a.b.q;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class s extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f749b;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.N);
    }

    public s(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a(this, getContext());
        t tVar = new t(this);
        this.f749b = tVar;
        tVar.c(attributeSet, i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f749b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f749b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f749b.g(canvas);
    }
}
