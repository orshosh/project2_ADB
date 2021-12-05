package Entities;

import java.util.Objects;

public class Mediaitems {
    private int mid;
    private String title;
    private Long prodYear;
    private Long titleLength;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getProdYear() {
        return prodYear;
    }

    public void setProdYear(Long prodYear) {
        this.prodYear = prodYear;
    }

    public Long getTitleLength() {
        return titleLength;
    }

    public void setTitleLength(Long titleLength) {
        this.titleLength = titleLength;
    }

    @Override
    public String toString() {
        return "Mediaitems{" +
                "mid=" + mid +
                ", title='" + title + '\'' +
                ", prodYear=" + prodYear +
                ", titleLength=" + titleLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mediaitems that = (Mediaitems) o;
        return mid == that.mid &&
                Objects.equals(title, that.title) &&
                Objects.equals(prodYear, that.prodYear) &&
                Objects.equals(titleLength, that.titleLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, title, prodYear, titleLength);
    }
}
