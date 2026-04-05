package com.amplifyframework.predictions.operation;

import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.predictions.models.IdentifyAction;

/* JADX INFO: loaded from: classes.dex */
public abstract class IdentifyOperation<R> extends AmplifyOperation<R> {
    private final IdentifyAction identifyAction;

    public IdentifyOperation(IdentifyAction identifyAction, R r) {
        super(CategoryType.PREDICTIONS, r);
        identifyAction.getClass();
        this.identifyAction = identifyAction;
    }

    public IdentifyAction getIdentifyAction() {
        return this.identifyAction;
    }
}
