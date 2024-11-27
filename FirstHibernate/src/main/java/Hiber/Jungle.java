package Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Jungle {

	public static void main(String[] args) {
//		Logger.getLogger("org.hibernate").setLevel(Level.OFF);

		Configuration c = new Configuration();

		c.configure("hn.cfg.xml");
		c.addAnnotatedClass(Bird.class);

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Bird b = new Bird();
		b.setId(103);
		b.setName("Peacock");
		b.setColor("blue");
		b.setFood("fruit");

		s.save(b);

		t.commit();

		System.out.println("Bird Saved!");

	}
}
