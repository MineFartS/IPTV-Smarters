package com.amplifyframework.datastore.events;

import a.i.q.d;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ModelSyncedEvent implements HubEvent.Data<ModelSyncedEvent> {
    private final int added;
    private final int deleted;
    private final boolean isDeltaSync;
    private final boolean isFullSync;
    private final String model;
    private final int updated;

    public ModelSyncedEvent(String str, boolean z, int i2, int i3, int i4) {
        this.added = i2;
        this.updated = i3;
        this.deleted = i4;
        this.model = str;
        this.isFullSync = z;
        this.isDeltaSync = !z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSyncedEvent.class != obj.getClass()) {
            return false;
        }
        ModelSyncedEvent modelSyncedEvent = (ModelSyncedEvent) obj;
        if (d.a(this.model, modelSyncedEvent.model) && d.a(Boolean.valueOf(this.isFullSync), Boolean.valueOf(modelSyncedEvent.isFullSync)) && d.a(Boolean.valueOf(this.isDeltaSync), Boolean.valueOf(modelSyncedEvent.isDeltaSync)) && d.a(Integer.valueOf(this.added), Integer.valueOf(modelSyncedEvent.added)) && d.a(Integer.valueOf(this.updated), Integer.valueOf(modelSyncedEvent.updated))) {
            return d.a(Integer.valueOf(this.deleted), Integer.valueOf(modelSyncedEvent.deleted));
        }
        return false;
    }

    public int getAdded() {
        return this.added;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public String getModel() {
        return this.model;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        String str = this.model;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + Boolean.valueOf(this.isFullSync).hashCode()) * 31) + Boolean.valueOf(this.isDeltaSync).hashCode()) * 31) + Integer.valueOf(this.added).intValue()) * 31) + Integer.valueOf(this.updated).intValue()) * 31) + Integer.valueOf(this.deleted).intValue();
    }

    public boolean isDeltaSync() {
        return this.isDeltaSync;
    }

    public boolean isFullSync() {
        return this.isFullSync;
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<ModelSyncedEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.MODEL_SYNCED, this);
    }

    public String toString() {
        return "ModelSyncedEvent{model=" + this.model + ", isFullSync=" + this.isFullSync + ", isDeltaSync=" + this.isDeltaSync + ", added=" + this.added + ", updated=" + this.updated + ", deleted=" + this.deleted + '}';
    }
}
