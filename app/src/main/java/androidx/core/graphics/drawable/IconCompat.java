package androidx.core.graphics.drawable;

import a.i.i.e.f;
import a.i.j.l.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PorterDuff.Mode f4361a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f4364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable f4365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f4368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f4369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4371k;

    public IconCompat() {
        this.f4362b = -1;
        this.f4364d = null;
        this.f4365e = null;
        this.f4366f = 0;
        this.f4367g = 0;
        this.f4368h = null;
        this.f4369i = f4361a;
        this.f4370j = null;
    }

    public IconCompat(int i2) {
        this.f4362b = -1;
        this.f4364d = null;
        this.f4365e = null;
        this.f4366f = 0;
        this.f4367g = 0;
        this.f4368h = null;
        this.f4369i = f4361a;
        this.f4370j = null;
        this.f4362b = i2;
    }

    public static Bitmap c(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(DefaultRenderer.BACKGROUND_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4363c = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Context context, int i2) {
        if (context != null) {
            return f(context.getResources(), context.getPackageName(), i2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat f(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4366f = i2;
        if (resources != null) {
            try {
                iconCompat.f4363c = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4363c = str;
        }
        iconCompat.f4371k = str;
        return iconCompat;
    }

    public static int i(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public static String k(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static Resources l(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    public static int n(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    public static Uri p(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public static String x(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public void b(Context context) {
        Object obj;
        if (this.f4362b != 2 || (obj = this.f4363c) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strJ = j();
            int identifier = l(context, strJ).getIdentifier(str4, str3, str5);
            if (this.f4366f != identifier) {
                Log.i("IconCompat", "Id has changed for " + strJ + " " + str);
                this.f4366f = identifier;
            }
        }
    }

    public Bitmap g() {
        int i2 = this.f4362b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f4363c;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.f4363c;
        }
        if (i2 == 5) {
            return c((Bitmap) this.f4363c, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int h() {
        int i2 = this.f4362b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return i((Icon) this.f4363c);
        }
        if (i2 == 2) {
            return this.f4366f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String j() {
        int i2 = this.f4362b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return k((Icon) this.f4363c);
        }
        if (i2 == 2) {
            return TextUtils.isEmpty(this.f4371k) ? ((String) this.f4363c).split(":", -1)[0] : this.f4371k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i2 = this.f4362b;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : n((Icon) this.f4363c);
    }

    public Uri o() {
        int i2 = this.f4362b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return p((Icon) this.f4363c);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f4363c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream q(Context context) {
        StringBuilder sb;
        String str;
        Uri uriO = o();
        String scheme = uriO.getScheme();
        if ("content".equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriO);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f4363c));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriO);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public Drawable r(Context context) {
        b(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return w(context).loadDrawable(context);
        }
        Drawable drawableS = s(context);
        if (drawableS != null && (this.f4368h != null || this.f4369i != f4361a)) {
            drawableS.mutate();
            a.o(drawableS, this.f4368h);
            a.p(drawableS, this.f4369i);
        }
        return drawableS;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Drawable s(Context context) {
        switch (this.f4362b) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f4363c);
            case 2:
                String strJ = j();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = context.getPackageName();
                }
                try {
                    return f.a(l(context, strJ), this.f4366f, context.getTheme());
                } catch (RuntimeException e2) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f4366f), this.f4363c), e2);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f4363c, this.f4366f, this.f4367g));
            case 4:
                InputStream inputStreamQ = q(context);
                if (inputStreamQ != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamQ));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), c((Bitmap) this.f4363c, false));
            case 6:
                InputStream inputStreamQ2 = q(context);
                if (inputStreamQ2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamQ2))) : new BitmapDrawable(context.getResources(), c(BitmapFactory.decodeStream(inputStreamQ2), false));
                }
                return null;
            default:
                return null;
        }
    }

    public void t() {
        Parcelable parcelable;
        this.f4369i = PorterDuff.Mode.valueOf(this.f4370j);
        switch (this.f4362b) {
            case -1:
                parcelable = this.f4365e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f4365e;
                if (parcelable == null) {
                    byte[] bArr = this.f4364d;
                    this.f4363c = bArr;
                    this.f4362b = 3;
                    this.f4366f = 0;
                    this.f4367g = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4364d, Charset.forName("UTF-16"));
                this.f4363c = str;
                if (this.f4362b == 2 && this.f4371k == null) {
                    this.f4371k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4363c = this.f4364d;
                return;
        }
        this.f4363c = parcelable;
    }

    public String toString() {
        int height;
        if (this.f4362b == -1) {
            return String.valueOf(this.f4363c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(x(this.f4362b));
        switch (this.f4362b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4363c).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f4363c).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4371k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4366f);
                if (this.f4367g != 0) {
                    sb.append(" off=");
                    height = this.f4367g;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4363c);
                break;
        }
        if (this.f4368h != null) {
            sb.append(" tint=");
            sb.append(this.f4368h);
        }
        if (this.f4369i != f4361a) {
            sb.append(" mode=");
            sb.append(this.f4369i);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(boolean z) {
        this.f4370j = this.f4369i.name();
        switch (this.f4362b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f4363c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f4364d = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f4364d = ((String) this.f4363c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4364d = (byte[]) this.f4363c;
                return;
            case 4:
            case 6:
                this.f4364d = this.f4363c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f4365e = (Parcelable) this.f4363c;
    }

    @Deprecated
    public Icon v() {
        return w(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0 >= 26) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Icon w(android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.w(android.content.Context):android.graphics.drawable.Icon");
    }
}
