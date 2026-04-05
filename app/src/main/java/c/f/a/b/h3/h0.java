package c.f.a.b.h3;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f8678a = new h0(-1, DefaultRenderer.BACKGROUND_COLOR, 0, 0, -1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Typeface f8684g;

    public h0(int i2, int i3, int i4, int i5, int i6, Typeface typeface) {
        this.f8679b = i2;
        this.f8680c = i3;
        this.f8681d = i4;
        this.f8682e = i5;
        this.f8683f = i6;
        this.f8684g = typeface;
    }

    public static h0 a(CaptioningManager.CaptionStyle captionStyle) {
        return c.f.a.b.j3.x0.f9296a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    public static h0 b(CaptioningManager.CaptionStyle captionStyle) {
        return new h0(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public static h0 c(CaptioningManager.CaptionStyle captionStyle) {
        return new h0(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f8678a.f8679b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f8678a.f8680c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f8678a.f8681d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f8678a.f8682e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f8678a.f8683f, captionStyle.getTypeface());
    }
}
