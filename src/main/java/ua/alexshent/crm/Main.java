package ua.alexshent.crm;


public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.entityManager.getTransaction().begin();

        new Seeder(demo.entityManager).seed();
        demo.createEntities();

        if (demo.entityManager.getTransaction().isActive()) {
            demo.entityManager.getTransaction().commit();
        }
        demo.entityManager.close();
    }
}
