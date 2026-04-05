package c.f.a.c.j.c;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: loaded from: classes2.dex */
public final class tc<FieldDescriptorType> extends uc<FieldDescriptorType, Object> {
    public tc(int i2) {
        super(i2, null);
    }

    @Override // c.f.a.c.j.c.uc
    public final void m() {
        if (!b()) {
            for (int i2 = 0; i2 < n(); i2++) {
                Map.Entry<FieldDescriptorType, Object> entryI = i(i2);
                if (((ka) entryI.getKey()).j()) {
                    entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                if (((ka) entry.getKey()).j()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.m();
    }
}
