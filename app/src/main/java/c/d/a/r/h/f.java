package c.d.a.r.h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public <Z> j<Z> a(ImageView imageView, Class<Z> cls) {
        if (c.d.a.n.k.f.b.class.isAssignableFrom(cls)) {
            return new d(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
