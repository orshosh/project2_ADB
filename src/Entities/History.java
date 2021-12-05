package Entities;

import java.sql.Timestamp;
import java.util.Objects;

public class History {
    private long userid;
    private int mid;
    private Timestamp viewtime;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Timestamp getViewtime() {
        return viewtime;
    }

    public void setViewtime(Timestamp viewtime) {
        this.viewtime = viewtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return userid == history.userid &&
                mid == history.mid &&
                Objects.equals(viewtime, history.viewtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, mid, viewtime);
    }
}
