package a.i.r.g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2047d;

    public a(int i2, c cVar, int i3) {
        this.f2045b = i2;
        this.f2046c = cVar;
        this.f2047d = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2045b);
        this.f2046c.N(this.f2047d, bundle);
    }
}
