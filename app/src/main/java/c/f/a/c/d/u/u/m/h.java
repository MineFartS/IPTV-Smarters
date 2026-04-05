package c.f.a.c.d.u.u.m;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12108a = new c.f.a.c.d.v.b("WidgetUtil");

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @TargetApi(17)
    public static Bitmap a(Context context, Bitmap bitmap, float f2, float f3) {
        c.f.a.c.d.v.b bVar = f12108a;
        bVar.a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int iRound = Math.round(bitmap.getWidth() * 0.25f);
        int iRound2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, bitmapCreateScaledBitmap.getConfig());
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(7.5f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        bVar.a("End blurring bitmap %s, original width = %d, original height = %d.", bitmapCreateScaledBitmap, Integer.valueOf(iRound), Integer.valueOf(iRound2));
        return bitmapCreateBitmap;
    }

    public static Drawable b(Context context, int i2, int i3) {
        return c(context, i2, i3, R.attr.colorForeground, 0);
    }

    public static Drawable c(Context context, int i2, int i3, int i4, int i5) {
        int iD;
        ColorStateList colorStateList;
        Drawable drawableR = a.i.j.l.a.r(context.getResources().getDrawable(i3).mutate());
        a.i.j.l.a.p(drawableR, PorterDuff.Mode.SRC_IN);
        if (i2 != 0) {
            colorStateList = a.i.i.b.e(context, i2);
        } else {
            if (i4 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
                iD = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                iD = a.i.i.b.d(context, i5);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iD, a.i.j.a.m(iD, 128)});
        }
        a.i.j.l.a.o(drawableR, colorStateList);
        return drawableR;
    }

    public static Drawable d(Context context, int i2, int i3) {
        return c(context, i2, i3, 0, R.color.white);
    }
}
