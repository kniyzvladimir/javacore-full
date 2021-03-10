package lesson11.homeWork;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room r1 = new Room(1, 200, 2, new Date(2021 / 04 / 20), "Plaza", "Odesa");
        Room r2 = new Room(2, 400, 3, new Date(2021 / 04 / 20), "Plaza", "Odesa");
        Room r3 = new Room(3, 600, 2, new Date(2021 / 04 / 20), "Plaza", "Odesa");
        Room r4 = new Room(4, 800, 4, new Date(2021 / 04 / 20), "Plaza", "Odesa");
        Room r5 = new Room(5, 1000, 2, new Date(2021 / 04 / 20), "Plaza", "Odesa");
        Room r6 = new Room(6, 250, 2, new Date(2021 / 05 / 20), "Mozart", "Odesa");
        Room r7 = new Room(7, 350, 3, new Date(2021 / 05 / 20), "Mozart", "Odesa");
        Room r8 = new Room(8, 500, 4, new Date(2021 / 05 / 20), "Mozart", "Odesa");
        Room r9 = new Room(9, 1000, 2, new Date(2021 / 05 / 20), "Mozart", "Odesa");
        Room r10 = new Room(10, 1500, 6, new Date(2021 / 05 / 20), "Mozart", "Odesa");
        Room r11 = new Room(11, 100, 1, new Date(2021 / 03 / 12), "Vokzal", "Odesa");
        Room r12 = new Room(12, 200, 2, new Date(2021 / 03 / 12), "Vokzal", "Odesa");
        Room r13 = new Room(13, 300, 3, new Date(2021 / 03 / 12), "Vokzal", "Odesa");
        Room r14 = new Room(14, 400, 4, new Date(2021 / 03 / 12), "Vokzal", "Odesa");
        Room r15 = new Room(15, 500, 5, new Date(2021 / 03 / 12), "Vokzal", "Odesa");
        Room r16 = new Room(16, 600, 6, new Date(2021 / 03 / 12), "Vokzal", "Odesa");

        Room[] rooms1 = {null, r2, r4, r6, r8, null, r10, r12, r14, r16};
        Room[] rooms2 = {null, r1, r3, r5, r7, null, r9, r11, r13, r15, r8};
        Room[] rooms3 = new Room[3];
        API a1 = new BookingComAPI(rooms1);
        API a2 = new TripAdvisorAPI(rooms2);
        API a3 = new GoogleAPI(rooms3);
        API[] apis = {a1, a2, a3};
        Controller c1 = new Controller(apis);

        System.out.println(c1.cheapestRoom().getId());
        System.out.println(c1.check(a1, a2));
        System.out.println(c1.requestRooms(300, 3, "Odesa", "Vokzal"));

    }
}
