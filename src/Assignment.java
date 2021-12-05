import Entities.Users;
import org.hibernate.Session;
import hib.HibernateUtil;

import java.util.List;

public class Assignment {

    public static boolean isExistUsername(String username) {
        try {
            Session session = HibernateUtil.currentSession();
            String hqlQuery = "from Users";
            List<Users> items = session.createQuery(hqlQuery).list();
            for (Users i : items) {
                if (i.getUsername().equals(username)) {
                    return true;
                }
            }

            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
        }
}
