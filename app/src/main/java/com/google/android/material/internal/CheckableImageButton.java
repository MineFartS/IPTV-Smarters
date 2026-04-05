package com.google.android.material.internal;

import a.b.q.l;
import a.i.r.g0.c;
import a.i.r.x;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends l implements Checkable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f24492d = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24495g;

    public class a extends a.i.r.a {
        public a() {
        }

        @Override // a.i.r.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // a.i.r.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.V(CheckableImageButton.this.a());
            cVar.W(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends a.k.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24497d;

        public static class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel) {
            this.f24497d = parcel.readInt() == 1;
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f24497d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.E);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24494f = true;
        this.f24495g = true;
        x.p0(this, new a());
    }

    public boolean a() {
        return this.f24494f;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24493e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (!this.f24493e) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f24492d;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.b());
        setChecked(bVar.f24497d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f24497d = this.f24493e;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f24494f != z) {
            this.f24494f = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f24494f || this.f24493e == z) {
            return;
        }
        this.f24493e = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f24495g = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f24495g) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f24493e);
    }
}
