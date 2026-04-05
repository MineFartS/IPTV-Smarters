package c.f.a.d.i0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14858a = new int[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f14859b = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f14860c = new int[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f14861d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f14862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f14863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f14864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f14868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f14869l;

    public a() {
        this(DefaultRenderer.BACKGROUND_COLOR);
    }

    public a(int i2) {
        this.f14868k = new Path();
        this.f14869l = new Paint();
        this.f14862e = new Paint();
        d(i2);
        this.f14869l.setColor(0);
        Paint paint = new Paint(4);
        this.f14863f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14864g = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f14868k;
        if (z) {
            int[] iArr = f14860c;
            iArr[0] = 0;
            iArr[1] = this.f14867j;
            iArr[2] = this.f14866i;
            iArr[3] = this.f14865h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f14860c;
            iArr2[0] = 0;
            iArr2[1] = this.f14865h;
            iArr2[2] = this.f14866i;
            iArr2[3] = this.f14867j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = f14861d;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.f14863f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f14860c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f14869l);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f14863f);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f14858a;
        iArr[0] = this.f14867j;
        iArr[1] = this.f14866i;
        iArr[2] = this.f14865h;
        Paint paint = this.f14864g;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f14859b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f14864g);
        canvas.restore();
    }

    public Paint c() {
        return this.f14862e;
    }

    public void d(int i2) {
        this.f14865h = a.i.j.a.m(i2, 68);
        this.f14866i = a.i.j.a.m(i2, 20);
        this.f14867j = a.i.j.a.m(i2, 0);
        this.f14862e.setColor(this.f14865h);
    }
}
