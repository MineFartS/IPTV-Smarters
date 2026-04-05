package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.ImageFeature;

/* JADX INFO: loaded from: classes.dex */
public final class Cell extends ImageFeature<String> {
    private final int column;
    private final int row;
    private final boolean selected;

    public static final class Builder extends ImageFeature.Builder<Builder, Cell, String> {
        private int column;
        private int row;
        private boolean selected;

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Cell build() {
            return new Cell(this);
        }

        public Builder column(int i2) {
            this.column = i2;
            return this;
        }

        public int getColumn() {
            return this.column;
        }

        public int getRow() {
            return this.row;
        }

        public boolean getSelected() {
            return this.selected;
        }

        public Builder row(int i2) {
            this.row = i2;
            return this;
        }

        public Builder selected(boolean z) {
            this.selected = z;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder text(String str) {
            return (Builder) value(str);
        }
    }

    private Cell(Builder builder) {
        super(builder);
        this.selected = builder.getSelected();
        this.row = builder.getRow();
        this.column = builder.getColumn();
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    public String getText() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.CELL.getAlias();
    }

    public boolean isSelected() {
        return this.selected;
    }
}
