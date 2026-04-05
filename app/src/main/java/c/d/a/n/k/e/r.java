package c.d.a.n.k.e;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, int i2, int i3) {
        float width;
        float height;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3) {
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap2.getWidth() * i3 > bitmap2.getHeight() * i2) {
            width = i3 / bitmap2.getHeight();
            width2 = (i2 - (bitmap2.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap2.getWidth();
            height = (i3 - (bitmap2.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i2, i3, d(bitmap2));
        }
        g(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }

    public static Bitmap b(Bitmap bitmap, c.d.a.n.i.n.c cVar, int i2, int i3) {
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
        int width = (int) (bitmap.getWidth() * fMin);
        int height = (int) (bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap.Config configD = d(bitmap);
        Bitmap bitmapB = cVar.b(width, height, configD);
        if (bitmapB == null) {
            bitmapB = Bitmap.createBitmap(width, height, configD);
        }
        g(bitmap, bitmapB);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i2 + "x" + i3);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapB.getWidth() + "x" + bitmapB.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v("TransformationUtils", sb.toString());
        }
        Canvas canvas = new Canvas(bitmapB);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return bitmapB;
    }

    public static int c(int i2) {
        switch (i2) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap.Config d(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void e(int i2, Matrix matrix) {
        switch (i2) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    public static Bitmap f(Bitmap bitmap, c.d.a.n.i.n.c cVar, int i2) {
        Matrix matrix = new Matrix();
        e(i2, matrix);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        Bitmap.Config configD = d(bitmap);
        Bitmap bitmapB = cVar.b(iRound, iRound2, configD);
        if (bitmapB == null) {
            bitmapB = Bitmap.createBitmap(iRound, iRound2, configD);
        }
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(bitmapB).drawBitmap(bitmap, matrix, new Paint(6));
        return bitmapB;
    }

    @TargetApi(12)
    public static void g(Bitmap bitmap, Bitmap bitmap2) {
        if (Build.VERSION.SDK_INT < 12 || bitmap2 == null) {
            return;
        }
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
