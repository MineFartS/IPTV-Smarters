package a.b.k;

import a.b.q.q;
import a.b.q.r0;
import a.b.q.s;
import a.b.q.u;
import a.b.q.y;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?>[] f197a = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f198b = {R.attr.onClick};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f199c = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.f.i<String, Constructor<? extends View>> f200d = new a.f.i<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f201e = new Object[2];

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Context f205e;

        public a(View view, String str) {
            this.f202b = view;
            this.f203c = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f203c, View.class)) != null) {
                        this.f204d = method;
                        this.f205e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f202b.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f202b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f203c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f202b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f204d == null) {
                a(this.f202b.getContext());
            }
            try {
                this.f204d.invoke(this.f205e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.W3, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(a.b.j.X3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a.b.j.Y3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof a.b.p.d) && ((a.b.p.d) context).c() == resourceId) ? context : new a.b.p.d(context, resourceId) : context;
    }

    public final void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || x.P(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f198b);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public a.b.q.d b(Context context, AttributeSet attributeSet) {
        return new a.b.q.d(context, attributeSet);
    }

    public a.b.q.f c(Context context, AttributeSet attributeSet) {
        return new a.b.q.f(context, attributeSet);
    }

    public AppCompatCheckBox d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public a.b.q.g e(Context context, AttributeSet attributeSet) {
        return new a.b.q.g(context, attributeSet);
    }

    public a.b.q.j f(Context context, AttributeSet attributeSet) {
        return new a.b.q.j(context, attributeSet);
    }

    public a.b.q.l g(Context context, AttributeSet attributeSet) {
        return new a.b.q.l(context, attributeSet);
    }

    public AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public a.b.q.n i(Context context, AttributeSet attributeSet) {
        return new a.b.q.n(context, attributeSet);
    }

    public AppCompatRadioButton j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public q k(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    public s l(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public y o(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewK;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = r0.b(context2);
        }
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b2 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b2 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b2 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b2 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b2 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b2 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b2 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b2 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b2 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b2 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b2 = 10;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    b2 = 11;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b2 = 12;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
        }
        switch (b2) {
            case 0:
                viewK = k(context2, attributeSet);
                u(viewK, str);
                break;
            case 1:
                viewK = e(context2, attributeSet);
                u(viewK, str);
                break;
            case 2:
                viewK = i(context2, attributeSet);
                u(viewK, str);
                break;
            case 3:
                viewK = n(context2, attributeSet);
                u(viewK, str);
                break;
            case 4:
                viewK = g(context2, attributeSet);
                u(viewK, str);
                break;
            case 5:
                viewK = l(context2, attributeSet);
                u(viewK, str);
                break;
            case 6:
                viewK = m(context2, attributeSet);
                u(viewK, str);
                break;
            case 7:
                viewK = j(context2, attributeSet);
                u(viewK, str);
                break;
            case 8:
                viewK = o(context2, attributeSet);
                u(viewK, str);
                break;
            case 9:
                viewK = h(context2, attributeSet);
                u(viewK, str);
                break;
            case 10:
                viewK = b(context2, attributeSet);
                u(viewK, str);
                break;
            case 11:
                viewK = d(context2, attributeSet);
                u(viewK, str);
                break;
            case 12:
                viewK = f(context2, attributeSet);
                u(viewK, str);
                break;
            case 13:
                viewK = c(context2, attributeSet);
                u(viewK, str);
                break;
            default:
                viewK = p(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = s(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }

    public final View r(Context context, String str, String str2) {
        String str3;
        a.f.i<String, Constructor<? extends View>> iVar = f200d;
        Constructor<? extends View> constructor = iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f197a);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f201e);
    }

    public final View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Name.LABEL);
        }
        try {
            Object[] objArr = this.f201e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f199c;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewR = r(context, str, strArr[i2]);
                if (viewR != null) {
                    return viewR;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f201e;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
