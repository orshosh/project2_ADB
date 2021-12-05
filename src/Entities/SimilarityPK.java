package Entities;

import java.io.Serializable;
import java.util.Objects;

public class SimilarityPK implements Serializable {
    private int mid1;
    private int mid2;

    public int getMid1() {
        return mid1;
    }

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimilarityPK that = (SimilarityPK) o;
        return mid1 == that.mid1 &&
                mid2 == that.mid2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid1, mid2);
    }
}
