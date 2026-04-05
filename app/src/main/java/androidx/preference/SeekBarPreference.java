package androidx.preference;

import a.x.c;
import a.x.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public SeekBar O;
    public TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public SeekBar.OnSeekBarChangeListener T;
    public View.OnKeyListener U;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.S || !seekBarPreference.N) {
                    seekBarPreference.S(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.T(i2 + seekBarPreference2.K);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.N = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.N = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.K != seekBarPreference.J) {
                seekBarPreference.S(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.Q && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.O;
            if (seekBar != null) {
                return seekBar.onKeyDown(i2, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3757h);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.T = new a();
        this.U = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.o1, i2, i3);
        this.K = typedArrayObtainStyledAttributes.getInt(g.r1, 0);
        P(typedArrayObtainStyledAttributes.getInt(g.p1, 100));
        Q(typedArrayObtainStyledAttributes.getInt(g.s1, 0));
        this.Q = typedArrayObtainStyledAttributes.getBoolean(g.q1, true);
        this.R = typedArrayObtainStyledAttributes.getBoolean(g.t1, false);
        this.S = typedArrayObtainStyledAttributes.getBoolean(g.u1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object F(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    public final void P(int i2) {
        int i3 = this.K;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.L) {
            this.L = i2;
            B();
        }
    }

    public final void Q(int i2) {
        if (i2 != this.M) {
            this.M = Math.min(this.L - this.K, Math.abs(i2));
            B();
        }
    }

    public final void R(int i2, boolean z) {
        int i3 = this.K;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.L;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.J) {
            this.J = i2;
            T(i2);
            K(i2);
            if (z) {
                B();
            }
        }
    }

    public void S(SeekBar seekBar) {
        int progress = this.K + seekBar.getProgress();
        if (progress != this.J) {
            if (a(Integer.valueOf(progress))) {
                R(progress, false);
            } else {
                seekBar.setProgress(this.J - this.K);
                T(this.J);
            }
        }
    }

    public void T(int i2) {
        TextView textView = this.P;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }
}
