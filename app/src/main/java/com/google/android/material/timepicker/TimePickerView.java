package com.google.android.material.timepicker;

import a.i.r.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.a.d.h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {
    public final ClockHandView A;
    public final ClockFaceView B;
    public final MaterialButtonToggleGroup C;
    public final View.OnClickListener D;
    public f E;
    public g F;
    public e G;
    public final Chip y;
    public final Chip z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.F != null) {
                TimePickerView.this.F.a(((Integer) view.getTag(c.f.a.d.f.G)).intValue());
            }
        }
    }

    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
            int i3 = i2 == c.f.a.d.f.f14790i ? 1 : 0;
            if (TimePickerView.this.E == null || !z) {
                return;
            }
            TimePickerView.this.E.a(i3);
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.G != null) {
                TimePickerView.this.G.a();
            }
            return zOnDoubleTap;
        }
    }

    public class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f24612b;

        public d(GestureDetector gestureDetector) {
            this.f24612b = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f24612b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface e {
        void a();
    }

    public interface f {
        void a(int i2);
    }

    public interface g {
        void a(int i2);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.D = new a();
        LayoutInflater.from(context).inflate(h.f14837k, this);
        this.B = (ClockFaceView) findViewById(c.f.a.d.f.f14788g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(c.f.a.d.f.f14791j);
        this.C = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.y = (Chip) findViewById(c.f.a.d.f.f14794m);
        this.z = (Chip) findViewById(c.f.a.d.f.f14792k);
        this.A = (ClockHandView) findViewById(c.f.a.d.f.f14789h);
        x();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            y();
        }
    }

    public final void w() {
        Chip chip = this.y;
        int i2 = c.f.a.d.f.G;
        chip.setTag(i2, 12);
        this.z.setTag(i2, 10);
        this.y.setOnClickListener(this.D);
        this.z.setOnClickListener(this.D);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.y.setOnTouchListener(dVar);
        this.z.setOnTouchListener(dVar);
    }

    public final void y() {
        if (this.C.getVisibility() == 0) {
            a.g.c.d dVar = new a.g.c.d();
            dVar.g(this);
            dVar.e(c.f.a.d.f.f14787f, x.C(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }
}
