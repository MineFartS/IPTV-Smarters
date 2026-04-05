package a.b.q;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f730a = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f732c;

    public p(ProgressBar progressBar) {
        this.f731b = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f732c;
    }

    public void c(AttributeSet attributeSet, int i2) {
        u0 u0VarV = u0.v(this.f731b.getContext(), attributeSet, f730a, i2, 0);
        Drawable drawableH = u0VarV.h(0);
        if (drawableH != null) {
            this.f731b.setIndeterminateDrawable(e(drawableH));
        }
        Drawable drawableH2 = u0VarV.h(1);
        if (drawableH2 != null) {
            this.f731b.setProgressDrawable(d(drawableH2, false));
        }
        u0VarV.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable d(Drawable drawable, boolean z) {
        if (drawable instanceof a.i.j.l.c) {
            a.i.j.l.c cVar = (a.i.j.l.c) drawable;
            Drawable drawableB = cVar.b();
            if (drawableB != null) {
                cVar.a(d(drawableB, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = d(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f732c == null) {
                    this.f732c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            Drawable drawableD = d(animationDrawable.getFrame(i2), true);
            drawableD.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i2));
        }
        animationDrawable2.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
        return animationDrawable2;
    }
}
