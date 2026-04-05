package a.c0.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class b extends g implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0016b f1053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f1054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArgbEvaluator f1055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator.AnimatorListener f1056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<?> f1057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable.Callback f1058h;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: a.c0.a.a.b$b, reason: collision with other inner class name */
    public static class C0016b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f1061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnimatorSet f1062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Animator> f1063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a.f.a<Animator, String> f1064e;

        public C0016b(Context context, C0016b c0016b, Drawable.Callback callback, Resources resources) {
            if (c0016b != null) {
                this.f1060a = c0016b.f1060a;
                h hVar = c0016b.f1061b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f1061b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = (h) this.f1061b.mutate();
                    this.f1061b = hVar2;
                    hVar2.setCallback(callback);
                    this.f1061b.setBounds(c0016b.f1061b.getBounds());
                    this.f1061b.h(false);
                }
                ArrayList<Animator> arrayList = c0016b.f1063d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1063d = new ArrayList<>(size);
                    this.f1064e = new a.f.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0016b.f1063d.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = c0016b.f1064e.get(animator);
                        animatorClone.setTarget(this.f1061b.d(str));
                        this.f1063d.add(animatorClone);
                        this.f1064e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f1062c == null) {
                this.f1062c = new AnimatorSet();
            }
            this.f1062c.playTogether(this.f1063d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1060a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f1065a;

        public c(Drawable.ConstantState constantState) {
            this.f1065a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1065a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1065a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f1065a.newDrawable();
            bVar.f1070b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f1058h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f1065a.newDrawable(resources);
            bVar.f1070b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f1058h);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f1065a.newDrawable(resources, theme);
            bVar.f1070b = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f1058h);
            return bVar;
        }
    }

    public b() {
        this(null, null, null);
    }

    public b(Context context) {
        this(context, null, null);
    }

    public b(Context context, C0016b c0016b, Resources resources) {
        this.f1055e = null;
        this.f1056f = null;
        this.f1057g = null;
        a aVar = new a();
        this.f1058h = aVar;
        this.f1054d = context;
        if (c0016b != null) {
            this.f1053c = c0016b;
        } else {
            this.f1053c = new C0016b(context, c0016b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f1053c.f1061b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0016b c0016b = this.f1053c;
        if (c0016b.f1063d == null) {
            c0016b.f1063d = new ArrayList<>();
            this.f1053c.f1064e = new a.f.a<>();
        }
        this.f1053c.f1063d.add(animator);
        this.f1053c.f1064e.put(animator, str);
    }

    public final void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1055e == null) {
                    this.f1055e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1055e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            return a.i.j.l.a.b(drawable);
        }
        return false;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1053c.f1061b.draw(canvas);
        if (this.f1053c.f1062c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.d(drawable) : this.f1053c.f1061b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1053c.f1060a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.e(drawable) : this.f1053c.f1061b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1070b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1070b.getConstantState());
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1053c.f1061b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1053c.f1061b.getIntrinsicWidth();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getOpacity() : this.f1053c.f1061b.getOpacity();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = a.i.i.e.g.s(resources, theme, attributeSet, a.c0.a.a.a.f1045e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h hVarB = h.b(resources, resourceId, theme);
                        hVarB.h(false);
                        hVarB.setCallback(this.f1058h);
                        h hVar = this.f1053c.f1061b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f1053c.f1061b = hVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.c0.a.a.a.f1046f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1054d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f1053c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.h(drawable) : this.f1053c.f1061b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1070b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1053c.f1062c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.isStateful() : this.f1053c.f1061b.isStateful();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1053c.f1061b.setBounds(rect);
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.setLevel(i2) : this.f1053c.f1061b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.setState(iArr) : this.f1053c.f1061b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f1053c.f1061b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.j(drawable, z);
        } else {
            this.f1053c.f1061b.setAutoMirrored(z);
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1053c.f1061b.setColorFilter(colorFilter);
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTint(int i2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.n(drawable, i2);
        } else {
            this.f1053c.f1061b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.o(drawable, colorStateList);
        } else {
            this.f1053c.f1061b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.p(drawable, mode);
        } else {
            this.f1053c.f1061b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1053c.f1061b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f1053c.f1062c.isStarted()) {
                return;
            }
            this.f1053c.f1062c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1053c.f1062c.end();
        }
    }
}
