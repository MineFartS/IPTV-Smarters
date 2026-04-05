package androidx.preference;

import a.x.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context U;
    public final ArrayAdapter V;
    public Spinner W;
    public final AdapterView.OnItemSelectedListener X;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String string = DropDownPreference.this.S()[i2].toString();
                if (string.equals(DropDownPreference.this.T()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.V(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3752c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.X = new a();
        this.U = context;
        this.V = W();
        X();
    }

    @Override // androidx.preference.Preference
    public void B() {
        super.B();
        ArrayAdapter arrayAdapter = this.V;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void D() {
        this.W.performClick();
    }

    public ArrayAdapter W() {
        return new ArrayAdapter(this.U, R.layout.simple_spinner_dropdown_item);
    }

    public final void X() {
        this.V.clear();
        if (Q() != null) {
            for (CharSequence charSequence : Q()) {
                this.V.add(charSequence.toString());
            }
        }
    }
}
