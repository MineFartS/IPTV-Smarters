package a.b.q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextClassifier f789b;

    public v(TextView textView) {
        this.f788a = (TextView) a.i.q.i.e(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f789b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f788a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f789b = textClassifier;
    }
}
